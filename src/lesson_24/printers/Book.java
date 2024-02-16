package lesson_24.printers;
/*
@date 16.02.2024
@author Sergey Bugaienko
*/

public class Book implements Printable {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void sayHello(String string) {
        System.out.println("Override method sayHello " + string + "; " + POWER);
        //обращаюсь на прямую к константе интерфейсе
    }


    @Override
    public void print(int number) {
        System.out.println(number);
    }

    public void bookSayHello() {
        System.out.println("Hello, " + title);
    }

    @Override
    public void print() {
        System.out.println("Print book " + title + " (author: " + author + ")");
    }
}
