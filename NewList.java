package PhoneNumbers;

class NewList {

    static Node root = null;

    static Node addNode(Node current, int number) {
        if (current == null) {
            return new Node(number);
        } else {
            Node temp = new Node(number);
            if (current.next == null) {
                Node compare = compare(current, temp);
                if (compare == current) {
                    current.next = temp;
                } else {
                    temp = current;
                    current = compare;
                    current.next = temp;
                }
            } else {
                Node compare = compare(current, temp);
                if (compare == current) {
                    current.next = addNode(current.next, number);
                } else {
                    temp = current;
                    Node help = current.next;
                    current = compare;
                    current.next = temp;
                    current.next.next = help;
                }
            }
        }
        return current;
    }

    static void printNumbers(){
        Node current = root;
        System.out.println("New List:\n");
        while(current != null){
            System.out.println(current.number);
            current = current.next;
        }
    }

    static void addNumber(int number) {
        root = addNode(root, number);
    }

    static Node compare(Node first, Node second) {
        if (first.number > second.number) {
            return second;
        }
        return first;
    }

    static class Node {
        int number;
        Node next;
        Node(int number) {
            this.number = number;
            next = null;
        }
    }
}

