package com.edureka.ms.training.inventoryservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edureka.ms.training.inventoryservice.DTO.InventoryDTO;
import com.edureka.ms.training.inventoryservice.model.Inventory;
import com.edureka.ms.training.inventoryservice.repository.InventoryRepository;

@Service
public class InventoryService {
	
	@Autowired
    InventoryRepository inventoryRepository;

    public boolean save(InventoryDTO inventoryDTO) {
        Inventory inventory = new InventoryDTOTransformer().tranform(inventoryDTO);
        Inventory saved = inventoryRepository.save(inventory);
        return saved !=null;
    }
    
    public List<InventoryDTO> getAll() {
    	
    	List<Inventory> inventoryList = inventoryRepository.findAll();
    	List<InventoryDTO> inventoryDTOList = new InventoryDTOTransformer().tranformList(inventoryList);
        return inventoryDTOList;
    }
}
