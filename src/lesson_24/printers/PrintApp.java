package lesson_24.printers;
/*
@date 16.02.2024
@author Sergey Bugaienko
*/

public class PrintApp {

    public static void main(String[] args) {

        Book book = new Book("Java", "B. Eckel");
        book.print();
        book.bookSayHello();

        Printable printableBook = new Book("Test", "someone");

        printableBook.print();
        // printableBook.bookSayHello(); такой метод по типу ссылки Printable не доступен

        Printable presentationWB = new Presentation("Title", 24, "Theme");

        presentationWB.print();
        System.out.println("\n ====================== \n");
        ColorPrintable presentationColor = new Presentation("Color", 12, "color World");

        presentationColor.print();
        presentationColor.colorPrint();

        System.out.println("\n ====================== \n");

        Printable[] printables = new Printable[2];
        printables[0] = book;
        printables[1] = presentationColor;

        for (Printable printable : printables) {
            printable.print();
            printable.sayHello("World");
        }

        System.out.println("\n ======================= \n");
        // вызов статического метода интерфейса
        Printable.staticMethod();

        System.out.println("\n ========================= \n");

        Printer printer = new Printer();

        printer.makeCopy(book);
        printer.makeCopy(presentationWB);
        printer.makeCopy(presentationColor);



    }

}
