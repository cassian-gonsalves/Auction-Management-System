/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Auction;

/**
 *
 * @author Quicklearners
 */
public class DuplicateAuctionNameException extends Exception {
    public DuplicateAuctionNameException(String name)
    {
        super("Auction with name "+name+" already exists");
    }
}
