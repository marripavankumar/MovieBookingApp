package movie.onboard.service;


import movie.onboard.model.ShowResponse;
import movie.onboard.model.ShowUpsertRequest;

public interface ShowsService {
    ShowResponse saveShow(ShowUpsertRequest request) throws Exception;

    ShowResponse getShow(Integer id) throws Exception;

    ShowResponse updateShow(Integer id, ShowUpsertRequest request) throws Exception;

    void deleteShow(Integer id) throws Exception;

    Integer getFreeSeatsCount(Integer id) throws Exception;

}
