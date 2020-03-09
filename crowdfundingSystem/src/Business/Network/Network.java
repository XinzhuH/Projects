/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author MyPC1
 */
public class Network {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private WorkQueue projectList;
    private WorkQueue intentionList;
    public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
        projectList = new WorkQueue();
        intentionList = new WorkQueue();
    }

    public WorkQueue getProjectList() {
        return projectList;
    }

    public void setProjectList(WorkQueue projectList) {
        this.projectList = projectList;
    }

    public WorkQueue getIntentionList() {
        return intentionList;
    }

    public void setIntentionList(WorkQueue intentionList) {
        this.intentionList = intentionList;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
