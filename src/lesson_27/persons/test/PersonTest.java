package lesson_27.persons.test;

import lesson_28.EnumTest;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


class PersonTest {


    // Метод, помеченный этой аннотацией выполняется перед каждым тестом (перед каждым методом, помеченным аннотацией @Test
    @BeforeEach
    public void setUp() {
        System.out.println("Метод @BeforeEach");
    }

    // @BeforeAll - метод запускается один раз перед выполнением первого теста
    // @AfterEach - выполняется после каждого тестового метода
    // @AfterAll - выполняется один раз после всех тестовых методов
    // @Disabled - указывает, что тест или группа тестов отключен и выполняться не будет
    // @Nested - позволяет создавать вложенный тестовый класс. Может быть использовано для группировки тестовых метод

    @Test // указывает, что метод является тестовым
    public void testAddition() {
        int result = 2 + 2;

        Assertions.assertEquals(4, result); // проверяет равны ли два значения
        Assertions.assertNotEquals(5, result); // тест будет пройден если "не ожидаемый результат" не совпадет с фактический
        assertTrue(4 == result); // проверяет, что условие верно
        assertFalse(5 == result); // проверяет, что условия ложно
        assertNull(null); // проверяет, что объект равен null
        assertNotNull("String"); // првоеряет, что объект не равен null
    }

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "cherry", "fig"})
    public void testFruits(String fruit) {
        System.out.println("current value: " + fruit);
        Assertions.assertTrue(fruit.length() > 3);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, -1, 4, 5})
    public void testInts(int value) {
        System.out.println("current value: " + value);
        Assertions.assertTrue(value > 0);
    }

    @ParameterizedTest
    @EnumSource(EnumTest.class)
        // В качестве источника набор констант из перечисления
    void testEnums(EnumTest value) {
        assertNotNull(value);
    }

    // В качестве источника данных может быть статических метод
    @ParameterizedTest
    @MethodSource("stringProvider")
    public void testFruitsMethodSource(String argument) {
        System.out.println("Current stream arg: " + argument);
        Assertions.assertTrue(argument.length() > 0);
    }

    static Stream<String> stringProvider() {
        return Stream.of("apple", "banana", "fig", "orange");
    }

    @ParameterizedTest
    @CsvSource({"apple, 1, true", "banana, 2, false", "cherry, 3, true"})
    public void testWithCsvSource(String fruit, int rank, boolean flag) {
        System.out.println(fruit + " | " + rank + " | " + flag);
        assertNotNull(fruit);
        assertTrue(rank > 0);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "data.csv")
    public void testWithFileSource(String fruit, int rank, boolean flag) {
        System.out.println(fruit + " | " + rank + " | " + flag);
        Assertions.assertNotNull(fruit);
    }

    @ParameterizedTest
    @MethodSource("squareTestData")
    public void testSquare(int input, int expected, boolean isEqual) {
        int result = input * input;
//        Assertions.assertEquals(expected, result);
        assertEquals(isEqual, result == expected);
    }

    static Stream<Arguments> squareTestData() {
        return Stream.of(
                Arguments.of(2, 4, true), //
                Arguments.of(3, 9, true),
                Arguments.of(4, 15, false)
        );
    }


    @Nested
    @Disabled
    class NestedTest {
        @BeforeEach
        public void setStartValue() {
            System.out.println("Nested Before Each");
        }

        @Test
        void testNested() {
            Assertions.assertEquals(5, 5);
        }
    }

    @Disabled
    @Test
    public void testMethod() {
        Assertions.assertEquals(2, 5);
    }


}