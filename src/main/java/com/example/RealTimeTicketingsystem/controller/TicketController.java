package com.example.RealTimeTicketingsystem.controller;

import com.example.RealTimeTicketingsystem.model.Ticket;
import com.example.RealTimeTicketingsystem.service.TicketService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController// combines controller and response body
@RequestMapping("/api/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;  //encapsulates the business logic related to tickets

    @PostMapping("/create")    //maps the method to HTTP POST
    public Ticket createTicket(@RequestBody Ticket ticket){
        return ticketService.createTicket(ticket);
    }

    @GetMapping("/all")
    public List<Ticket> getAllTickets(){
        return ticketService.getAllTickets();
    }

//    review a ticket by ID.
    @GetMapping("/{id}")
    public Ticket getTicketById(@PathVariable Integer id){
        return ticketService.getTicketById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable Integer id){
        ticketService.deleteTicket(id);
    }
}
