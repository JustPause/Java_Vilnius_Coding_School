package lt.vcs.mynotes;

import lt.vcs.mynotes.repo.Note;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Repository {
	
	private static List <Note> list = new ArrayList <>();
	private static boolean isDeleteInAction = false;
	
	public static void generateNotesForLocalRepository(Context context) {
		NoteDao noteDao = MainDatabase.getInstance(context).noteDao();
		list = noteDao.getAll();
		noteDao.insertNotes(getList());
	}
	
	public static void addItem(Note note) {
		list.add(note);
	}
	
	public static boolean removeItem(Note note) {
		
		boolean isRemoved = false;
		
		if (! isDeleteInAction) {
			isDeleteInAction = true;
			isRemoved = list.remove(note);
			isDeleteInAction = false;
		}
		
		return isRemoved;
	}
}
