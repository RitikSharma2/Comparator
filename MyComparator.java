package firstPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l=new ArrayList<>();
		l.add(24);
		l.add(9);
		l.add(15);
		l.add(17);
		l.add(5);
		l.add(8);
		System.out.println(l);
		Comparator<Integer> c=(a,b)-> (a<b)?-1:(a>b)?1:0;
		Collections.sort(l,c);
		System.out.println(l);
		c=(a,b)-> -a.compareTo(b);
		Collections.sort(l,c);
		System.out.println(l);
		
		

	}

}
