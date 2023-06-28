package lt.vcs.mynotes.repo;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;


@Database (
	entities = { Note.class },
	version = Note.MAIN_DATABASE_VERSION,
	exportSchema = false
)
@TypeConverters ({ Converter.class })
public abstract class MainDatabase extends RoomDatabase {
	private static MainDatabase instance;
	public static final int MAIN_DATABASE_VERSION = 1;
	private static final int OLD_VERSION = Note.MAIN_DATABASE_VERSION - 1;
	
	public abstract NoteDao noteDao();
	
	public static MainDatabase getInstance(Context context) {
		
		if (instance == null) {
			instance =
				Room.databaseBuilder(
						context,
						MainDatabase.class,
						"main.db"
					)
					.allowMainThreadQueries()
					.fallbackToDestructiveMigration()
					.build();
		}
		
		return instance;
	}
}
