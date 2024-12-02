package com.example.RealTimeTicketingsystem.repository;

import com.example.RealTimeTicketingsystem.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
