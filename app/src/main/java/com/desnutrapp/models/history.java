package com.desnutrapp.models;


public class history extends  model{
    String names;
    String lastNameP;
    String lastNameM;
    father father;
    mather mather;
    children children;

    public history() {
        //builder required
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public children getChildren() {
        return children;
    }

    public String getLastNameP() {
        return lastNameP;
    }

    public void setLastNameP(String lastNameP) {
        this.lastNameP = lastNameP;
    }

    public String getLastNameM() {
        return lastNameM;
    }

    public void setLastNameM(String lastNameM) {
        this.lastNameM = lastNameM;
    }

    public com.desnutrapp.models.father getFather() {
        return father;
    }

    public void setFather(com.desnutrapp.models.father father) {
        this.father = father;
    }

    public com.desnutrapp.models.mather getMather() {
        return mather;
    }

    public void setMather(com.desnutrapp.models.mather mather) {
        this.mather = mather;
    }

    public void setChildren(com.desnutrapp.models.children children) {
        this.children = children;
    }
}
