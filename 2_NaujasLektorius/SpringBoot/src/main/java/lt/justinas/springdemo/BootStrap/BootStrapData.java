package lt.justinas.springdemo.BootStrap;

import lt.justinas.springdemo.repository.CustumerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

	@Autowired
	private CustumerRepo custumerRepo;

	@Override
	public void run(String... args) throws Exception {
		custumerRepo.findAll().forEach(System.out::println);
		System.out.println("\n----\n");
		System.out.println(
				custumerRepo.findById(161)
		);
	}
}
