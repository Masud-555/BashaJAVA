
package com.mycompany.oopexampractice;

import com.sun.source.doctree.ReturnTree;



public class Employee {
    
    public String name;
    public int id;
    public int salary;

    public Employee() {
    }

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public String empl(){
        
        String emp = "Name : "+name+"\n"+"ID : "+id+"\n"+"Salary : "+salary+"\n";
    
    
    return emp;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", id=" + id + ", salary=" + salary + '}';
    }
    
    
    
}
