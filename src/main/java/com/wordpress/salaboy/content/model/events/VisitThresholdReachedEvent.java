/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.salaboy.content.model.events;

import com.wordpress.salaboy.content.model.meta.Product;

/**
 *
 * @author salaboy
 */
public class VisitThresholdReachedEvent {

    private int amount;
    private Product product;

    public VisitThresholdReachedEvent(int amount) {
        this.amount = amount;
    }

    public VisitThresholdReachedEvent(int amount, Product product) {
        this.amount = amount;
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    
}
