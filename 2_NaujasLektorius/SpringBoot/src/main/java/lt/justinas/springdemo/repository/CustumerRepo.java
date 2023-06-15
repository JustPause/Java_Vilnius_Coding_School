package lt.justinas.springdemo.repository;

import lt.justinas.springdemo.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CustumerRepo extends CrudRepository<Customer,Integer> {

    Optional<Customer> findByCustomerNumber(int id);
    // SELECT * FROM customers WHERE CustumerNumber = ?id

    Iterable<Customer> findByCustomerNameLike (String name);
    // SELECT * FROM customers WHERE CustumerName LIKE '?name'

    @Query(value = "SELECT * FROM customers WHERE customersName LIKE :name", nativeQuery = true)
    List<Customer> getCustomerList(@Param("name") String name);
}
