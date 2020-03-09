/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.IntentionPublisherRole;
import Business.Role.RequestApprovalRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class InvestmentOrganization extends Organization{
    public  InvestmentOrganization(){
        super(Organization.Type.Investment.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new IntentionPublisherRole());
        roles.add(new RequestApprovalRole());
        return roles;
    }
}
