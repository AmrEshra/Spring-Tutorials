package com.edureka.ms.training.inventoryservice.services;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.edureka.ms.training.inventoryservice.DTO.InventoryDTO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InventoryServiceTest {


    @Autowired
    InventoryService inventoryService;

    @Test
    public void shouldSaveAnInventory(){
        //Given
        InventoryDTO inventoryDTO = new InventoryDTO();
        inventoryDTO.setName("Samsung S10+");
        inventoryDTO.setDescription("Samsung S10+, Amoled Screen");
        inventoryDTO.setQuantity(5);
        //When

        boolean saved = inventoryService.save(inventoryDTO);

        //Then

        Assertions.assertThat(saved).isTrue();
    }


}