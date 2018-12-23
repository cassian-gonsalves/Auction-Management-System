/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Bid;

import Business.Member.Member;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author QuickLearners
 */
public class BidsDirectory {
    
    private List<Bid> bidsList;

    public BidsDirectory() {
        this.bidsList = new ArrayList();
    }
    
    public void addBid(int bidAmount,Member customer)
    {
        this.bidsList.add(new Bid(bidAmount, customer));
    }
    
    public int getBidsCount()
    {
        return this.bidsList.size();
    }
    
    public List<Bid> getBidsList()
    {
        return this.bidsList;
    }
    
    
    //Return Max Bid decending order based on camparable
    public Bid getMaxBid()
    {
        if(this.bidsList.size()==0)
        {
            return null;
        }
        
        Collections.sort(bidsList);
        return bidsList.get(0);
    }
}
