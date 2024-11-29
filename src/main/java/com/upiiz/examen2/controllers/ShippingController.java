package com.upiiz.examen2.controllers;

import com.upiiz.examen2.models.ShippingEntity;
import com.upiiz.examen2.services.ShippingService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/shippings")
public class ShippingController {

    @Autowired
    ShippingService shippingService;

    @GetMapping
    public ResponseEntity<List<ShippingEntity>> getAllShippings() {
        return ResponseEntity.ok(shippingService.getAllShippings());
    }

    @GetMapping("{id}")
    public ResponseEntity<ShippingEntity> getShippingById(@PathVariable Long id) {
        ShippingEntity shipping = shippingService.getShippingById(id);
        if (shipping != null) {
            return ResponseEntity.ok(shipping);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ShippingEntity createShipping(@RequestBody ShippingEntity shipping) {
        return shippingService.createOrUpdateShipping(shipping);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ShippingEntity> updateShipping(@PathVariable Long id, @RequestBody ShippingEntity shippingDetails) {
        ShippingEntity shipping = shippingService.getShippingById(id);
        if (shipping != null) {
            shipping.setShipping_method(shippingDetails.getShipping_method());
            shipping.setShipping_cost(shippingDetails.getShipping_cost());
            return ResponseEntity.ok(shippingService.createOrUpdateShipping(shipping));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteShippingById(@PathVariable Long id) {
        ShippingEntity shipping = shippingService.getShippingById(id);
        if (shipping != null) {
            shippingService.deleteShippingById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
