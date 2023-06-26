package lt.justinas.mynotes;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public
class MainActivity
	extends AppCompatActivity {
	
	private ListView
		listView;
	private ArrayAdapter
		adapter;
	private List <String>
		list;
	private boolean
		isItemRemoved =
		true;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		list =
			Repository.getList();
		
		setUpListView();
		setListViewOnItemClick();
		setListViewOnLongItemClick();
	}
	
	private void setUpListView() {
		
		
		listView =
			findViewById(R.id.myListView);
		adapter =
			new ArrayAdapter(
				this,
				android.R.layout.simple_list_item_1,
				list);
		
		listView.setAdapter(adapter);
	}
	
	private void setListViewOnItemClick() {
		listView.setOnItemClickListener(
			new AdapterView.OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView <?> adapterView,
				                        View view,
				                        int position,
				                        long l) {
					Snackbar.make(listView,
							"Simple click" +
								list.get(position),
							Snackbar.LENGTH_INDEFINITE)
						.setAction("Ok",
							null)
						.show();
				}
			});
	}
	
	private void setListViewOnLongItemClick() {
		listView.setOnItemLongClickListener(
			new AdapterView.OnItemLongClickListener() {
				@Override
				public boolean onItemLongClick(AdapterView <?> adapterView,
				                               View view,
				                               int position,
				                               long l) {
					if (isItemRemoved) {
						
						AlertDialog.Builder alertdialog = new AlertDialog.Builder(MainActivity.this);
						
						alertdialog.setMessage("Ar tikrai norite istrinti?").setPositiveButton("Yes",onDialogAlertClickYes(position)).setNegativeButton("No",null).show();
						

					}
					return true;
				}
			}
		);
	}
	
	private DialogInterface.OnClickListener onDialogAlertClickYes(int position) {
		return new DialogInterface.OnClickListener() {
			@Override public void onClick(DialogInterface dialogInterface, int i) {
				isItemRemoved = false;
				
				
				String
					item = list.get(position);
				isItemRemoved = Repository.removeItem(item);
				adapter.notifyDataSetChanged();
				Snackbar.make(listView, "Long click" + item, Snackbar.LENGTH_LONG) .show();
			}
		};
	}
	
	
}