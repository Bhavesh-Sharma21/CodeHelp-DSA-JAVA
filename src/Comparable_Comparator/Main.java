package Comparable_Comparator;

import java.util.*;

public class Main {
    public static void main(String [] args){

        Integer [] arr = {5,1,7,2,8,4};
        Arrays.sort(arr);
//        Arrays.sort(arr, new ReverseCmp());// Reverse(Descending order)
        for(int a: arr){
            System.out.print(a + " ");
        }
//        List<Student> students = new ArrayList<>();
//        students.add(new Student(23,"Bhavesh Sharma",75));
//        students.add(new Student(20,"Rahul Singhaniya", 85));
//        students.add(new Student(20,"Ankit Bilotiya", 63));
//        students.add(new Student(9,"Vicky", 40));
//
//        System.out.println(students);
//        Collections.sort(students);
//        System.out.println(students);// Student.java file (comparabale interface)


        //Comparator interface...
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.weight - o2.weight; //sorting of basis of weight
//            }
//        });

        //Easy method of comparator..
//        Collections.sort(students,new Weight_comparator()); //form the Weight_comparator file
//        System.out.println(students);

        //Lambda Expression...
//        Collections.sort(students,( o1, o2) ->  o1.weight - o2.weight); //sorting of basis of weight
//        System.out.println(students);




    }
}
