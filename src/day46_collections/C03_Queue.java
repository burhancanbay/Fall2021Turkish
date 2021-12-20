package day46_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

	public static void main(String[] args) {
		// gelen sona yazilir ilk giden bastan gider
		
		Queue<String>kuyruk=new LinkedList<>();
		
		kuyruk.add("Lutfullah");
		kuyruk.add("Mustafa");
		kuyruk.add("Ridvan");
		
		System.out.println(kuyruk); // [Lutfullah, Mustafa, Ridvan]
		
		kuyruk.remove();
		System.out.println(kuyruk); // [Mustafa, Ridvan] bastan siler
		
		kuyruk.remove();
		System.out.println(kuyruk); // [Ridvan]
		
		kuyruk.add("Ridvan");
		System.out.println(kuyruk); // [Ridvan, Ridvan]
	}

}
