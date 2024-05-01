package movie.onboard.pubsub.events;

import jakarta.validation.constraints.Positive;

import java.math.BigInteger;

public class OrderCreateEvent extends BaseOrderEvent{
    @Positive
    private BigInteger oderId;
}
