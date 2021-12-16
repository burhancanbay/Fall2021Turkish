package day41_errors_garbageCollector;

public class C01_Exceptions {

	public static void main(String[] args) {
		
		System.out.println(C02_Final.pi);
		C02_Final.pi=4.3;
		
		
	       System.out.println(exceptions());
	    }
	    @SuppressWarnings({ "null", "finally" })
		public static String exceptions() {
	        String result ="";
	        String v = null ;
	        
	        try {
	            try {
	            result = result + "a" ;
	            v.length() ;
	            result = result + "b";
	            
	            } catch (NullPointerException e) {
	                result = result + "c" ;
	                
	            }finally {
	                result = result + "d" ;
	                throw new Exception() ;
	            }
	        } catch (Exception e) {
	            result = result + "e" ;
	        }
	        
	    
	        return result;
	    }
	}


