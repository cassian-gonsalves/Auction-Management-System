/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author QuickLearners
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.AuctionAgency){
            enterprise=new AuctionAgencyEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
    
    //Check if enterprise with same name alrady exists
    public boolean isValidName(String name)
    {
        for(Enterprise enterprise: this.getEnterpriseList())
        {
            if(name.equalsIgnoreCase(enterprise.getName()))
            {
                return false;
            }
        }
        return true;
    }
}
