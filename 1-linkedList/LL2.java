import java.util.*;

public class LL2 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        
       list.addFirst("a");
       list.addFirst("is");
       list.addFirst("THis");
       list.addLast("list");

       System.out.println(list);
       
    //    int size=list.size();
    //    for(int i=0;i<size;i++){
    //     System.out.println(list.get(i));
    //    }

    //    list.removeFirst();
    //    System.out.println(list);
    //    list.removeLast();
    //    System.out.println(list);

        list.remove();//delfrom first
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

    }
}
