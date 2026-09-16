package Java_Collection_framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_interfaces {
    public static void main(String[] args){

        HashSet<Student> set = new HashSet<>();
        Student s1 = new Student(1,"Bhavesh sharma");
        Student s2 = new Student(2,"Rahul Sinha");
        Student s3 = new Student(3,"Bhavesh sharma");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);


        Set<Integer> set1  = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        System.out.println(set1);
        set1.retainAll(set2);
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set1.containsAll(set2));
        System.out.println(set2.containsAll(set1));

//        Set<Integer> st = new HashSet<>();
//        st.add(10);
//        st.add(10);
//        st.add(10);
//        st.add(20);
//        st.add(30);
//        st.add(40);
//        st.add(40);
//
//        System.out.println(st);

        //Linked Hashset (It maintains insertion order )
        Set<String> fruits = new LinkedHashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("orange");
        fruits.add("Apple");

        System.out.println("LinkedHashSet (Maintains Insertion Order): " + fruits);

        //Tree Set ( Automatically Sorted Natural order )

        Set<String> car = new TreeSet<>();
        car.add("Fortuner");
        car.add("Alto");
        car.add("Gwagon");
        car.add("Chevrolet");

        System.out.println("TreeSet(Automatically sorted Alphabetically): " + car);


    }
}
