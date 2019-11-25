package com.edureka.ms.training.inventoryservice.services;

import java.util.ArrayList;
import java.util.List;

import com.edureka.ms.training.inventoryservice.DTO.InventoryDTO;
import com.edureka.ms.training.inventoryservice.model.Inventory;

public class InventoryDTOTransformer {
    public Inventory tranform(InventoryDTO inventoryDTO) {
        return Inventory.builder()
                .name(inventoryDTO.getName())
                .description(inventoryDTO.getDescription())
                .quantity(inventoryDTO.getQuantity())
                .build();
    }
    
    public List<InventoryDTO> tranformList(List<Inventory> inventoryList) {
    	
    	List<InventoryDTO> inventoryDTOList = new ArrayList<>();
    	for(Inventory inventory : inventoryList)
    		inventoryDTOList.add(InventoryDTO.builder()
                .name(inventory.getName())
                .description(inventory.getDescription())
                .quantity(inventory.getQuantity())
                .build());
    	
    	return inventoryDTOList;
    }
}