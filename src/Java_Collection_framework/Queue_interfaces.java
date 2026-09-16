package Java_Collection_framework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_interfaces {
    public static void main(String[] args){
        //Array Deque...
        Deque<Integer> ad = new ArrayDeque<>();
        ad.offer(45);
        ad.offer(83);
        ad.offer(23);
        ad.offerLast(56);
        ad.offerFirst(37);

        System.out.println(ad);
        ad.pollLast();
        System.out.println(ad);
        ad.pollFirst();
        System.out.println(ad);
        System.out.println(ad.size());
        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());


        //LinkedList
        Queue<Integer> q = new LinkedList<>();
        q.offer(892);
        q.offer(35);
        q.offer(84);

        System.out.println(q);

        System.out.println("Removing : " + q.poll());

        System.out.println(q);

        System.out.println("Peeking : " + q.peek());
        System.out.println(q);
    }
}
