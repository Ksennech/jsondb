package com.techwork.jsondb.repository;

import com.techwork.jsondb.domain.Bet;
import org.springframework.data.repository.CrudRepository;

public interface BetRepository extends CrudRepository<Bet, Long>
{
}
