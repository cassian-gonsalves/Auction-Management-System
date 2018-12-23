/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import Business.Bid.Bid;
import Business.Bid.BidsDirectory;
import Business.Bid.IllegalBidAmountException;
import Business.Member.Member;
import java.util.Comparator;

/**
 *
 * @author cassian
 */
public class Product {
    private String name;
    private int id;
    private String description;
    private int minBid;
    private String category;
    private BidsDirectory bidsDirectory;

    public Product() {
        super();
        bidsDirectory = new BidsDirectory();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMinBid() {
        return minBid;
    }

    public void setMinBid(int minBid) {
        this.minBid = minBid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BidsDirectory getBidsDirectory() {
        return bidsDirectory;
    }
    
    //Store bid and validation
    public void addBid(Member customer,int bidAmount) throws Exception
    {
        for(Bid bid: this.bidsDirectory.getBidsList())
        {
            if(bid.getCustomer()==customer)
            {
                throw new Exception("Only a single bid is permitted on a product.");
            }
        }
        if(bidAmount > minBid)
        {
            this.bidsDirectory.addBid(bidAmount, customer);
        }
        else
        {
            throw new IllegalBidAmountException(minBid);
        }
    }
    
    
    public boolean getBiddingStatus()
    {
        return this.bidsDirectory.getBidsCount()>=5;
    }

    
    @Override
    public String toString() {
        return this.name;
    }
    
    public Bid getMaximumBid()
    {
        return this.bidsDirectory.getMaxBid();
    }
    
    //sorting for id generation
    public static Comparator<Product> sortByID()
    {
        return (m1,m2)->Integer.compare(m2.getId(), m1.getId());
    }
    
    
    public static Comparator<Product> sortByMaxBidAmount()
    {
        return (p1,p2)->Integer.compare(p2.getMaximumBid().getBidAmount(), p1.getMaximumBid().getBidAmount());
    }
}
