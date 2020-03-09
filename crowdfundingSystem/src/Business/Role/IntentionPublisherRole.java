/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Employee.Employee;
import javax.swing.JPanel;
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import userinterface.IntentionPublisherRole.IntentionPublisherWorkAreaJPanel;

/**
 *
 * @author Lenovo
 */
public class IntentionPublisherRole extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,  Network network,EcoSystem business, Employee employee) {
        return new IntentionPublisherWorkAreaJPanel(userProcessContainer,account,organization, enterprise, network);
    }
     @Override
    public String toString() {
        return "IntentionPublisher Role";
    }
}
