package task_7;

import org.hibernate.Session;
import org.hibernate.Transaction;
import task_6.HibernateUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Task7 {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        //create
        FruitBasket fruitBasket = generateFruitBasket();
        Fruit fruit = generateFruit();

        fruit.setFruitBasket(fruitBasket);
        fruitBasket.setFruit(fruit);

        session.save(fruitBasket);
        transaction.commit();

        //read
        session.beginTransaction();
        FruitBasket savedBasket = session.get(FruitBasket.class, fruitBasket.getId());
        Fruit savedFruit = savedBasket.getFruit();
        session.getTransaction().commit();

        //update
        session.beginTransaction();
        savedFruit.setName("UpdatedFruitName");
        savedBasket.setType("UpdatedType");
        session.update(savedFruit);
        session.getTransaction().commit();

        //delete
        session.beginTransaction();
        session.delete(savedBasket);
        session.getTransaction().commit();

    }

    private static Fruit generateFruit() {
        Fruit fruit = new Fruit();
        fruit.setName(UUID.randomUUID().toString());
        return fruit;
    }

    private static FruitBasket generateFruitBasket() {
        FruitBasket res = new FruitBasket();
        Random random = new Random();
        res.setIsTasty(random.nextBoolean());
        List<String> fruitTypes = Arrays.asList("Citrus", "Berry", "Tropical");
        res.setType(fruitTypes.get(random.nextInt(fruitTypes.size())));
        return res;
    }

}

//Implement OneToOne, OneToMany, and ManyToMany relations in your models from the previous task.(Task_6)
//Test it by CRUD.