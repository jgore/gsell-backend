package pl.goreit.gsell.front.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.goreit.gsell.front.dtos.BookingDto;
import pl.goreit.gsell.sevices.BookingService;

import java.util.List;

@RestController
@RequestMapping("/api/booking")
public class BookingController {

    private final BookingService service;

    @Autowired
    public BookingController(BookingService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<BookingDto>> getBookings() {

        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }


}
