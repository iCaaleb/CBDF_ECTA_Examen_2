package com.upiiz.examen2.repositories;

import com.upiiz.examen2.models.ShippingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingRepository extends JpaRepository<ShippingEntity, Long> {
}
