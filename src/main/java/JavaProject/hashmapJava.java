package JavaProject;

import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;

public class hashmapJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> m=new HashMap<>();
		
		m.put("India", 120);
		m.put("Uk", 50);
		m.put("China", 150);
		
		if(m.containsKey("China")) {
			System.out.println("Key is present");
		}else {
			System.out.println("Key is not present");
		}
		System.out.println(m.get("China"));
		System.out.println(m.get("USA"));
		
		for(Map.Entry<String,Integer> e:m.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	}

}
