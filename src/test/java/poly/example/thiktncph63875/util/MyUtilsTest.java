package poly.example.thiktncph63875.util;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MyUtilsTest {
    static MyUtils myUtils;

    @BeforeAll
    static void setUpBeforeAll() {
        System.out.println("Set up my utils");
        myUtils = new MyUtils();
    }

    @AfterAll
    static void tearDownAfterAll() {
        System.out.println("Set up after all");

    }

    @Test
    @DisplayName("Cộng hai số nguyên")
    void add() {
        Assertions.assertEquals(5, new MyUtils().add(2,3));
        System.out.println("Done...");
    }
}