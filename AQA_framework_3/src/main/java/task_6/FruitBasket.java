package task_6;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "fruits")

public class FruitBasket implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

//    @Column()
//    List<String> fruits;
    @Column
    Boolean isTasty;
    @Column
    String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getIsTasty() {
        return isTasty;
    }

    public void setIsTasty(Boolean tasty) {
        isTasty = tasty;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "FruitBasket{" +
                "id=" + id +
                ", isTasty=" + isTasty +
                ", type='" + type + '\'' +
                '}';
    }
}

