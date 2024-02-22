package util;
/*
@date 22.02.2024
@author Sergey Bugaienko
*/

public class MyLinkedList <T> {



    private static class Node<T> {
        T value;
        Node<T> previous;
        Node<T> next;

        public Node(T value, Node<T> previous, Node<T> next) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }

    }
}
