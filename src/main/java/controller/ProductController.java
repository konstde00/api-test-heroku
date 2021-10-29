package controller;

import java.util.List;
import model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import service.ProductListGenerator;
import service.impl.ProductListGeneratorImpl;

@RestController
public class ProductController {
    private static final ProductListGenerator productListGenerator
            = new ProductListGeneratorImpl();

    @GetMapping("/testLink/{id}")
    public List<Product> getProduct(@PathVariable Long id) {
        return productListGenerator.generateProductList();
    }
}

