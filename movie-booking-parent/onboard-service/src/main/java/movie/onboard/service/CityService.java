package movie.onboard.service;



import movie.onboard.model.CityResponse;
import movie.onboard.model.CityUpsertRequest;

import java.util.List;

public interface CityService {
    CityResponse saveCity(CityUpsertRequest request) throws Exception;

    CityResponse getCity(Integer id) throws Exception;

    List<CityResponse> getCities(Integer page, Integer pageSize) throws Exception;

    boolean deleteCity(Integer id) throws Exception;

    CityResponse updateCity(Integer id, CityUpsertRequest request) throws Exception;
}
