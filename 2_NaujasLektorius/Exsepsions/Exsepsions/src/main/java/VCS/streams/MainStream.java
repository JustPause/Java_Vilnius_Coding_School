package VCS.streams;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainStream {
	public static void main(String[] args) {

		List<String> sarasas = new ArrayList<>();
		sarasas.addAll(
				Arrays.asList("a5", "a9", "b0", "a12", "bc8a", "c5")
				//Hi
		);

		System.out.println(sarasas);

		sarasas.stream()
				.filter(element -> element.startsWith("a"))
				.map(bv -> bv + "_" + LocalDateTime.now())
				.map(element -> element.toUpperCase())
				.sorted(Comparator.naturalOrder())
				.forEach(System.out::println);


		List<String> NS = sarasas.stream()
				.filter(element -> element.startsWith("a"))
				.map(bv -> bv + "_" + LocalDateTime.now())
				.map(element -> element.toUpperCase())
				.sorted(Comparator.naturalOrder())
				.toList();

		System.out.println(NS);
	}
}

