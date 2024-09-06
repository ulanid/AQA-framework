package task_5;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Task5XML {
    public static void main(String[] args) throws IOException {
        File inputXml= new File("AQA_framework_3\\src\\main\\resources\\task_5\\input.xml");
        File outputXml = new File("AQA_framework_3\\src\\main\\resources\\task_5\\output.xml");
        XmlMapper xmlMapper = new XmlMapper();
        FruitBasket fruitBasket = xmlMapper.readValue(Files.readString(inputXml.getAbsoluteFile().toPath()), FruitBasket.class);
        System.out.println(fruitBasket);
        fruitBasket.setIsTasty(false);

        xmlMapper.writeValue(outputXml, fruitBasket);
    }
}
