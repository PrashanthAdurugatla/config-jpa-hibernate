package io.academy.simple;

import javax.persistence.*;
import java.util.List;

public class Tester {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


          //To INSERT into TABLE
//        Employee emp = new Employee();
//        emp.setEmail("Padurugatla@gmail.com");
//        emp.setFirstName("Prashanth");
//        emp.setLastName("Adurugatla");
//
//        //Wrap the object in the Transaction bcoz by default JPA set AUTO COMMIT to FALSE
//        entityManager.getTransaction().begin();
//        entityManager.persist(emp);
//        entityManager.getTransaction().commit();


        //FIND by id
//        Employee emp =entityManager.find(Employee.class, "b2bce7a9-5586-43b9-8ab1-fdc8738f5166");
//        System.out.println(emp);

        //UPDATE
//        Employee emp = entityManager.find(Employee.class, "b2bce7a9-5586-43b9-8ab1-fdc8738f5166");
//        emp.setFirstName("Prash");
//
//        //All write statements should be wrapped in Transaction
//        entityManager.getTransaction().begin();
//        entityManager.merge(emp);
//        entityManager.getTransaction().commit();

        //DELETE
//        Employee emp = entityManager.find(Employee.class, "b2bce7a9-5586-43b9-8ab1-fdc8738f5166");
//        entityManager.getTransaction().begin();
//        entityManager.remove(emp);
//        entityManager.getTransaction().commit();


        //FINDALL WE USE JPQL TO WRITE OUR OWN METHODS
//        TypedQuery<Employee> query = entityManager.createQuery("SELECT emp FROM Employee emp ORDER BY emp.email ASC", Employee.class);
//        List<Employee> resultList = query.getResultList();
//        for (Employee emp: resultList)
//            System.out.println(emp);


        //FIND BY EMAIL
//        Query query1 = entityManager.createNamedQuery("Employee.findByEmail", Employee.class);
//        query1.setParameter("paramEmail", "padurugatla9@gmail.com");
//        List resultList = query1.getResultList();
//        System.out.println(resultList);

        entityManager.close();
        entityManagerFactory.close();

    }
}
