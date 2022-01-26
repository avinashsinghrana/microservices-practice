package com.credable.currencyexchangeservice;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class ExchangeValue {
    @Id
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "currency_from", columnDefinition = "enum('INR', 'EUR', 'USD', 'AUD') default null")
    private Currency from;

    @Enumerated(EnumType.STRING)
    @Column(name = "currency_to", columnDefinition = "enum('INR', 'EUR', 'USD', 'AUD') default null")
    private Currency to;

    @Column(name = "conversion_multiple")
    private BigDecimal conversionMultiple;

    @Column(name = "port")
    private Integer port;

    public ExchangeValue() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Currency getFrom() {
        return from;
    }

    public void setFrom(Currency from) {
        this.from = from;
    }

    public Currency getTo() {
        return to;
    }

    public void setTo(Currency to) {
        this.to = to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public ExchangeValue(Long id, Currency from, Currency to, BigDecimal conversionMultiple) {
        this.id = id; this.from = from; this.to = to; this.conversionMultiple = conversionMultiple;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
