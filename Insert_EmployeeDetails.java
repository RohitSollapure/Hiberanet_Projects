package Hiberanet_Projects;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert_EmployeeDetails {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Rohit");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        // Adding Employee 1
        // Details--------------------------------------------------------
        Employee e1 = new Employee();
        e1.setId(1);
        e1.setEname("Rohit");
        e1.setSalary(10000);
        e1.setDipartment("Developer");

        // Adding Employee 2
        // Details-----------------------------------------------------------
        Employee e2 = new Employee();
        e2.setId(2);
        e2.setEname("Kaveri");
        e2.setSalary(35000);
        e2.setDipartment("Testing");

        // Adding Employee 3
        // Details------------------------------------------------------------
        Employee e3 = new Employee();
        e3.setId(3);
        e3.setEname("Roopa");
        e3.setSalary(40000);
        e3.setDipartment("FullStack Developer");

        // Transpiring the details to the database---------------------------
        transaction.begin();
        manager.persist(e1);
        manager.persist(e2);
        manager.persist(e3);
        transaction.commit();
    }
}
