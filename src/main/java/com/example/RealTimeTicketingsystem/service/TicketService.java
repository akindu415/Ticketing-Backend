package com.example.RealTimeTicketingsystem.service;

import com.example.RealTimeTicketingsystem.model.Ticket;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public interface TicketService {
    Ticket createTicket(Ticket ticket);//creates a new ticket
    List<Ticket> getAllTickets();
    Ticket getTicketById(Integer id);
    void deleteTicket(Integer id);

}
