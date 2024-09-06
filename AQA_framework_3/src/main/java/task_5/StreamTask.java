package task_5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask {
    public static void main(String[] args) {

        int n = 10;
        Random random = new Random();
        if(args.length>0){
            n = Integer.parseInt(args[0]);
        }

        List<FruitBasket> inputList = IntStream.range(1,n).mapToObj(i -> {
            FruitBasket fruitBasket = new FruitBasket();
            fruitBasket.setIsTasty(random.nextBoolean());
            fruitBasket.setType(UUID.randomUUID().toString());
            fruitBasket.setFruits(new ArrayList<>());
            fruitBasket.getFruits().add(UUID.randomUUID().toString());

            return fruitBasket;
        }).collect(Collectors.toList());

        inputList.stream().forEach(System.out::println);

        System.out.println();

        List <FruitBasket> outputList = inputList.stream()
                .filter(item-> item.getType().contains("2"))
                .sorted(Comparator.comparing(FruitBasket::getIsTasty))
                .sorted(Comparator.comparing(FruitBasket::getType))
                .collect(Collectors.toList());

        System.out.println(outputList);

    }
}

// 2. Stream:
// a) Generate 10 random objects using a class from a previous task
// b) Sort it using any two fields using stream.
// c) Filter it by any two fields custom filter.
// d) Collect it to List with *main field(s).