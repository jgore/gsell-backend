package pl.goreit.gsell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.goreit.gsell.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {


}
