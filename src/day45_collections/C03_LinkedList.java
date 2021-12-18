package day45_collections;

import java.util.LinkedList;

public class C03_LinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer>ll=new LinkedList<>();
		System.out.println(ll); // []
		
		ll.add(5);
		ll.add(7);
		System.out.println(ll); // [5, 7]
		
				
		
		System.out.println(ll.peek()); // silmeden ilk elemani getirir
		System.out.println(ll.peekFirst()); // silmeden ilk elemani getirir
		
		LinkedList<Integer>ll2=new LinkedList<>();
		System.out.println(ll2.peekFirst()); // deque iki uclu oldugu icin first ve last ile hangi taraftan eleman getirecegini belirtiriz
		System.out.println(ll2.peek());      // Queue tek uclu sira oldugu icin direkt bastan getirir.
		
		System.out.println(ll.element()); // 5
		// System.out.println(ll2.element());// java.util.NoSuchElementException
		
		System.out.println(ll.poll()); // 5
		System.out.println(ll.poll()); // 7
		System.out.println(ll.poll()); // null
		
		System.out.println(ll.hashCode());  // 1 // javanin verdigi hash code'u doner
		System.out.println(ll2.hashCode()); // 1 // javanin verdigi hash code'u doner
		
		ll2.add(7);
		System.out.println(ll2.hashCode()); // 38
		
		System.out.println(ll2.offer(10)); // true
		System.out.println(ll2);           // [7, 10]
		
		ll2.push(2); // addFirst() ile ayni
		System.out.println(ll2); // [2, 7, 10]
		
		
	}

}
