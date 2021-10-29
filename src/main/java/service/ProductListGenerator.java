package service;

import java.util.List;
import model.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductListGenerator {
    public List<Product> generateProductList();
}
