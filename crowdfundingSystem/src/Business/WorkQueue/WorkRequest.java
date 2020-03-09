/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Organization.Organization.Type;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author raunak
 */
public  class WorkRequest {
    private String projectName;
    private String details;
    private double requestFunds;
    private double recievedFunds;
    private Organization.Type sector;
    private String status;
    private double providedFunds;
    private HashMap<UserAccount,Double> InvestorInformation;
    public WorkRequest(){
        InvestorInformation = new HashMap<UserAccount,Double>();      
    }

    public HashMap<UserAccount, Double> getInvestorInformation() {
        return InvestorInformation;
    }
    
    public double getProvidedFunds() {
        return providedFunds;
    }

    public void setProvidedFunds(double providedFunds) {
        this.providedFunds = providedFunds;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Type getSector() {
        return sector;
    }

    public void setSector(Type sector) {
        this.sector = sector;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public double getRequestFunds() {
        return requestFunds;
    }

    public void setRequestFunds(double requestFunds) {
        this.requestFunds = requestFunds;
    }

    public double getRecievedFunds() {
        return recievedFunds;
    }

    public void setRecievedFunds(double recievedFunds) {
        this.recievedFunds = recievedFunds;
    }
    

    @Override
    public String toString(){
        return projectName;
    }
}
