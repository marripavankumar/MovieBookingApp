package movie.onboard.service;


import movie.onboard.model.MovieResponse;
import movie.onboard.model.MovieUpsertRequest;

public interface MovieService {
    MovieResponse saveMovie(MovieUpsertRequest request) throws Exception;

    MovieResponse getMovie(Integer id) throws Exception;

    MovieResponse updateMovie(Integer id, MovieUpsertRequest request) throws Exception;

    void deleteMovie(Integer id) throws Exception;
}
