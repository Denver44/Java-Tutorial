import java.util.*;

public class Main
{
    public static void main(String[] args){
    
        // HashSet<Integer> set=new HashSet<Integer>();

        // set.add(null);

        // set.add(10);

        // for(Integer s: set)
        //     System.out.println(s); 

        // PriorityQueue<Integer> queue
        //     = new PriorityQueue<>();
        // queue.add(11);
        // queue.add(10);
        // queue.add(22);
        // queue.add(5);
        // queue.add(12);
        // queue.add(2);
 
        // while (queue.isEmpty() == false)
        //     System.out.printf("%d ", queue.remove());
 
        // System.out.println("\n");

        // TreeSet<String> treeSet = new TreeSet<>();
 
        // treeSet.add("Scaler");
        // treeSet.add("InterviewBit");
        // treeSet.add("Coders");
        // treeSet.add("Coders");
 
        // for (String temp : treeSet)
        //     System.out.printf(temp + " ");
 
        // System.out.println("\n");

        // List<String> list1 = new LinkedList<>();
        // list1.add("Scaler");
        // list1.add("For");
        // list1.add("Coders");
        // list1.add("InterviewBit");
        // list1.add("Coders");
 
        // List<String> list2 = new LinkedList<>();
        // list2.add("Coders");
 
        // list1.removeAll(list2);
 
        // for (String temp : list1)
        //     System.out.printf(temp + " ");
 
        // System.out.println();

        List<String> list = new LinkedList<>();
        list.add("Scaler");
        list.add("For");
        list.add("Coders");
        list.add("InterviewBit");
        Iterator<String> iter = list.iterator();
 
        while (iter.hasNext())
            System.out.printf(iter.next() + " ");
 
        System.out.println();




    }
}
