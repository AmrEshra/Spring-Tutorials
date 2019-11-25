package com.edureka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edureka.model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer>{

}
