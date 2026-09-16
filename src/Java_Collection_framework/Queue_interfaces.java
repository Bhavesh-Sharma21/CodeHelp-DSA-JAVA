package Java_Collection_framework;

import java.util.*;

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

        //Priority Queue
        // Integers -> Less value -> High Priority -> MinHeap -> Default behavior
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(82);
        pq.offer(81);
        pq.offer(69);
        pq.offer(36);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

        //MaxHeap -> Integers -> High Value -> High priority
        Queue<Integer> phq = new PriorityQueue<>((a,b)-> b-a );//lambda expression
        phq.offer(82);
        phq.offer(81);
        phq.offer(69);
        phq.offer(36);

        System.out.println(phq);
        System.out.println(phq.poll());
        System.out.println(phq);
        System.out.println(phq.poll());
        System.out.println(phq);
        System.out.println(phq.poll());
        System.out.println(phq);
    }
}
