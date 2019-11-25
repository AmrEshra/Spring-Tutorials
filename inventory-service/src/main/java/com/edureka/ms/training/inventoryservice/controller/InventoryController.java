package com.edureka.ms.training.inventoryservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edureka.ms.training.inventoryservice.DTO.InventoryDTO;
import com.edureka.ms.training.inventoryservice.services.InventoryService;

@RestController
public class InventoryController {

	private final InventoryService inventoryService;
	
	public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }
	
	@GetMapping("/inventory")
    public List<InventoryDTO> getAllInventoryItems(){

        return inventoryService.getAll();
    }
	
//	@PostMapping
//	@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
//	ResponseEntity<Boolean> createInventory(InventoryDTO inventoryDTO){
//		return ResponseEntity.status(HttpStatus.CREATED).body(true);
//	}
}
