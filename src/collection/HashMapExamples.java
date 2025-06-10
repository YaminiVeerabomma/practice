package collection;
import java.util.*;

public class HashMapExamples {
	public static void main(String[] args) 
	{
	HashMap<String, String> hm = new HashMap<>();
	hm.put("name", "one");
    hm.put("address", "two");
    hm.put("city", "three");
    hm.put("pincode", "four");
    System.out.println(hm);
    String value=hm.get("name");
    System.out.println(value);
    
	/*
	 * HashMap<String, String> hm1 = new HashMap<>(); hm1.put("contact", "none");
	 * hm1.put("pan", "five"); hm1.put("aadhar", "six"); hm1.put("colny", "seven");
	 * System.out.println(hm1); hm.putAll(hm1); System.out.println(hm);
	 * HashMap<String, String> hm2 = new HashMap<>(); hm2.put("1", "none");
	 * hm2.put("2", "five"); hm2.put("3", "six"); hm2.put("4", "seven");
	 * System.out.println(hm2); hm.putAll(hm2); System.out.println(hm);
	 */
    
	/*
	 * String targate="city"; //String key;
	 * 
	 * boolean flag=false; for(Map.Entry<String, String> entry: hm.entrySet()) {
	 * if(entry.getKey().equals(targate)) { flag=true;
	 * 
	 * // hm.remove(key); //hm.put("contact", "five");
	 * 
	 * 
	 * 
	 * 
	 * 
	 * //System.out.print(flag);
	 * 
	 * // hm.remove(targate); //System.out.println(hm); }
	 * //System.out.print(entry.getKey()+ " "); //System.out.print(" ");
	 * //System.out.println(entry.getValue()); //System.out.print(" "); }
	 * 
	 * //System.out.print(flag); if(flag==true) { String n= hm.remove(targate);
	 * hm.put("contact", "five");
	 * 
	 * System.out.println(hm); }
	 */
}
}