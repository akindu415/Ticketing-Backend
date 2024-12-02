package com.example.RealTimeTicketingsystem.service.impl;

import com.example.RealTimeTicketingsystem.model.Ticket;
import com.example.RealTimeTicketingsystem.repository.TicketRepository;
import com.example.RealTimeTicketingsystem.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//indicates class is a service component
public class TicketServiceImpl implements TicketService {

    @Autowired // injects the ticketRepository
    private TicketRepository ticketRepository;

    @Override
    public Ticket createTicket(Ticket ticket){
        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket getTicketById(Integer id) {
        return ticketRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteTicket(Integer id){
        ticketRepository.deleteById(id);
    }
}
