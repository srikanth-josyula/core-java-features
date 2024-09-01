package com.classes.concrete;

public class EnumExample {

	// Define an enum named Days default way
    /*public enum Days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }*/
    
    
	//We can add  methods to enumn	
	public enum Days {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

		// Method to determine if the day is a weekend
		public boolean isWeekend() {
			return this == SATURDAY || this == SUNDAY;
		}

		Days getType() {
			// TODO Auto-generated method stub
			return null;
		}
	}
	
	private final String type;

	// Private constructor for enum
	private EnumExample(String type) {
		this.type = type;
	}

	// Method to get the type of the day
	public String getType() {
		return type;
	}
    
    public static void main(String[] args) {
    	// Enum constants are accessible without an instance of Days
        System.out.println("Enum Constants:");
        for (Days day : Days.values()) {
        	System.out.println(day + " is a " + day.getType());
        }
        
        // Enum instances are implicitly created for each constant
        System.out.println("\nEnum Instances:");
        System.out.println("SUNDAY instance: " + Days.SUNDAY +" Hashcode: "+System.identityHashCode(Days.SUNDAY)); //SUNDAY Hashcode: 2060468723
        System.out.println("MONDAY instance: " + Days.MONDAY  +" Hashcode: "+System.identityHashCode(Days.MONDAY)); //MONDAY Hashcode: 622488023
        System.out.println("TUESDAY instance: " + Days.TUESDAY  +" Hashcode: "+System.identityHashCode(Days.TUESDAY)); //TUESDAY Hashcode: 1933863327
        System.out.println("WEDNESDAY instance: " + Days.WEDNESDAY  +" Hashcode: "+System.identityHashCode(Days.WEDNESDAY)); //WEDNESDAY Hashcode: 112810359
        System.out.println("THURSDAY instance: " + Days.THURSDAY  +" Hashcode: "+System.identityHashCode(Days.THURSDAY)); //THURSDAY Hashcode: 2124308362
        System.out.println("FRIDAY instance: " + Days.FRIDAY +" Hashcode: "+System.identityHashCode(Days.FRIDAY)); //FRIDAY Hashcode: 146589023
        System.out.println("SATURDAY instance: " + Days.SATURDAY +" Hashcode: "+System.identityHashCode(Days.SATURDAY) ); //SATURDAY Hashcode: 1482968390
  
        // Enum constants are implicitly public, static, and final
        // Access modifiers are not directly visible but can be inferred
        System.out.println("SUNDAY is public: " + isPublic(Days.SUNDAY));
        System.out.println("SUNDAY is static: " + isStatic(Days.SUNDAY));
        System.out.println("SUNDAY is final: " + isFinal(Days.SUNDAY));
        
        
		// Use switch statement with enums
        Days today = Days.WEDNESDAY;
		switch (today) {
		case MONDAY:
			System.out.println("Start of the work week.");
			break;
		case TUESDAY:
			System.out.println("Second day of the work week.");
			break;
		case WEDNESDAY:
			System.out.println("Middle of the work week.");
			break;
		case THURSDAY:
			System.out.println("Almost the end of the work week.");
			break;
		case FRIDAY:
			System.out.println("End of the work week.");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekend!");
			break;
		default:
			System.out.println("Invalid day.");
			break;
		}
    }

	// Method to check if the enum constant is public
	private static boolean isPublic(Enum<?> e) {
		return java.lang.reflect.Modifier.isPublic(e.getClass().getModifiers());
	}

	// Method to check if the enum constant is static
	private static boolean isStatic(Enum<?> e) {
		return java.lang.reflect.Modifier.isStatic(e.getClass().getModifiers());
	}

	// Method to check if the enum constant is final
	private static boolean isFinal(Enum<?> e) {
		return java.lang.reflect.Modifier.isFinal(e.getClass().getModifiers());
	}
}
