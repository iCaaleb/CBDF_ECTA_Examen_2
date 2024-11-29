package com.upiiz.examen2.services;

import com.upiiz.examen2.models.ShippingEntity;
import com.upiiz.examen2.repositories.ShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShippingService {

    @Autowired
    ShippingRepository shippingRepository;

    public List<ShippingEntity> getAllShippings() {
        return shippingRepository.findAll();
    }

    public ShippingEntity getShippingById(Long id) {
        return shippingRepository.findById(id).orElse(null);
    }

    public ShippingEntity createOrUpdateShipping(ShippingEntity shipping) {
        return shippingRepository.save(shipping);
    }

    public void deleteShippingById(Long id){
        shippingRepository.deleteById(id);
    }
}
