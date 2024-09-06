package task_5;

import java.io.Serializable;
import java.util.List;

public class FruitBasket implements Serializable {
    List<String> fruits;
    Boolean isTasty;
    String type;

    public List<String> getFruits() {
        return fruits;
    }

    public void setFruits(List<String> fruits) {
        this.fruits = fruits;
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
                "fruits=" + fruits +
                ", isTasty=" + isTasty +
                ", type='" + type + '\'' +
                '}';
    }
}

// 1. Serialization-Deserialization:
// a) Make some complex models using your variant.
// b) Make it serializable.
// c) Read JSON from “input.json”
// d) and deserialize it to POJO.
// e) Then change a few fields and save it to “output.json”.
// f) Do the same for XML.

// V2
// {
//     "fruits": ["apple", "banana", "orange"],
//     "isTasty": true,
//         "type": "citrus"
// }
// <fruitBasket>
//   <fruits>
//     <fruit>apple</fruit>
//     <fruit>banana</fruit>
//     <fruit>orange</fruit>
//   </fruits>
//   <isTasty>true</isTasty>
//   <type>citrus</type>
// </fruitBasket>
