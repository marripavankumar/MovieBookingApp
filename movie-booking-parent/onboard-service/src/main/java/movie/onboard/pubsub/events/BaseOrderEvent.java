package movie.onboard.pubsub.events;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import movie.onboard.util.Status;


import java.time.LocalTime;
@Data
public class BaseOrderEvent {
    @NotEmpty
    private LocalTime oderCreatedTime=LocalTime.now();
    @NotEmpty
    private String cartId;
    /*0-pending,1-processing, 2-success, 3-failed*/
    @NotEmpty
    private Status status=Status.pending;
    private String reason;
}
