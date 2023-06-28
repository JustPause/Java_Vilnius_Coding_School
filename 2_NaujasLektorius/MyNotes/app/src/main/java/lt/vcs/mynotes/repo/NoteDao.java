package lt.vcs.mynotes.repo;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface NoteDao {
	@Query ("SELECT * FROM " + Note.ENTITY_NOTES_TABLE)
	List <Note> getAll();
	
	@Query ("SELECT * FROM " + Note.ENTITY_NOTES_TABLE + " WHERE note_id =:id")
	Note getItem(int id);
	
	@Insert (onConflict = OnConflictStrategy.REPLACE)
	void insertNotes(List <Note> notes);
	
	@Insert (onConflict = OnConflictStrategy.REPLACE)
	void insertNote(Note note);
	
	@Delete
	void deleteNote(Note note);
	
	@Delete
	void deleteNotes(List <Note> notes);
	
	@Query ("DELETE FROM " + Note.ENTITY_NOTES_TABLE + " WHERE note_id =:id")
	void deleteItem(int id);
}
