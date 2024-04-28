package movie.order.service.client;


import movie.order.model.BookShowResponse;

public class BookingSvcFallBack implements BookingServiceApiClient{
    @Override
    public BookShowResponse getCart(String apiKey, String id) throws Exception {
        return null;
    }
}
