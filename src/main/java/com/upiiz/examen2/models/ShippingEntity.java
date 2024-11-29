package com.upiiz.examen2.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "shipping")
public class ShippingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long shipping_id;

    @NotNull
    @Column(length = 50)
    private String shipping_method;

    @NotNull
    @Column(precision = 10, scale = 2)
    private BigDecimal shipping_cost ;
}
