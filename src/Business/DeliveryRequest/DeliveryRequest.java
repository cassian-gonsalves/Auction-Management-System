/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryRequest;

import Business.Member.Member;
import Business.Product.Product;

/**
 *
 * @author QuickLearners
 */
public class DeliveryRequest 
{
    Member customer;
    String deliveryAddress;
    String phoneNumber;
    Product product;
    boolean deliveryStatus;

    public DeliveryRequest() {
    }

    public Member getCustomer() {
        return customer;
    }

    public void setCustomer(Member customer) {
        this.customer = customer;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public boolean isDelivered() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(boolean deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    @Override
    public String toString() {
        return deliveryAddress;
    }
}
