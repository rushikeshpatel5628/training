package collection_demo;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Test_Tree_Map {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	
        TreeMap<Employee, String> etree = new TreeMap<Employee, String>();

        etree.put(new Employee(1, "AAA"), "Manager");
        etree.put(new Employee(2, "BBB"), "Team Leader");

        for (Employee employee : etree.keySet()) {
            System.out.println(employee + " - " + etree.get(employee));
        }
        
        
        
    }
}
