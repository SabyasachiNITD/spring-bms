package com.sabyasachi.bms.models;

import com.sabyasachi.bms.models.constants.PaymentMethod;
import com.sabyasachi.bms.models.constants.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Payment extends BaseModel{
    private LocalDateTime paymentTiming;
    private String referenceId;
    private double amount;
    @Enumerated(EnumType.STRING)
    private Status paymentStatus;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;


}
