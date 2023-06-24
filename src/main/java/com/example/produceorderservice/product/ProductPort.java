package com.example.produceorderservice.product;

interface ProductPort {
    Product getProduct(Long productId);

    void save(final Product product);
}
