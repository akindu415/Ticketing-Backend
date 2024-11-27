package com.example.RealTimeTicketingsystem.repository;

import com.example.RealTimeTicketingsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

public interface UserRepository extends JpaRepository<User, Long> {
}
