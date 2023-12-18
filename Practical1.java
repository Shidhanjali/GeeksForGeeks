//Practical1
import java.util.Scanner;
public class LinkedList{
    Node head;
    class Node {
        int data;
        Node next;
        
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public LinkedList insert LinkedList list, int data)
    {
        Node new_node = new Node(data);
        
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    public LinkedList insertspecific(LinkedList list, int data, int pos)
    {
        Node new_node = new Node(data);
        
        if (list.head == null) {
            System.out.print("LinkedList empty , can't insert at specific position");
        }
        else {
            Node last = list.head;
            for(int i=0;i<pos-2;i++) {
                last = last.next;
            }
            new_node.next = last.next;
            last.next = new_node;
        }
        return list;
    } 
    public LinkedList delete LinkedList list, int pos)
    {
        if (list.head == null) {
            System.out.print("LinkedList empty , can't delete");
        }
        else {
            Node last = list.head;
            for(int i=0;i<pos-2;i++) {
                last = last.next;
            }
            last.next=last.next.next;
        }
        return list;
    } 
    public void printList(App list)
    {
        Node currNode = list.head;
        System.out.print("LinkedList: ");
    
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
    public static void main(String[] args)
    {
        try (Scanner s = new Scanner(System.in)) {
           LinkedList list = new App();
            list.insert(list, 1);
            list.insert(list, 3);
            list.insert(list, 4);
            list.insert(list, 5);
            list.insert(list, 6);
            System.out.print("Linklist inserted by you:-");
            list.printList(list);

            System.out.print("\n\nLinklist after inserting:-");
            list.insertspecific(list,2,2);
            list.printList(list);

            System.out.print("\n\nLinklist after deleting:-");
            list.delete(list,2);
            list.printList(list);
        }
    } 
}
