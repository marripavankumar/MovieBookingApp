package movie.booking.pubsub.events;

import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.math.BigInteger;

@Data
public class OrderCreateEvent extends BaseOrderEvent {
    @Positive
    private BigInteger oderId;

}
