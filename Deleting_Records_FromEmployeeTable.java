package Hiberanet_Projects;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Deleting_Data_FromEmployeeTable {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Rohit");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Id you want to Delete....");
        int id = sc.nextInt();
        Employee e = manager.find(Employee.class, id);
        if (e != null) {
            transaction.begin();
            manager.remove(e);
            transaction.commit();
        } else {
            System.out.println("Id is not valid.....");
        }

    }
}
