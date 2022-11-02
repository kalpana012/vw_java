package collections;

import java.util.ArrayList;
import java.util.List;

public class StringList {
	    public static void main(String[] arg)
	     {
	        
	        List<String> stringlist = new ArrayList<String>();
	        
	        stringlist.add("Hello");
	        stringlist.add("World");
	        stringlist.add("!!");
	        System.out.println(stringlist);
	        System.out.println(stringlist.size());
	        
	        String a=stringlist.get(1);
	        System.out.println("Value at index position 0:"+a);
	        
	        stringlist.remove(1);
	        System.out.println(stringlist.size());
//	    
//	        lst.add(80);  // new Integer(80) -- autoboxing - box the primitve into object type
//	        lst.add(30);
//	        
//	    //    lst.add("java");
//	        lst.add(10);
//	        lst.add(1);
//	        
//	        
//	         System.out.println(lst);   //lst.toString();
//	        
//	         System.out.println(lst.size());
//	         
//	         int no = lst.get(0); //  new Integer(100).intvalue() -- auto-unboxing - unbox Integer object to its primitive value
//	         System.out.println("value at index position 0:"+no);
//	         
//	         System.out.println(lst); 
//	         System.out.println(lst.size());
//	         
//	          lst.remove(0);
//	          
//	          System.out.println(lst);   
//	          System.out.println(lst.size());
//	          
//	          lst.set(0,130);
//	          System.out.println(lst); 
//	          System.out.println(lst.size());
//	          
//	        
//	    
	        }
	}


