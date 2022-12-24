package com.techwork.jsondb.service;

import com.techwork.jsondb.domain.Bet;
import com.techwork.jsondb.repository.BetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BetService {

    private final BetRepository betRepository;

    public BetService(BetRepository betRepository) {
        this.betRepository = betRepository;
    }

    public Iterable<Bet> list() {
        return betRepository.findAll();
    }

    public Bet save(Bet bet) {
        return betRepository.save(bet);
    }

    public void save(List<Bet> bets) {
        betRepository.saveAll(bets);
    }
}

