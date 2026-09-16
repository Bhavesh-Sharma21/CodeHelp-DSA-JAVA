package Java_Collection_framework;

import java.util.Objects;

public class Student {
    public int roll_no;
    public String name;

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll_no == student.roll_no;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(roll_no);
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;

    }
}
