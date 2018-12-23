/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Bid;

/**
 *
 * @author QuickLearners
 */
public class IllegalBidAmountException extends Exception{

    public IllegalBidAmountException(int minBidAmount) 
    {
        super("The bid amount must be greater than the minimum bid amount of : $"+minBidAmount);
    } 
}
