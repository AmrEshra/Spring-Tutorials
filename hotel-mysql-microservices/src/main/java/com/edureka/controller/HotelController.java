package com.edureka.controller;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edureka.dto.HotelDTO;
import com.edureka.services.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	private final HotelService hotelService;
	
	public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }
	
	@GetMapping
    public ResponseEntity<List<HotelDTO>> getAllHotelItems(@RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "size", defaultValue = "30") int size){

		List<HotelDTO> hotelDTOList = hotelService.getAllHotels(page, size);
		HttpHeaders responseHeaders = new HttpHeaders();
		
        return new ResponseEntity<>(hotelDTOList, responseHeaders, HttpStatus.OK);
    }
	
	@PostMapping
    public ResponseEntity<Boolean> createNewCustomer(@RequestBody HotelDTO hotelDTO){
        boolean saved = hotelService.createNewHotel(hotelDTO);
        return ResponseEntity.status(HttpStatus.OK).body(saved);
    }
}
