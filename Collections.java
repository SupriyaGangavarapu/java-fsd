package project1;
import java.util.*;
public class Collections {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Lisa");
        list.add("Jessi");
        list.add("Rin");
        System.out.println("List: " + list);
        Set<Integer> set = new HashSet<>();
        set.add(7);
        set.add(2);
        System.out.println("Set: " + set);
        Map<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        System.out.println("Map: " + map);
    }
}
