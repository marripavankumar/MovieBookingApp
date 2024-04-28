package movie.booking.repo;

import movie.booking.entity.SeatAllocationStatus;
import movie.booking.entity.SeatAllocationStatusId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatAllocationStatusRepository extends JpaRepository<SeatAllocationStatus, SeatAllocationStatusId> {
}
