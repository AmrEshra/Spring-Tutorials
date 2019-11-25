package com.edureka.ms.training.inventoryservice.repository;

import com.edureka.ms.training.inventoryservice.model.Inventory;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InventoryRepositoryTest {

    @Autowired
    InventoryRepository inventoryRepository;

    @Test
    public void shouldSaveAnInventory(){

        //Given
        Inventory inventory = Inventory.builder()
                .id(1)
                .name("Samsung S10")
                .description("Samsung S10+ Amoled Screen")
                .quantity(40)
                .build();

        //When - Action
        inventoryRepository.save(inventory);

        //Then
        Optional<Inventory> byId = inventoryRepository.findById(1);
        Assertions.assertThat(byId.get()).isEqualTo(inventory);
    }

}