
package com.mycompany.oopexampractice;


public class Manager {
    
    public int teamSize;

    public Manager() {
    }

    public Manager(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return "Manager{" + "teamSize=" + teamSize + '}';
    }

   
    
    
    
}
