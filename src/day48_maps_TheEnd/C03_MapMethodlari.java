package day48_maps_TheEnd;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C03_MapMethodlari {

	public static void main(String[] args) {
		
		Map<Integer,String>ornek=MapOlustur.myMap();
		System.out.println(ornek);
		
		System.out.println(ornek.containsKey(110)); // false
		System.out.println(ornek.containsValue("java")); // false
		System.out.println(ornek.containsValue("Ali, Can, java")); // true
		
		Set<Entry<Integer, String>>entrySet=ornek.entrySet(); // herbir eleman entry 101=Ali, Can, java gibi...
		
		ornek.putIfAbsent(103,"Ali, Yan, C#"); // icerdigi icin eklemeyecek
		ornek.putIfAbsent(110,"Fikri, Yan, Qa"); // icermedigi icin eklemeyecek

		int sayac=1;
		
		for (Entry<Integer, String> each : entrySet) {
			System.out.println(sayac+".entry : "+each);
			sayac++;
		}
		
		System.out.println(ornek.getOrDefault(110,"girilen key map'te yok"));
		System.out.println(ornek.getOrDefault(103,"girilen key map'te yok"));
		
		String maptenString=ornek.toString();
		System.out.println(maptenString);
		
		
	}

}
