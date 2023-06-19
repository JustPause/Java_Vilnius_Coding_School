package lt.justinas.springdemo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SKaiciaiServide {
	@Autowired
	private SkaiciaiRepo skaiciaiRepo;

	public List<Skaiciai> GettallSklaiciai() {
		return (List < Skaiciai > -) skaiciaiRepo.findAll();
	}
}
