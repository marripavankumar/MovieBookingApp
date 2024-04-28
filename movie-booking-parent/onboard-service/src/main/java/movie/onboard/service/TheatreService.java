package movie.onboard.service;


import movie.onboard.model.TheatreOnboardRequest;
import movie.onboard.model.TheatreResponse;

public interface TheatreService {
    TheatreResponse saveTheatre(TheatreOnboardRequest request) throws Exception;

    TheatreResponse getTheatre(Integer id) throws Exception;

    TheatreResponse updateTheatre(Integer id, TheatreOnboardRequest request) throws Exception;

    void deleteTheatre(Integer id) throws Exception;
}
