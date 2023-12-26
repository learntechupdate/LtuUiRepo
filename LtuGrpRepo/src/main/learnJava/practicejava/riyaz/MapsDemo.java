package practicejava.riyaz;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapsDemo {

	public static void main(String[] args) {
		
		//Map<String, String> map = new HashMap<>();
		
		Map<String, String> map = new Hashtable<>();
		map.put("actor", "Salman");
		map.put("myName", "Riyaz");
		map.put("ceo", "Touheed");
		map.put("actor", "John");
		
		System.out.println(map);
		
		Set<String> keys = map.keySet();
		
		for (String key : keys) {
			System.out.println("Key -> "+key +"   Values -> " +map.get(key));
		
			
		}
		
	}
}
