package movie.booking.pubsub.events;

import lombok.Data;

import java.time.LocalTime;
@Data
public class OrderCancelEvent extends OrderCreateEvent{
    private LocalTime oderCancelTime;
}
