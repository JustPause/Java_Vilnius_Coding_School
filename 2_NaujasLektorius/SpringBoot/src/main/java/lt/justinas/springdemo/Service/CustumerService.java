package lt.justinas.springdemo.Service;

import lt.justinas.springdemo.model.Customer;
import lt.justinas.springdemo.repository.CustumerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustumerService {

    @Autowired
    private CustumerRepo custumerRepo;

    public List<Customer> getAllCustumers() {
        return (List<Customer>) custumerRepo.findAll();
    }
}
