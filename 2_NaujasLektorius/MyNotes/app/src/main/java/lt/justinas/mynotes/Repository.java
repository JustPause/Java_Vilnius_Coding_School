package lt.justinas.mynotes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public
class Repository {
	
	private static
	List <String>
		list =
		new ArrayList <>();
	
	public static List <String> getList() {
		if (list.isEmpty()) {
			list =
				new ArrayList <>(
					Arrays.asList(
						"Pirmadienis",
						"Antradienis",
						"Treciadienis",
						"Ketvirtadienis"
					)
				);
		}
		return list;
	}
	
	public static void setList(String item) {
		list.add(item);
	}
	
	public static boolean removeItem(String item) {
		return list.remove(item);
	}
}
