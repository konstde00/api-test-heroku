package service.impl;

import model.Product;
import service.ProductGenerator;
import service.ProductListGenerator;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class ProductListGeneratorImpl implements ProductListGenerator {
    private final Random random = new SecureRandom();
    private final ProductGenerator productGenerator = new ProductGeneratorImpl();

    @Override
    public List<Product> generateProductList() {
        List<Product> result = new ArrayList<>();
        IntStream.range(50, random.nextInt(200))
                .forEach(i -> result.add(productGenerator.generate()));
        IntStream.range(50, random.nextInt(200))
                .forEach(i -> result.add(productGenerator.generate()));
        IntStream.range(50, random.nextInt(200))
                .forEach(i -> result.add(productGenerator.generate()));
        return result;
    }
}
