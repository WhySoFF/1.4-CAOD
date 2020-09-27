package PhoneNumbers;

import java.util.Scanner;

class List {

    private static Node head = null;
    private static Node last = head;

    static void addNumber() {
        if (head == null) {
            head = new Node(scan());
            last = head;
            printAccess();
        } else {
            Node temp = new Node(scan());
            last.next = temp;
            temp.previous = last;
            last = last.next;
            printAccess();
        }
    }

    static void recreate() {
        while (last != head) {
            if (Integer.toString(last.number).length() == 7) {
                NewList.addNumber(last.number);
                last = last.previous;
            } else {
                last = last.previous;
            }
        }
        if (Integer.toString(last.number).length() == 7) {
            NewList.addNumber(last.number);
        }
    }

    static class Node {
        int number;
        Node next;
        Node previous;
        Node(int number) {
            this.number = number;
            next = null;
            previous = null;
        }
    }

    static int scan() {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int number;
        if (line.length() == 7 || line.length() == 3) {
            try {
                number = Integer.parseInt(line);
            } catch (Exception e) {
                printError();
                number = scan();
            }
        } else {
            printError();
            number = scan();
        }
        return number;
    }

    static void printNumbers() {
        System.out.println();
        Node current = head;
        while (current != null) {
            System.out.println(current.number + " ");
            current = current.next;
        }
        System.out.println();
    }

    static void printAccess() {
        System.out.println("Number is created");
    }

    static void printError() {
        System.out.println("Number is Incorrect");
    }
}
