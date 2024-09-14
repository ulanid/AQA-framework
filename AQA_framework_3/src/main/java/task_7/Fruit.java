package task_7;

import javax.persistence.*;
import java.io.Serializable;

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