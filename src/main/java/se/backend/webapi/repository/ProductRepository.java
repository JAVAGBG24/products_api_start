package se.backend.webapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import se.backend.webapi.models.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
