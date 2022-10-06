package Assisted;

public class StringMethods {

	public static void main(String[] args) {
         System.out.println("Implementation of String methods");
		
		String sl=new String("Welcome Home");
		System.out.println("String length: "+sl.length());

		
		String sub=new String("Welcome");
		System.out.println("Substring: "+sub.substring(0,2));

		
		String s1="Hello";
		String s2="HELLO";
		System.out.println("Comparision: "+s1.compareTo(s2));

		
		String s4="";
		System.out.println("Check for empty: "+s4.isEmpty());

		
		String s5="PLEAsant";
		System.out.println("Convert to Lowercase: "+s1.toLowerCase());
		
		
		String s6="Hole";
		String replace=s2.replace('l', 'm');
		System.out.println("Replacing String: "+replace);

		
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		
		StringBuffer s=new StringBuffer("Welcome to Java!");
		System.out.println("Given String:"+s);
		s.append("Enjoy your learning");
		System.out.println("String after append: "+s);

		
	
		StringBuffer sb=new StringBuffer("Given");
		sb.replace(0, 1, "Ta");
		System.out.println("String After replacing: "+sb);

		sb.delete(0, 1);
		System.out.println("Strind After deleting: "+sb);
		
		//StringBuilder
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("Happy");
		sb1.append("Journey");
		System.out.println("String append: "+sb1);

		System.out.println("After deleting: "+sb1.delete(0, 1));

		System.out.println("After inserting: "+sb1.insert(1, "Welcome"));

		System.out.println("After reverse: "+sb1.reverse());
				
		//conversion	
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
		
		String str = "Hello"; 
        
        // conversion from String object to StringBuffer 
        StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("String to StringBuffer: "+sbr);
        
          
        // conversion from String object to StringBuilder 
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("Praba"); 
        System.out.println("String to StringBuilder: "+sbl);
                   		
	}


	}


