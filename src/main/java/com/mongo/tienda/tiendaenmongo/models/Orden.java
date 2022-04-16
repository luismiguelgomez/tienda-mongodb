package com.mongo.tienda.tiendaenmongo.models;

import javax.persistence.Id;

public class Orden {

    @Id
    public String id;

    public String deliveryAddress;

    public String IsPremium;

    public String valorCompra;

    public String cardNum;

    public String monthlyFees;

    public Orden(){}

    public Orden(String id, String deliveryAddress, String isPremium, String valorCompra, String cardNum, String monthlyFees) {
        this.id = id;
        this.deliveryAddress = deliveryAddress;
        IsPremium = isPremium;
        this.valorCompra = valorCompra;
        this.cardNum = cardNum;
        this.monthlyFees = monthlyFees;
    }

    @Override
    public String toString() {
        return "Orden{" +
                "id='" + id + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", IsPremium='" + IsPremium + '\'' +
                ", valorCompra='" + valorCompra + '\'' +
                ", cardNum='" + cardNum + '\'' +
                ", monthlyFees='" + monthlyFees + '\'' +
                '}';
    }
}
