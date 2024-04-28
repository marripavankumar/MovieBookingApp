package movie.search;



import movie.Entity.MovieTheaterViewEntity;
import movie.model.SearchFilterRequest;

import java.util.List;

public interface SearchService {
    List<MovieTheaterViewEntity> theatreSearch(SearchFilterRequest request) throws Exception;
    List<MovieTheaterViewEntity> searchRunningShows(SearchFilterRequest request) throws Exception;
}
