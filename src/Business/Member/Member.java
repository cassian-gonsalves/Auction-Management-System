/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Member;

import java.util.Comparator;

/**
 *
 * @author QuickLearners
 */
public class Member {
    
    private String name;
    private int id;

    public Member() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
    //returns a comparator that will sort the list of members by their id in descending order
    public static Comparator<Member> sortByID()
    {
        return (m1,m2)->Integer.compare(m2.getId(), m1.getId());
    }
}
