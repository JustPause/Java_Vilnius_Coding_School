package lt.vcs.mynotes.repo;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity (tableName = Note.ENTITY_NOTES_TABLE)
public class Note {
	
	public static final String ENTITY_NOTES_TABLE = "notes";
	
	@PrimaryKey (autoGenerate = true)
	private int id;
	@ColumnInfo (name = "note_name")
	private String name;
	@ColumnInfo (name = "note_text")
	private String noteText;
	@ColumnInfo (name = "note_creation_date")
	private LocalDateTime creationDate;
	@ColumnInfo (name = "note_update_date")
	private LocalDateTime updateDate;
	
	@Ignore
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH:mm:ss");
	
	public Note(String name, String noteText) {
		this.name = name;
		this.noteText = noteText;
		this.creationDate = LocalDateTime.now();
		this.updateDate = LocalDateTime.now();
	}
	
	@Ignore
	public Note(int id, String name, String noteText) {
		this.id = id;
		this.name = name;
		this.noteText = noteText;
		this.creationDate = LocalDateTime.now();
		this.updateDate = LocalDateTime.now();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		this.updateDate = LocalDateTime.now();
	}
	
	public String getNoteText() {
		return noteText;
	}
	
	public void setNoteText(String noteText) {
		this.noteText = noteText;
		this.updateDate = LocalDateTime.now();
	}
	
	public LocalDateTime getCreationDate() {
		return creationDate;
	}
	
	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}
	
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}
	
	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}
	
	@NonNull
	@Override
	public String toString() {
		return String.format(
			"id:%s | %s\n%s\n\t%s\n\t%s",
			this.id,
			this.name,
			this.noteText,
			this.creationDate.format(formatter),
			this.updateDate.format(formatter)
		);
	}
}
