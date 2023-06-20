package lt.justinas.springdemo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SKaiciaiServide {
	@Autowired
	private SkaiciaiRepo skaiciaiRepo;

	public List<Skaiciai> getAllSklaiciai() {
		return (List<Skaiciai>) skaiciaiRepo.findAll();
	}

	public String sumAtibuteSkaiciusFormSkaciai() {
		List<Skaiciai> list = getAllSklaiciai().stream().filter(obj -> obj.getSkaicus() > 35).toList();


		double sum = 0.0;

		for (Skaiciai obj : list) {
			sum = sum + obj.getSkaicus();
		}
		return String.valueOf(sum);
	}

	public void saveDemoData() {
		List<Skaiciai> list = generateDemoList();
		skaiciaiRepo.saveAll(list);
	}

	private List<Skaiciai> generateDemoList() {
		List<Skaiciai> list = new ArrayList<>();

		int i = 1;
		while (i < 11) {
			//while (i < 10+i) {
			Skaiciai skaiciai = new Skaiciai(
					"Pavadinimas_" + i,
					(long) ((Math.random()) * (100 - 0) + 0),
					"Eurai");

			list.add(skaiciai);

			i++;
		}
		return list;
	}
}
