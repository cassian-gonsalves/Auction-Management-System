/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Member.MemberDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private MemberDirectory memberDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    
    public enum Type
    {
        Admin("Admin Organization"), 
        Dealer("Dealer"), 
        Customer("Customer"),
        DeliveryAdmin("Delivery Admin"),
        Analyst("Analyst");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        memberDirectory = new MemberDirectory();
        userAccountDirectory = new UserAccountDirectory();
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }
    
    public MemberDirectory getMemberDirectory() {
        return memberDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    public static Comparator<Organization> sortByID()
    {
        return (m1,m2)->Integer.compare(m2.getOrganizationID(), m1.getOrganizationID());
    }
}
