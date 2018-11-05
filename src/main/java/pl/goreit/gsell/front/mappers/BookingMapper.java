package pl.goreit.gsell.front.mappers;

import org.springframework.stereotype.Component;
import pl.goreit.gsell.front.dtos.BookingDto;
import pl.goreit.gsell.model.Booking;

@Component
public class BookingMapper {


    public BookingDto toDto(Booking entity) {
        BookingDto dto = new BookingDto();
        dto.setId(entity.getId());
        dto.setTitle(entity.getTitle());
        return dto;
    }

    public Booking toDao(BookingDto dto) {

        Booking booking = new Booking();
        booking.setId(booking.getId());
        booking.setTitle(booking.getTitle());
        return booking;
    }
}
