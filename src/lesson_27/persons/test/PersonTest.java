package lesson_27.persons.test;

import org.junit.jupiter.api.*;

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

    @Nested
    @Disabled
    class NestedTest {
        @BeforeEach
        public  void setStartValue() {
            System.out.println("Nested Before Each");
        }

        @Test
        void testNested() {
            Assertions.assertEquals(5, 5);
        }
    }

    @Disabled
    @Test
    public void testMethod(){
        Assertions.assertEquals(2, 5);
    }


}