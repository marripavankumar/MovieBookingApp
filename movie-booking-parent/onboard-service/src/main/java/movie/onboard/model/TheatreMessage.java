package movie.onboard.model;

import movie.onboard.util.Operation;
import org.springframework.data.elasticsearch.core.geo.GeoPoint;

public class TheatreMessage {
    private Integer theatreId;
    private String theatreName;
    private String cityName;
    private Integer cityId;
    private GeoPoint geoPoint;
    Operation operation;

    public TheatreMessage(Integer theatreId, String theatreName, String cityName, Integer cityId, GeoPoint geoPoint, Operation operation) {
        this.theatreId = theatreId;
        this.theatreName = theatreName;
        this.cityName = cityName;
        this.cityId = cityId;
        this.geoPoint = geoPoint;
        this.operation = operation;
    }
}
