package lt.justinas.springdemo.repository;

import lt.justinas.springdemo.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustumerRepo extends CrudRepository<Customer,Integer> {

}
