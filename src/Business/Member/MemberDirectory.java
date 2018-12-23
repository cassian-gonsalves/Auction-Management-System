/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Member;

import Business.Organization.DealerOrganization;
import Business.Organization.DeliveryAdminOrganization;
import Business.Organization.Organization;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raunak
 */
public class MemberDirectory {
    
    private List<Member> membersList;
    private int maxMemberId;

    public MemberDirectory() {
        membersList = new ArrayList();
        maxMemberId = getMaxMemberID();
    }

    public List<Member> getMembersList() {
        return membersList;
    }
    
    public Member createMember(String name){
        Member member = new Member();
        member.setName(name);
        member.setId(++maxMemberId);
        membersList.add(member);
        return member;
    }

    public Member createMember(String name, Organization organization) {
        if(organization instanceof DealerOrganization)
        {
            Member dealer = new Dealer();
            dealer.setName(name);
            dealer.setId(++maxMemberId);
            membersList.add(dealer);
            return dealer;
        }
        else if(organization instanceof DeliveryAdminOrganization)
        {
            Member deliveryAdmin = new DeliveryAdmin();
            deliveryAdmin.setName(name);
            deliveryAdmin.setId(++maxMemberId);
            membersList.add(deliveryAdmin);
            return deliveryAdmin;
        }
        else
        {
            return createMember(name);
        }
    }
    
    private int getMaxMemberID()
    {
        if(!this.membersList.isEmpty())
        {
            this.membersList.sort(Member.sortByID());
            return this.membersList.get(this.membersList.size()-1).getId();
        }
        return 0;
    }
    
    public boolean isValidName(String name)
    {
        for(Member member: this.membersList)
        {
            if(member.getName().equals(name))
            {
                return false;
            }
        }
        return true;
    }
}