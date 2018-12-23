/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Member;

import Business.DeliveryRequest.DeliveryRequest;
import Business.DeliveryRequest.DeliveryRequestDirectory;
import Business.Product.Product;
import java.util.List;

/**
 *
 * @author QickLearners
 */
public class DeliveryAdmin extends Member{
    DeliveryRequestDirectory deliveries;

    public DeliveryAdmin() {
        deliveries = new DeliveryRequestDirectory();
    }
    
    public List<DeliveryRequest> getDeliveryRequests()
    {
        return this.deliveries.getDeliveryRequestList();
    }
    
    public void addDeliveryRequest(DeliveryRequest deliveryRequest)
    {
        this.deliveries.addDeliverRequest(deliveryRequest);
    }
    
    public String getProductStatus(Product product)
    {
        String status = "Delivery not requested";
        
        for(DeliveryRequest deliveryRequest: this.getDeliveryRequests())
        {
            if(deliveryRequest.getProduct().getName().equals(product.getName()))
            {
                status = "Delivery requested";
                if(deliveryRequest.isDelivered())
                {
                    status = "Product dispatched for delivery";
                }
                break;
            }
        }
        
        return status;
    }
}
