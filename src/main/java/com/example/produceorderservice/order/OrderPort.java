package com.example.produceorderservice.order;

import com.example.produceorderservice.product.Product;



interface OrderPort {
    Product getProductById(final Long productId);

    void save(final Order order);
}
