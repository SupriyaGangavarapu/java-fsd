package project1;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> employee = new HashMap<>();
        // Add entries to the map
        employee.put("Rin", 90);
        employee.put("Alice", 85);
        employee.put("Bob", 95);
        Map<String,Integer> employees= new HashMap();
        employees.put("Naruto",94);
        employees.put("sasuke", 93);
        employee.putAll(employees);
        System.out.println(employee);
        int Rinsalary = employee.get("Rin");
        System.out.println("Rin's salary: " + Rinsalary);
        employee.remove("Alice");
        boolean hasObito = employee.containsKey("Obito");
        System.out.println("Does the map contain Obito? " + hasObito);
        int size = employee.size();
        System.out.println("Size of the map: " + size);
        System.out.println(employee.isEmpty());
    }
}
