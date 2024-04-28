package movie.booking.service;


import movie.booking.model.BookShowRequest;
import movie.booking.model.BookShowResponse;

public interface BookingCartService {
    BookShowResponse saveCart(BookShowRequest request) throws Exception;

    BookShowResponse updateCart(String id, BookShowRequest request) throws Exception;

    BookShowResponse getCart(String id) throws Exception;

    void deleteCart(String id) throws Exception;

    BookShowResponse confirmCart(String id, BookShowRequest request) throws Exception;

    BookShowResponse lockCartSeats(String id, BookShowRequest request) throws Exception;
}
