package com.edureka.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.edureka.dto.HotelDTO;
import com.edureka.model.Hotel;
import com.edureka.repository.HotelRepository;

@Service
public class HotelService {
	
	@Autowired
    HotelRepository hotelRepository;

    public boolean createNewHotel(HotelDTO hotelDTO) {
        Hotel hotel = new HotelDTOTransformer().tranformToHotel(hotelDTO);
        Hotel saved = hotelRepository.save(hotel);
        
        return saved !=null;
    }
    
    public List<HotelDTO> getAllHotels(int page, int size) {
    	
        Pageable pageableRequest = PageRequest.of(page, size);
        Page<Hotel> hotelList = hotelRepository.findAll(pageableRequest);
        List<HotelDTO> hotelDTOList = new HotelDTOTransformer().tranformToDTOList(hotelList.getContent());
        return hotelDTOList;
    }
}
