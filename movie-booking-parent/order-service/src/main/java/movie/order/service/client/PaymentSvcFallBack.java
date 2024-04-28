package movie.order.service.client;

import movie.order.model.PaymentRequest;
import movie.order.model.PaymentResponse;


public class PaymentSvcFallBack implements PaymentServiceApiClient{
    @Override
    public PaymentResponse process(PaymentRequest request) {
        return null;
    }
}
