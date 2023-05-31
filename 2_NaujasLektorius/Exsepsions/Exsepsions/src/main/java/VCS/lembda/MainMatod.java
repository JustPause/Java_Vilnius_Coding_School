package VCS.lembda;

import java.util.Arrays;
import java.util.List;

public class MainMatod {
	public static void main(String[] args) {
		MyErrorMessige error = new MyErrorMessige() {
			@Override
			public void show(String message, int number) {
				System.out.println(message + " " + number);
			}

/*			@Override
			public String doSomefing() {
				return "rATATATA";
			}*/


		};

		error.show("hello!", 14);

		MyErrorMessige errorLambda = (textras, skaicius) -> {
			System.out.println(
					textras + " " + skaicius
			);
		};

		error.show("Laba", 1);

		List<String> vardai = Arrays.asList(
				"Jakaterina", "Zilvinas", "Justinas", "Andrius", "Nerimantas", "Laima", "Dailius"
		);

		System.out.println();

		for (String vardas : vardai) {
			System.out.println(vardas);
		}

		System.out.println();

		vardai.forEach(Agurkas::selsta);

		System.out.println();
		vardai.forEach(
				(vardas) -> {
					if (vardas.length() > 8) {
						System.out.println(vardas);
					}
				});
	}
}
