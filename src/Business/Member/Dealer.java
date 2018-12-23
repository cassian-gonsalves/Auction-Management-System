/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Member;

import Business.Auction.Auction;
import Business.Auction.AuctionsDirectory;
import Business.Auction.DuplicateAuctionNameException;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author QucikLearners
 */
public class Dealer extends Member{
    private AuctionsDirectory auctionsDirectory = new AuctionsDirectory();
    
    
    //Add Auction If Duplicate name doesnot exist
    public void addAuction(Auction auction) throws DuplicateAuctionNameException
    {
        for(Auction auc : this.getAuctionList())
        {
            if(auc.getName().equals(auction.getName()))
            {
                throw new DuplicateAuctionNameException(auc.getName());
            }
        }
        this.auctionsDirectory.addAuction(auction);
    }
    
    public List<Auction> getAuctionList()
    {
        return this.auctionsDirectory.getAuctionsList();
    }
    
    public void removeAuction(Auction auction)
    {
        this.auctionsDirectory.removeAuction(auction);
    }
    
    public int getRevenue()
    {
        return this.auctionsDirectory.getRevenue();
    }
    
    
    public static Comparator<Dealer> sortByRevenue()
    {
        return (d1,d2)->Integer.compare(d2.getRevenue(), d1.getRevenue());
    }
}
