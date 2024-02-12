package com.alfaCentauri.onlineshop.web.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.JRE;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseControllerTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("Test of Purchase all")
    @EnabledForJreRange(min = JRE.JAVA_11)
    public void testGetAll_shouldFail(){
        System.out.println("Prueba del método get:");
        Exception exception = assertThrows(NullPointerException.class, () -> {
            PurchaseController purchaseController = new PurchaseController();
            ResponseEntity response = purchaseController.getAll();
            assertNotNull(response);
            assertEquals("200", response.getStatusCode(), "Error: Resultado invalido");
        });
        assertEquals( NullPointerException.class, exception.getClass() );
        //assertTrue(actualMessage.contains(expectedMessage));
        System.out.println("Ok");
    }
}