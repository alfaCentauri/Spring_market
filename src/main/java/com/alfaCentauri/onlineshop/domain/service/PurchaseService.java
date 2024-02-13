package com.alfaCentauri.onlineshop.domain.service;

import com.alfaCentauri.onlineshop.domain.dto.Purchase;
import com.alfaCentauri.onlineshop.domain.repository.IPurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PurchaseService {

    @Autowired
    private IPurchaseRepository purchaseRepository;

    /**
     * List all purchase.
     * @return
     */
    public List<Purchase> getAll() {
        return purchaseRepository.getAll();
    }

    /**
     * List all purchase, by client.
     * @param cliendtId Type string.
     * @return  Return a List or no.
     */
    public Optional< List<Purchase> > getByClient( String cliendtId ) {
        return purchaseRepository.getByClient( cliendtId );
    }

    /**
     * Save object.
     * @param purchase
     * @return
     */
    public Purchase save( Purchase purchase ) {
        return purchaseRepository.save(purchase);
    }
}
