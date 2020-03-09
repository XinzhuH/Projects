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


    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Accounting.getValue())){
            organization = new AccountingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Charity.getValue())){
            organization = new CharityOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Commercial.getValue())){
            organization = new CommercialOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Individual.getValue())){
            organization = new IndividualSector();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Investment.getValue())){
            organization = new InvestmentOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
}