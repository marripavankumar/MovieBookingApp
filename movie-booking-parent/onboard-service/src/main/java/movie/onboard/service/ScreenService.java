package movie.onboard.service;


import movie.onboard.model.ScreenResponse;
import movie.onboard.model.ScreenUpsertRequest;

public interface ScreenService {
    ScreenResponse saveAudi(ScreenUpsertRequest request) throws Exception;

    ScreenResponse getAudi(Integer id) throws Exception;

    ScreenResponse updateAudi(Integer id, ScreenUpsertRequest request) throws Exception;

    void deleteAudi(Integer id) throws Exception;
}
