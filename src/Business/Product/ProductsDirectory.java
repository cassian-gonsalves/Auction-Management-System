/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import java.util.ArrayList;

/**
 *
 * @author cassian
 */
public class ProductsDirectory {
    
    private ArrayList<Product> productsList;
    private int maxProductId;
        
    public ProductsDirectory() {
        productsList = new ArrayList();
        maxProductId = getMaxProductID();
    }

    public ArrayList<Product> getProductsList() {
        return productsList;
    }

    public void addProduct(Product product)
    {
        product.setId(++maxProductId);
        this.productsList.add(product);
    }
    
    private int getMaxProductID()
    {
        if(!this.productsList.isEmpty())
        {
            this.productsList.sort(Product.sortByID());
            return this.productsList.get(this.productsList.size()-1).getId();
        }
        return 0;
    }
}
