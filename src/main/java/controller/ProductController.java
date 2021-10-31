package controller;

import java.math.BigInteger;
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
    public List<Product> getProduct(@PathVariable BigInteger id) {
        Product testProduct = new Product("123e4567-e89b-12d3-a456-426655440000",
                "Kettle", 3);
        return List.of(testProduct);
    }

    @GetMapping("/testLink/testWebSourceReader")
    public List<Product> getProductTest() {
        Product testProduct = new Product("123e4567-e89b-12d3-a456-426655440000",
                "Kettle", 3);
        return List.of(testProduct);
    }
}

