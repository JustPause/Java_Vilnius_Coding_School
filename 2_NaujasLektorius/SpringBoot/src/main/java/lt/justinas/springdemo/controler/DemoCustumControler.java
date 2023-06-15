package lt.justinas.springdemo.controler;

import lt.justinas.springdemo.Service.CustumerService;
import lt.justinas.springdemo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.nio.file.Path;
import java.util.List;

@Controller
public class DemoCustumControler {
//http://127.0.0.1:8080/test

    @Autowired
    private CustumerService custumerService;

    @GetMapping(path = "/justinas")
    public @ResponseBody String getJustinasResult() {
        return "Laba as esu Justinas";
    }

    @GetMapping(path = "/test")
    public @ResponseBody String getTestResult() {
        return "This si some text form SPRING!";
    }

    @GetMapping(path = "/list")
    public @ResponseBody List<Customer> gatAllCustumers() {
        return custumerService.getAllCustumers();
    }

}
