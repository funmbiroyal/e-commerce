package com.ecommerce.shop.data.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FeedBack {
    @Id
    private long Id;
    private String comment;
    private String rating;

}
