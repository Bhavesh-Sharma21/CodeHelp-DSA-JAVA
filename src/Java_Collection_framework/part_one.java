package Java_Collection_framework;
import java.util.*;

public class part_one {
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


    }
}
