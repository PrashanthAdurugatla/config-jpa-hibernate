package io.academy;

import io.academy.entity.Address;
import io.academy.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesterRelationalEntity {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

//        User user = new User();
//
//        user.setEmail("abc@gmail.com");
//        user.setFirstName("ABC");
//        user.setLastName("XYZ");
//
//        Address address = new Address();
//        address.setCity("Hayward");
//        address.setState("CA");
//        address.setStreet("Carlos Bee Blvd");
//
//
//        entityManager.getTransaction().begin();
//        //Persist Dependency object First
//        //Then it gives an ID and using that ID put the data in user Table
//        entityManager.persist(address);
//        user.setAddress(address);
//
//        entityManager.persist(user);
//        entityManager.getTransaction().commit();


        //FIND by ID
//        User user = entityManager.find(User.class, "99285322-f738-4703-b329-e8dd85f2d365");
//        System.out.println(user);



        entityManager.close();
        entityManagerFactory.close();
    }
}
