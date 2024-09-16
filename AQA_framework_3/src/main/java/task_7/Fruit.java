package task_7;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "fruit")

public class Fruit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fruits_id")
    private FruitBasket fruitBasket;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fruit_basket_id")
    private FruitBasket basket;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)  // Ensure cascading is set to ALL
    @JoinTable(name = "fruit_supplier",
            joinColumns = @JoinColumn(name = "fruit_id"),
            inverseJoinColumns = @JoinColumn(name = "supplier_id"))
    private List<Supplier> suppliers;

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public FruitBasket getBasket() {
        return basket;
    }

    public void setBasket(FruitBasket basket) {
        this.basket = basket;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FruitBasket getFruitBasket() {
        return fruitBasket;
    }

    public void setFruitBasket(FruitBasket fruitBasket) {
        this.fruitBasket = fruitBasket;
    }
}