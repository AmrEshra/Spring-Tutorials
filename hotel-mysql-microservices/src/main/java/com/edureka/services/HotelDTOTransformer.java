package com.edureka.services;

import java.util.ArrayList;
import java.util.List;

import com.edureka.dto.HotelDTO;
import com.edureka.model.Hotel;

public class HotelDTOTransformer {
	
    public Hotel tranformToHotel(HotelDTO hotelDTO) {
    	
        return Hotel.builder()
                .name(hotelDTO.getName())
                .description(hotelDTO.getDescription())
                .city(hotelDTO.getCity())
                .rating(hotelDTO.getRating())
                .build();
    }
    
    public List<HotelDTO> tranformToDTOList(List<Hotel> hotelList) {
    	
    	List<HotelDTO> hotelDTOList = new ArrayList<>();
    	
    	for(Hotel hotel : hotelList)
    		hotelDTOList.add(HotelDTO.builder()
                .name(hotel.getName())
                .description(hotel.getDescription())
                .city(hotel.getCity())
                .rating(hotel.getRating())
                .build());
    	
    	return hotelDTOList;
    }
}