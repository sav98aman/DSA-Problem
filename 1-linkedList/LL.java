public  class LL{

    // creating Node
    public static Node head;
    private  static int size;

    LL(){
        this.size=0;
    }
    public static class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //add node from First 
    public static void addfirst(String data){
       

        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    // add int last
    public static void addlast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
       while(currNode.next!=null){
            currNode=currNode.next;
       }
       currNode.next=newNode;
    }

    // print list
    public static void printList(){
        if(head==null){
            System.out.println("list is Empty");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+ "->");
            currNode=currNode.next;
        }
        // System.out.print("NUll");
        System.out.println();
    }

    // delete first 
    public static void delfirst(){
        Node newNode=head;
        if(head==null){
           System.out.println("List Is Empty");
           return;
        }
        size--;
        head=newNode.next;
    }

    // del last
    public static void delLast(){
        if(head==null){
           System.out.println("List Is Empty");
           return;
        }

        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            secondLast=lastNode;
            lastNode=lastNode.next;
        }
        secondLast.next=null;
    }


    public static int  sizell(){
        return size;
    }

    public static void reverse(){
        if(head!=null ||head.next==null){
            return;
        }
        
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            // updating
           prevNode=currNode;
           currNode=nextNode;
            
        }
        head.next=null;
        head=prevNode;
    }
    public static void main(String[] args) {
        LL list=new LL();

        // list.addfirst("a");
        // list.addfirst("is");
        // list.printList();
        // list.addlast("aman");
        // list.printList();
        // list.addfirst("this");
        // list.printList();

        // int res=list.sizell();
        // System.err.println(res);

        // list.delfirst();
        // list.printList();
        // list.delLast();
        // list.printList();
        // res=list.sizell();
        // System.err.println(res);
        list.addlast("1");
        list.addlast("2");
        list.addlast("3");
        list.addlast("4");
        list.addlast("5");
        list.printList();
        list.reverse();
        list.printList();
    }
}
