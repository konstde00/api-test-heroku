package service;

import model.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductGenerator {
    public Product generate();
}
