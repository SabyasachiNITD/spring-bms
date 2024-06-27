package com.sabyasachi.bms.models;

import com.sabyasachi.bms.models.constants.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Ticket extends BaseModel{
    @ManyToOne
    private Show show;
    @ManyToMany
    private List<ShowSeat> showSeats;
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;
    private double totalAmount;
}
