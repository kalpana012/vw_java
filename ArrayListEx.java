package collections;

import java.util.*;

public class ArrayListEx {
 public static void main(String[] arg) {
	 List lst=new ArrayList();
	 
	 lst.add(100); // autoboxing - box the primitive into object type
	 lst.add(70);
	 lst.add(11);
	 System.out.println(lst);
	 int num=(int)lst.get(0); //new Integer(100).intvalue() -- auto-unboxing
	 System.out.println("1st Element is: "+num);
 }
}
