package movie.order.service.client;

import jakarta.validation.Valid;
import movie.order.model.PaymentRequest;

import movie.order.model.PaymentResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "paymentSvcClient", path = "/payment-service/v1/payments",
        url = "https://paymentgeateway", fallback = PaymentSvcFallBack.class)
public interface PaymentServiceApiClient {


    @PostMapping("/process")
    PaymentResponse process(@Valid @RequestBody PaymentRequest request);
}
