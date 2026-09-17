package Comparable_Comparator;

import java.util.Comparator;

public class Weight_comparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
       // return o1.weight - o2.weight;
        return Integer.compare(o1.weight,o2.weight);
    }
}
