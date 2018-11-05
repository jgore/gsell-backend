package pl.goreit.gsell.sevices;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.goreit.gsell.front.dtos.BookingDto;
import pl.goreit.gsell.model.Booking;
import pl.goreit.gsell.repositories.BookingRepository;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class BookingServiceTest {

    @Autowired
    private BookingRepository repo;

    @Test
    public void findAll__returnAllBookings() {
        Booking booking = new Booking();
        repo.save(booking);
        List<Booking> all = repo.findAll();
        assertThat(all.size(), equalTo(1));
    }


}