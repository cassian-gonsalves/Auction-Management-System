/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Auction;

import Business.Product.Product;
import Business.Product.ProductsDirectory;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Quicklearners
 */

//Auction Pojo class
public class Auction {
    private String name;
    private int id;
    
    //Object of product directory
    private ProductsDirectory productsDirectory;
    
    //initializing product directory
    public Auction()
    {
        productsDirectory = new ProductsDirectory();
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

    public ProductsDirectory getProductsDirectory() {
        return productsDirectory;
    }
    
    //adding product to product list
    public void addProduct(Product product)
    {
        this.productsDirectory.addProduct(product);
    }
    
    
    
    //Return if the product is open for bidding
    public boolean isActive()
    {
       boolean isActive = false;
       for(Product product: productsDirectory.getProductsList())
       {
           if(!product.getBiddingStatus())
           {
               isActive = true;
               break;
           }
       }
       return isActive;
    }
    
    

    @Override
    public String toString() {
        return this.name;
    }
    
    public List<Product> getProductsList()
    {
        return this.productsDirectory.getProductsList();
    }
    
    
    //returns a comparator that will sort the Auctions by their id in descending order
    public static Comparator<Auction> sortByID()
    {
        return (m1,m2)->Integer.compare(m2.getId(), m1.getId());
    }
    
    
    //Check if product name already exists
    public boolean isValidName(String name)
    {
        for(Product prod: this.getProductsList())
        {
            if(prod.getName().equals(name))
            {
                return false;
            }
        }
        return true;
    }
}
