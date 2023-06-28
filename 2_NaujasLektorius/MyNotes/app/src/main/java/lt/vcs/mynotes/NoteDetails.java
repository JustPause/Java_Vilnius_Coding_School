package lt.vcs.mynotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import lt.vcs.mynotes.repo.Note;

public class NoteDetails extends AppCompatActivity {
	
	private TextView noteIdTextView;
	private EditText noteNameEditText;
	private EditText noteContentEditText;
	private TextView noteCreationDateTextView;
	private TextView noteUpdateDateTextView;
	private Button saveButton;
	private Note note;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_note_details);
		
		int noteId = getIntent().getIntExtra("key_note_id", - 1);
		String noteName = getIntent().getStringExtra("key_note_name");
		
		noteIdTextView = findViewById(R.id.noteIdTextView);
		noteNameEditText = findViewById(R.id.noteNameEditText);
		
		noteIdTextView.setText(String.valueOf(noteId));
		noteNameEditText.setText(noteName);
	}
}