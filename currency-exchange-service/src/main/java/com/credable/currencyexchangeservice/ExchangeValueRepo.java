package com.credable.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeValueRepo extends JpaRepository<ExchangeValue, Long> {
    ExchangeValue findByFromAndTo(Currency from, Currency to);
}
