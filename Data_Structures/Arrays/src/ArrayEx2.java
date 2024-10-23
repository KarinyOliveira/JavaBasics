public class ArrayEx2 {
    
    public static void main(String args[]) {
    	
        //String[] browsers = new String[3];
    	String[] browsers = new String[4];
        browsers[0] = "explorer";
        browsers[1] = "chrome";
        browsers[2] = "opera";
        browsers[3] = "firefox";
        System.out.println("Size of array: " + browsers.length);
        
        System.out.println("\n==== List of browsers ====");
        
        for (String name : browsers)
        	System.out.println(name);
        
    }
    
}
