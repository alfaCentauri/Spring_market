package com.alfaCentauri.onlineshop.web.controller;

import com.alfaCentauri.onlineshop.domain.dto.Purchase;
import com.alfaCentauri.onlineshop.domain.service.PurchaseService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/all")
    @ApiOperation( "Get all purchases")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<Purchase> > getAll() {
        return new ResponseEntity<>(purchaseService.getAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/client/{idClient}", consumes = "application/json")
    public ResponseEntity< List<Purchase> > getByClient( @PathVariable("idClient") String clientId ) {
        return purchaseService.getByClient(clientId).map(
                purchases -> new ResponseEntity<>(purchases, HttpStatus.OK)
        ).orElse( new ResponseEntity<>(HttpStatus.NOT_FOUND) );
    }

    /***/
    @PostMapping(value = "/save", consumes = "application/json")
    public ResponseEntity<Purchase> save(@RequestBody Purchase purchase) {
        return new ResponseEntity<>(purchaseService.save(purchase), HttpStatus.CREATED);
    }
}
