package api;

import java.util.ArrayList;

public class Java_practise {
    public static void main(String[] args) {
        //ArrayList - Array storing in index ex: 0,1,2 - Manipulate
        ArrayList<Integer> list = new ArrayList(5);
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list.size());
        System.out.println(list.get(0));
        list.set(0,200);
        System.out.println(list.get(0));
        list.remove(0);
        System.out.println(list.size());
        for(int n:list){
            System.out.println(n);
        }

        //LinkedList
        //HashMap
        //HashSet
    }
}
