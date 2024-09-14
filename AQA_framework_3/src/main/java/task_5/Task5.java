package task_5;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task5 {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            File inputJson= new File("C:\\Users\\Uliana\\IdeaProjects\\AQA-framework\\AQA_framework_3\\src\\main\\resources\\task_5\\input.json");
            File outputJson= new File("C:\\Users\\Uliana\\IdeaProjects\\AQA-framework\\AQA_framework_3\\src\\main\\resources\\task_5\\output.json");

            FruitBasket fruitBasket = objectMapper.readValue(Files.readString(inputJson.getAbsoluteFile().toPath()), FruitBasket.class);
            System.out.println(fruitBasket);
            fruitBasket.setIsTasty(false);
            fruitBasket.getFruits().add("avocado");
            System.out.println(fruitBasket);
            objectMapper.writeValue(outputJson, fruitBasket);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
