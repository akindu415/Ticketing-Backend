package com.example.RealTimeTicketingsystem.repository;

import com.example.RealTimeTicketingsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<User, Long> {
}
