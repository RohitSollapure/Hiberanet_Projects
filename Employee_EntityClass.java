package Hiberanet_Projects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee_EntityClass {
    @Id
    private int id;
    String Ename;
    private int salary;
    String dipartment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDipartment() {
        return dipartment;
    }

    public void setDipartment(String dipartment) {
        this.dipartment = dipartment;
    }

}
