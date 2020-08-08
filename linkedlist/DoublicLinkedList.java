package org.dsf.linkedlist;

public class DoublicLinkedList {

    class Node{
        Node next, prev;
        Object value;

        public Node(Object value){
            this.value=value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", prev=" + prev +
                    ", value=" + value +
                    '}';
        }
    }


    Node head;


    public static void main(String[] args) {

    }


}
