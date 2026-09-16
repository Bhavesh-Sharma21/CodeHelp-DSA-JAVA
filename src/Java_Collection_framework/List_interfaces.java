package Java_Collection_framework;
import java.util.*;

public class List_interfaces {
    public static void main(String[] args) {
        //Lists or Collections -> interface

        //Arraylist -> concrete class
        ArrayList<Integer> arrayList = new ArrayList<>();

        //add
        arrayList.add(23);
        arrayList.add(54);
        arrayList.add(9);
        arrayList.add(45);
        System.out.println(arrayList);
        arrayList.add(15);
        System.out.println(arrayList);

        //remove
        arrayList.remove(2);
        System.out.println(arrayList);

        //add All/removeAll
        List<Integer> list = new ArrayList<>();//only List
        list.add(405);
        list.add(45);
        arrayList.addAll(list);
        System.out.println(arrayList);
        arrayList.removeAll(list);
        System.out.println(arrayList);

        //size of
        System.out.println(list.size());
        System.out.println(arrayList.size());

        //clear
        System.out.println("ArrayList Printing: " + arrayList);
//        arrayList.clear();
//        System.out.println(arrayList);
        System.out.println("Now the size of arrayList is : " + arrayList.size());

        // I want to traverse list using iterator
        Iterator<Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()){
            System.out.println("Element : " + iterator.next());
        }
        //List interface

        List<Integer> list2 = new ArrayList<>();
        list2.add(82);
        list2.add(87);
        list2.add(900);
        //get
        System.out.println(list2.get(2));
        //set
        System.out.println("Before set: " + list2);
        list2.set(0,1000);
        System.out.println("After set: " + list2);

        //toArray
        Object [] arr = list2.toArray();
        for (Object obj : arr){
            System.out.println(obj);
        }
        //contains
        System.out.println(list2.contains(45));

        arrayList.add(71);
        arrayList.add(91);
        arrayList.add(789);
        System.out.println("Printing entire List: " + arrayList);

        //sort an ArrayList
        Collections.sort(arrayList);
        System.out.println("Print Sorting ArrayList: " + arrayList);

        //clone an Arraylist
//        System.out.println("Clone of Arraylist is: " + arrayList.clone());
        ArrayList<Integer> newList = (ArrayList<Integer>) arrayList.clone();
        System.out.println("Clone is newList: " + newList);

        //ensure capacity
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(50);
        //isEmpty
        System.out.println(marks.isEmpty());
        //index of
        System.out.println(newList.indexOf(91));

        //Linked List
        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(45);
        linkedlist.add(5);
        linkedlist.add(78);
        linkedlist.addFirst(65);//LinkedList as Queue & Deque
        linkedlist.add(90);
        linkedlist.addLast(97);//LinkedList as Queue & Deque
        linkedlist.add(33);
        linkedlist.add(5);
        System.out.println(linkedlist);
        System.out.println(linkedlist.contains(5));
        System.out.println(linkedlist.indexOf(33));
        System.out.println(linkedlist.lastIndexOf(5));
        //LinkedList as Queue & Deque
        System.out.println(linkedlist.getFirst());
        System.out.println(linkedlist.getLast());
        System.out.println(linkedlist.removeLast());
        System.out.println(linkedlist.removeFirst());
        System.out.println(linkedlist.peek());
        System.out.println(linkedlist.poll());
        System.out.println(linkedlist.offer(90));
        System.out.println(linkedlist);

        //Java Vector
        Vector<Integer> vector = new Vector<>();
        vector.add(89);
        vector.add(42);
        vector.add(21);
        vector.add(88);
        System.out.println(vector);
//        vector.toString();
//        System.out.println(vector);
//        remaing all function as same as like all lists

        //Java Stack
        Stack<Integer> stack = new Stack<>();
        stack.add(3);
        stack.push(455);
        stack.add(89);
        stack.add(156);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.search(89));
        System.out.println(stack.empty());
        System.out.println(stack);

    }
}
