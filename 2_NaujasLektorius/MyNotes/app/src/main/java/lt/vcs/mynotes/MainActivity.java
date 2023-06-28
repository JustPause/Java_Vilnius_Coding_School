package lt.vcs.mynotes;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import lt.vcs.mynotes.repo.Note;

import java.util.List;


public class MainActivity extends AppCompatActivity {
	
	private ListView listView;
	private FloatingActionButton fab;
	private ArrayAdapter adapter;
	private List <Note> list;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		fab = findViewById(R.id.fab);
		
		Repository.generateNotesForLocalRepository(getApplicationContext());
		list = Repository.getList();
		
		setUpListView();
		setListViewOnItemClick();
		setListViewOnLongItemClick();
		setFabOnClick();
	}
	
	private void setUpListView() {
		listView = findViewById(R.id.myListView);
		
		adapter =
			new ArrayAdapter(
				this,
				android.R.layout.simple_list_item_1,
				list
			);
		
		listView.setAdapter(adapter);
	}
	
	private void setListViewOnItemClick() {
		listView.setOnItemClickListener(
			new AdapterView.OnItemClickListener() {
				@Override
				public void onItemClick(
					AdapterView <?> adapterView,
					View view,
					int position,
					long l
				) {
					
					Note note = (Note) adapterView.getItemAtPosition(position);
					
					Intent intent = new Intent(MainActivity.this, NoteDetails.class);
					intent.putExtra("key_note_id", note.getId());
					intent.putExtra("key_note_name", note.getName());
					startActivity(intent);
				}
			}
		);
	}
	
	private void setListViewOnLongItemClick() {
		listView.setOnItemLongClickListener(
			new AdapterView.OnItemLongClickListener() {
				@Override
				public boolean onItemLongClick(
					AdapterView <?> adapterView,
					View view,
					int position,
					long l
				) {
					
					AlertDialog.Builder alertDialog =
						new AlertDialog.Builder(MainActivity.this);
					alertDialog
						.setMessage("Ar tikrai norite istrinti?")
						.setPositiveButton("Yes", onYesClickDialogAlert(position))
						.setNegativeButton("No", null)
						.show();
					
					return true;
				}
			}
		);
	}
	
	private DialogInterface.OnClickListener onYesClickDialogAlert(int position) {
		return new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialogInterface, int i) {
				
				Note note = list.get(position);
				
				if (Repository.removeItem(note)) {
					adapter.notifyDataSetChanged();
					
					Snackbar.make(
						listView,
						"Removed item: " + note,
						Snackbar.LENGTH_LONG
					).show();
				}
			}
		};
	}
	
	private void setFabOnClick() {
		fab.setOnClickListener(
			new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					
					Intent intent = new Intent(MainActivity.this, NoteDetails.class);
					startActivity(intent);
				}
			}
		);
	}
}