package collections.list;

import java.util.List;

import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add("Sonu");
        list.add(55.45);
        list.add(true);

        System.out.println(list);
        System.out.println("-------------------------");

        List<Integer> l = new ArrayList<>();
        l.add(3);
        l.add(6);
        l.add(9);
        l.add(12);
        l.add(15);
        l.add(3);
        l.add(l.size()-1,18);
        System.out.println(l);

    }
}
