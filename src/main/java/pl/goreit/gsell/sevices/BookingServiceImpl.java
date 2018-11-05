package pl.goreit.gsell.sevices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.goreit.gsell.front.dtos.BookingDto;
import pl.goreit.gsell.front.mappers.BookingMapper;
import pl.goreit.gsell.repositories.BookingRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookingServiceImpl implements BookingService {

    private final BookingRepository repository;

    private final BookingMapper mapper;

    @Autowired
    public BookingServiceImpl(BookingRepository repository, BookingMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    @Override
    public List<BookingDto> findAll() {
        return repository.findAll().stream().map(mapper::toDto).collect(Collectors.toList());
    }
}
