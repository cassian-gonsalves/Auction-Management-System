/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Bid;

import Business.Member.Member;

/**
 *
 * @author QuickLearners
 */

//Bid pojo class

public class Bid implements Comparable<Bid>{
    private int bidAmount;
    private Member customer;

    
    public Bid() {
        super();
    }

    public Bid(int bidAmount, Member customer) {
        this.bidAmount = bidAmount;
        this.customer = customer;
    }

    public int getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(int bidAmount) {
        this.bidAmount = bidAmount;
    }

    public Member getCustomer() {
        return customer;
    }

    public void setCustomer(Member customer) {
        this.customer = customer;
    }

    //sort by bid
    @Override
    public int compareTo(Bid o) {
        return Integer.compare(o.getBidAmount(), this.bidAmount);
    }

    @Override
    public String toString() {
        return String.valueOf(this.bidAmount);
    }
}



