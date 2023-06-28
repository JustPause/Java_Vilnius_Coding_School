package lt.justinas.springdemo.demo;

import lt.justinas.springdemo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/skaiciai")
public class SkaiciaiControler {
	@Autowired
	private SKaiciaiServide skaiciaiServide;

	// http://localhost:8080/customer/list
	@GetMapping(path = "/list")
	public @ResponseBody List<Skaiciai> getAllSklaiciai() {
		return skaiciaiServide.getAllSklaiciai();
	}

	@GetMapping(path="/savedemo")
	public @ResponseBody String saveDemoData(){
		skaiciaiServide.saveDemoData();
		return "Demo duomenys sukurtai ir issaugoti";
	}

	@GetMapping(path = "/sum")
	public @ResponseBody String getSumOfSkaicus(){

		return skaiciaiServide.sumAtibuteSkaiciusFormSkaciai();
	}
}
