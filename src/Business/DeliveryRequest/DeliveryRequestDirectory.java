/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryRequest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author QuickLearners
 */
public class DeliveryRequestDirectory {
    
   List<DeliveryRequest> deliveryRequestList;

    public DeliveryRequestDirectory() {
        this.deliveryRequestList = new ArrayList<DeliveryRequest>();
    }
   
    public List<DeliveryRequest> getDeliveryRequestList() {
        return deliveryRequestList;
    }
    
    
    //Adding Delivery List to list
    public void addDeliverRequest(DeliveryRequest deliveryRequest)
    {
        this.deliveryRequestList.add(deliveryRequest);
    }

}
