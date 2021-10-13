package com.ecommerce.shop.data.model;

public enum Currency {
    NGN("Naira"),USD("Dollar"),EURO("Euro"),SGD("Singapore Dollar"),
    GBP("British Pounds"),FRF("France"),GHC("Ghana Cedis");

    private String name;
    Currency(String s){
        name = s;
    }
    public String getName(){
        return  name;
    }
}
