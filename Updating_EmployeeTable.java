package Hiberanet_Projects;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Updating_EmployeeTable {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Rohit");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Id You want to update...");
        int id = sc.nextInt();
        Employee e = manager.find(Employee.class, id);
        if (e != null) {
            System.out.println("Enter the name you want to update...");
            String name = sc.next();
            e.setEname(name);
            transaction.begin();
            manager.merge(e);
            transaction.commit();
        } else {
            System.out.println("Id not found...");
        }

    }
}
