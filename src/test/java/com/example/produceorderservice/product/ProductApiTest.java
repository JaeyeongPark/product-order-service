package com.example.produceorderservice.product;

import com.example.produceorderservice.ApiTest;
import io.restassured.RestAssured;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import static com.example.produceorderservice.product.ProductSteps.상품등록요청;
import static com.example.produceorderservice.product.ProductSteps.상품등록요청_생성;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class ProductApiTest extends ApiTest {

    @Test
    void 상품등록(){
        final AddProductRequest request = 상품등록요청_생성();

        //API 요청
        final ExtractableResponse<Response> response = 상품등록요청(request);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.CREATED.value());

    }



}
