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

        List<Supplier> suppliers = generateSuppliers();
        fruit.setSuppliers(suppliers);
        suppliers.forEach(supplier -> supplier.setFruits(Arrays.asList(fruit)));

        session.save(fruitBasket);
        session.save(fruit);
        suppliers.forEach(session::save);

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

        session.close();

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

    private static List<Supplier> generateSuppliers() {
        Random random = new Random();
        Supplier supplier1 = new Supplier();
        supplier1.setName("Supplier_" + UUID.randomUUID().toString().substring(0, 8));

        Supplier supplier2 = new Supplier();
        supplier2.setName("Supplier_" + UUID.randomUUID().toString().substring(0, 8));

        Supplier supplier3 = new Supplier();
        supplier3.setName("Supplier_" + UUID.randomUUID().toString().substring(0, 8));

        return Arrays.asList(supplier1, supplier2, supplier3);
    }

}

//Implement OneToOne, OneToMany, and ManyToMany relations in your models from the previous task.(Task_6)
//Test it by CRUD.