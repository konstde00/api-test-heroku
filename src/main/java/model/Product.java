package model;

import java.util.Objects;

public final class Product {
    private final String productUuid;
    private final String productName;
    private final int amount;

    public Product(String productUuid, String productName, int amount) {
        this.productUuid = productUuid;
        this.productName = productName;
        this.amount = amount;
    }

    public String getProductUuid() {
        return productUuid;
    }

    public String getProductName() {
        return productName;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return amount == product.amount && productUuid.equals(product.productUuid) && productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productUuid, productName, amount);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productUuid='" + productUuid + '\'' +
                ", productName='" + productName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
