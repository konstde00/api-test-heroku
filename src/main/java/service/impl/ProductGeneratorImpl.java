package service.impl;

import model.Product;
import service.ProductGenerator;
import util.RandomStringGenerator;
import util.impl.RandomStringGeneratorImpl;

import java.security.SecureRandom;
import java.util.Random;

public class ProductGeneratorImpl implements ProductGenerator {
    private static final RandomStringGenerator generator = new RandomStringGeneratorImpl();
    private static final Random random = new SecureRandom();
    private static final String PRODUCT = "Product";

    @Override
    public final Product generate() {
        String productUuid = generateProductUuId();
        String productName = generateProductName();
        int amount = generateProductAmount();
        return new Product(productUuid, productName, amount);
    }

    private static final String generateProductUuId() {
        return generator.getRandomString(8)
                + "-"
                + generator.getRandomString(4)
                + "-"
                + generator.getRandomString(4)
                + "-"
                + generator.getRandomString(4)
                + "-"
                + generator.getRandomString(12);
    }

    private static final String generateProductName() {
        return PRODUCT + random.nextInt(1000);
    }

    private static final int generateProductAmount() {
        return random.nextInt(2000);
    }
}
