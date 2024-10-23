
public class StringOperations {
	
	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "Kariny";
		String str3 = "You are " + str2;
		
		System.out.println("Welcome: " + str3);
		System.out.println("Str1 Length: " + str1.length());
		System.out.println("Str3 substring: " + str3.substring(0,5));
		System.out.println("Str2 UpperCase: " + str2.toUpperCase());
		
		if (str1.compareTo(str2) < 0) 
			System.out.println("Str1 is lexicographally less than Str2 " + str1.compareTo(str2));			
		else if (str1.compareTo(str2) > 0) 
			System.out.println("Str1 is lexicographally greater than Str2 " + str1.compareTo(str2));
		else 
			System.out.println("Str1 is lexicographally equal to Str2 " + str1.compareTo(str2));		
		
		if (str1.equals(str2)) 
			System.out.println(str1.equals(str2) + " Equals");
		else 			
			System.out.println(str1.equals(str2) + " Not Equals");		
				
	}

}
