package task_8;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import task_2.Main;

public class Task8Test {
    Main main;

    @BeforeTest
    public void init(){
        main = new Main();
    }

    @Test(dataProvider = "compareProvider")
    public void testCompare(int v1, int v2, String expectedResult) {
        String actualResult = main.compare(v1, v2);
        Assert.assertEquals(actualResult, expectedResult, "unexpected result");
    }
    @Test(dataProvider = "evenOddProvider")
    public void testIsEven(int num, String expectedResult) {
        String actualResult = main.isEven(num);
        Assert.assertEquals(actualResult, expectedResult, "unexpected result");
    }
    @Test(dataProvider = "maxOfThreeProvider")
    public void testMaxOfThree(int n1, int n2, int n3, int expectedResult) {
        int actualResult = main.maxOfThree(n1, n2, n3);
        Assert.assertEquals(actualResult, expectedResult, "unexpected result");
    }

    @DataProvider
    public Object[][] compareProvider() {
        return new Object[][] {
                {10, 20, "Variable 'v2' is greater than 'v1'"},
                {20, 10, "Variable 'v1' is greater than 'v2'"},
                {15, 15, "Both variables are equal"}
        };
    }
    @DataProvider
    public Object[][] evenOddProvider() {
        return new Object[][] {
                {4, "Even"},
                {7, "Odd"}
        };
    }
    @DataProvider
    public Object[][] maxOfThreeProvider() {
        return new Object[][] {
                {5, 9, 3, 9},
                {10, 10, 5, 10},
                {1, 1, 1, 1}
        };
    }
}

// 1. Create 3 simple unit tests for Task_2 (modify your code to have 3 different methods in Task_2 solving if needed).
// 2. Create testng.xml which should execute your test class. Execute this file
// 3. Add a Data provider for each test.
// 4. Create a test with parameters loaded from testng.xml.