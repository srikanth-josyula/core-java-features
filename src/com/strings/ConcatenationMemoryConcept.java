package com.strings;

import java.util.StringJoiner;

public class ConcatenationMemoryConcept {

    public static void main(String[] args) {
        
        // Compile-time constants
        String s1 = "a"; // Stored in the SCP
        String s2 = " b";
    
        // Concatenate at compile-time
        String result1 = "a" + "b"; //stored in SCP
        
        // Concatenate at runtime
        String result2 = s1 + s2; //Stored at heap
        
        // Concatenate using .concat() method
        String result3 = s1.concat("b"); // Creates new string in the heap
        
        // Concatenate using String.format() method
        String result4 = String.format("%s%s", s1, "b"); // Creates new string in the heap
        String result5 = String.format("%s%s", "a", "b"); // Creates new string in the heap

        // Concatenate using String.join() method
        String result6 = String.join("", s1, s2); // Creates new string in the heap
        String result7 = String.join("", "a", "b"); // Creates new string in the heap
        
        // Using StringJoiner class
        StringJoiner result8 = new StringJoiner(", ");
        result8.add(s1);
        result8.add(s2);

        // Using new String() to create a new object
        String result9 = new String("ab"); // Always creates a new string in the heap

        // Using StringBuilder for concatenation
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        sb.append("b");
        String result10 = sb.toString(); // Creates a new string in the heap

        // Using StringBuffer for concatenation (thread-safe)
        StringBuffer sbf = new StringBuffer();
        sbf.append(s1);
        sbf.append("b");
        String result11 = sbf.toString(); // Creates a new string in the heap
        
        // Using String literal
        String result = "ab";

        // Hash codes for comparison
        System.out.println("HashCode of result (literal): " + System.identityHashCode(result)); // Stored in SCP (2060468723)
        
        // Check hash codes
        System.out.println("HashCode of result1 (compile-time concat using '+'): " + System.identityHashCode(result1)); // SCP (2060468723)
        System.out.println("HashCode of result2 (run-time concat using '+'): " + System.identityHashCode(result2)); // Heap (622488023)
        System.out.println("HashCode of result3 (run-time concat using .concat() method): " + System.identityHashCode(result3)); // Heap (1933863327)
        System.out.println("HashCode of result4 (using String.format()): " + System.identityHashCode(result4));  // Heap (112810359)
        System.out.println("HashCode of result5 (using String.format()): " + System.identityHashCode(result5));  // Heap (2124308362)
        
        System.out.println("HashCode of result6 (using String.join()): " + System.identityHashCode(result6));  // Heap (146589023)
        System.out.println("HashCode of result7 (using String.join()): " + System.identityHashCode(result7));  // Heap (1482968390)
        
        System.out.println("HashCode of result8 (using StringJoiner): " + System.identityHashCode(result8));  // Heap (349885916)
        
        System.out.println("HashCode of result9 (using new String()): " + System.identityHashCode(result9));  // Heap (414493378)
        
        System.out.println("HashCode of result10 (using StringBuilder): " + System.identityHashCode(result10));  // Heap (1984697014)
        System.out.println("HashCode of result11 (using StringBuffer): " + System.identityHashCode(result11));  // Heap (205029188)

        // Check if the results are the same
        System.out.println("Are result1 and result2 the same object? " + (result1 == result2)); // false
        System.out.println("Are result1 and result9 the same object? " + (result1 == result9)); // false
    }
}
