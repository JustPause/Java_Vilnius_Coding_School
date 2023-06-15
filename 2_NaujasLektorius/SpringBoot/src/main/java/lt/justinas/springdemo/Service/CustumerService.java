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

    public Customer getCustumer(int id) {
        return custumerRepo.findById(id).get();
    }

    public Customer getCustomerByNumber(int id){
        return custumerRepo.findByCustomerNumber(id).get();
    }

    public List<Customer> getCustumerByName (String name){
        return (List<Customer>) custumerRepo.findByCustomerNameLike(name);
    }

    public List<Customer> getCustumerLikeName (String name){
        return custumerRepo.getCustomerList(name);
    }
}
