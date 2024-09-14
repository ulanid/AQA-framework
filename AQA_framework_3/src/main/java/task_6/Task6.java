package task_6;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Task6 {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        //create
        FruitBasket fruitBasket = new FruitBasket();
        fruitBasket.type="orange";
        Transaction transaction = session.beginTransaction();
        Long id = (Long) session.save(fruitBasket);
        transaction.commit();

        //update
        fruitBasket.isTasty=true;
        transaction = session.beginTransaction();
        session.update(fruitBasket);
        transaction.commit();

        //read
        fruitBasket = session.get(FruitBasket.class, id);
        System.out.println(fruitBasket);

        //delete
        session.delete(fruitBasket);
        fruitBasket = session.get(FruitBasket.class, id);
        System.out.println(fruitBasket);

        session.close();

    }
}

//Install MySQL server (or any SQL like db)
//Make at least two tables (Entities from the previous task or any additional if needed)
//Make models for those Entities (from Task_5)
//Setup Hibernate for those Entities and local DB
//Check basic CRUD (create, read, update, and delete the BD records using Hibernate)
//Generate a few rows into all tables
