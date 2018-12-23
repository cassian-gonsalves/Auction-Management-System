/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Auction;

import Business.Product.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author QuickLearners
 */
public class AuctionsDirectory {
    private List<Auction> auctionsList;
    private int maxAuctionId;

    public AuctionsDirectory() {
        auctionsList = new ArrayList<Auction>();
        maxAuctionId = getMaxAuctionID();
    }
    
    public void addAuction(Auction auction)
    {
        auction.setId(++maxAuctionId);
        this.auctionsList.add(auction);
    }
    
    public void removeAuction(Auction auction)
    {
        this.auctionsList.remove(auction);
    }
    
    public List<Auction> getAuctionsList()
    {
        return this.auctionsList;
    }
    
    
    private int getMaxAuctionID()
    {
        if(!this.auctionsList.isEmpty())
        {
            this.auctionsList.sort(Auction.sortByID());
            return this.auctionsList.get(this.auctionsList.size()-1).getId();
        }
        return 0;
    }
    
    
    //Generate revenue in analysis
    public int getRevenue()
    {
        int revenue = 0;
        for(Auction auction : auctionsList)
        {
            for(Product product : auction.getProductsList())
            {
                if(product.getBiddingStatus())
                {
                    revenue+=product.getMaximumBid().getBidAmount();
                }
            }
        }
        return revenue;
    }
}
