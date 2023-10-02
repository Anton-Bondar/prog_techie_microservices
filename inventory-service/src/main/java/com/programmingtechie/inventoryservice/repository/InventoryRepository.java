package com.programmingtechie.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.programmingtechie.inventoryservice.model.Inventory;

import java.util.List;
import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    boolean existsBySkuCode(String skuCode);

    boolean existsBySkuCodeIn(List<String> skuCodes);

    List<Inventory> findBySkuCodeIn(List<String> skuCodes);
}
