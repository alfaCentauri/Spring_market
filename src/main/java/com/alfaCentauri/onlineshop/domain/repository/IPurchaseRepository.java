package com.alfaCentauri.onlineshop.domain.repository;

import com.alfaCentauri.onlineshop.domain.dto.Purchase;

import java.util.List;
import java.util.Optional;

public interface IPurchaseRepository {

    /**
     * Get all purchase.
     * @return Return a list of purchase with data or empty.
     */
    List<Purchase> getAll();

    /**
     * Get list purchase by client.
     * @param clientId Type string.
     * @return Return a list purchase or no.
     */
    Optional<List<Purchase>> getByClient(String clientId);

    /**
     * Save an object purchase.
     * @param purchase Type Purchase.
     * @return Return an object purchase.
     */
    Purchase save(Purchase purchase);
}
