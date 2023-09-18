package Hiberanet_Projects;

import java.util.List;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Display_Records_EmployeeTable {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Rohit");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        Query q = manager.createQuery("Select 'e' from hiberanet.Employee");
        List<Employee> list = q.getResultList();
        for (Employee e : list) {

            System.out.println(e.getId() + " " + e.getEname() + " " + e.getSalary() + " " + e.getDipartment());

        }

    }
}
