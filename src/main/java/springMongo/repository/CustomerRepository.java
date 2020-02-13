package springMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import springMongo.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
