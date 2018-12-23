/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    private int maxOrganizationId;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
        maxOrganizationId = getMaxMemberID();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    //Id Generation
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Dealer.getValue())){
            organization = new DealerOrganization();
            organization.setOrganizationID(++maxOrganizationId);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Customer.getValue())){
            organization = new CustomerOrganization();
            organization.setOrganizationID(++maxOrganizationId);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.DeliveryAdmin.getValue())){
            organization = new DeliveryAdminOrganization();
            organization.setOrganizationID(++maxOrganizationId);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Analyst.getValue())){
            organization = new AnalystOrganization();
            organization.setOrganizationID(++maxOrganizationId);
            organizationList.add(organization);
        }
        return organization;
    }
    
    private int getMaxMemberID()
    {
        if(!this.organizationList.isEmpty())
        {
            this.organizationList.sort(Organization.sortByID());
            return this.organizationList.get(this.organizationList.size()-1).getOrganizationID();
        }
        return 0;
    }
    
    public boolean isValidType(Type type)
    {
        for(Organization org : this.organizationList)
        {
            if(org.getName().equals(type.getValue()))
            {
                return false;
            }
        }
        return true;
    }
}