/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InitiatorRole;
import Business.Role.IntentionRecieverRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class CommercialOrganization extends Organization{

    public  CommercialOrganization(){
        super(Organization.Type.Commercial.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new IntentionRecieverRole());
        roles.add(new InitiatorRole());
        return roles;
    }
}
