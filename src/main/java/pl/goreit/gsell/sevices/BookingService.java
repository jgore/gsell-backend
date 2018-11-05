package pl.goreit.gsell.sevices;


import pl.goreit.gsell.front.dtos.BookingDto;

import java.util.List;

public interface BookingService {
    List<BookingDto> findAll();
}
