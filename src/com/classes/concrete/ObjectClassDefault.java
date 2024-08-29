package com.classes.concrete;


public class ObjectClassDefault {
	
	public static void main(String[] args) {
		ObjectClassDefault obj = new ObjectClassDefault();
		
		System.out.println(obj.getClass()); //class com.classes.concrete.ObjectClassDefault
		System.out.println(obj.toString()); //com.classes.concrete.ObjectClassDefault@1dbd16a6
		System.out.println(obj.equals(obj)); //true
		System.out.println(obj.hashCode());  //498931366
		
	}
	
	
	/**
	 * Default implemtation 
	 * 
	 *  @IntrinsicCandidate
	 *  public native int hashCode();
	 * 
	 *  
	 *  public String toString() {
	 *   return getClass().getName() + "@" + Integer.toHexString(hashCode());
	 *  }
	 *  
	 *  public boolean equals(Object obj) {
	 *     return (this == obj);
	 *     }
	 **/

}
