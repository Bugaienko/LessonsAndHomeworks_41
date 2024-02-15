package homework_22.abstractP;
/*
@date 15.02.2024
@author Sergey Bugaienko
*/

public class SuperAbstract extends TestAbstract {

    public static void main(String[] args) {
        TestAbstract testAbstract = new SuperAbstract();

        SuperAbstract superAbstract = new SuperAbstract();

        testAbstract.test();
        superAbstract.test();

    }
}
