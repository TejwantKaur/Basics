public class Linklist {
    public class node{
        int data; node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static node head;
    public static node tail;
    public static int size = 0;

    public void addFirst(int data){
        node newNode = new node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        node newNode = new node(data);
        size++;
        if(tail == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void addInMiddle(int idx,int data){
        node newNode = new node(data);
        if(idx == 0){
            addFirst(data);
            return;
        }
        size++;
        node temp = head;
        for(int i=0; i<idx-1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void removeFirst(){
        if(head == null){
            tail = null;
            System.out.println("LinkedList is Empty");
            return;
        }
        System.out.println("removed data is " + head.data);
        head = head.next;
        size--;
        
    }
    public void removeLast(){
        if(tail == null){
            System.out.println("LinkList is Empty");
        }
        node prev = head;
        // while(prev.next != tail){
        //     prev = prev.next;
        // }
        for (int i=0; i<size-2; i++){
            prev = prev.next;
        }
        System.out.println("LastNode deleted is " + tail.data);
        tail = prev;
        tail.next = null;
        size--;
    }
    public int search(int key){
        node temp = head;
        while(temp.data != key){
            temp = temp.next;
        }  
        if()
    }

    public void print(){
        node temp = head;
        if(head == null){
            System.out.println("LinkList is Empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String args[]){
        Linklist ll = new Linklist();

        ll.print();
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addLast(8);
        ll.addLast(10); 
        ll.addInMiddle(2,12);   
        ll.addInMiddle(3,3);
        ll.print();  
        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        System.out.println(ll.size);
        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
    }
}