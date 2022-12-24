package com.techwork.jsondb.controller;

import com.techwork.jsondb.domain.Bet;
import com.techwork.jsondb.service.BetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/bets")
public class BetController {

    private BetService betService;

    public BetController(BetService betService) {
        this.betService = betService;
    }

    @GetMapping("/list")
    public Iterable<Bet> list() {
        return betService.list();
    }

}
