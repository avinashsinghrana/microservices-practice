package com.credable.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversionBean {
    private Long id;
    private Currency from;
    private Currency to;
    private BigDecimal conversionMultiple;
    private BigDecimal quantity;
    private Integer port;
    private BigDecimal totalCalculatedAmount;

    public CurrencyConversionBean() {
    }

    public CurrencyConversionBean(Long id, Currency from, Currency to, BigDecimal conversionMultiple, BigDecimal quantity, Integer port, BigDecimal totalCalculatedAmount) {
        this.id = id; this.from = from; this.to = to; this.conversionMultiple = conversionMultiple; this.quantity = quantity; this.port = port; this.totalCalculatedAmount = totalCalculatedAmount;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
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

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public BigDecimal getTotalCalculatedAmount() {
        return totalCalculatedAmount;
    }

    public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
        this.totalCalculatedAmount = totalCalculatedAmount;
    }

    @Override
    public String toString() {
        return "CurrencyConversionBean{" +
                "id=" + id +
                ", from=" + from +
                ", to=" + to +
                ", conversionMultiple=" + conversionMultiple +
                ", quantity=" + quantity +
                ", port=" + port +
                ", totalCalculatedAmount=" + totalCalculatedAmount +
                '}';
    }
}

