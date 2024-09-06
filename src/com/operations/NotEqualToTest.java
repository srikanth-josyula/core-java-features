package com.operations;

public class NotEqualToTest {
    public static void main(String[] args) {
        // Test 1: Primitive Type Inequality (int)
        int num1 = 5;
        int num2 = 10;
        boolean primitiveNotEqual = (num1 != num2); // Expected: true
        System.out.println("Test 1 - Primitive int Inequality: " + primitiveNotEqual);

        // Test 2: Primitive Type Inequality (char)
        char char1 = 'a';
        char char2 = 'b';
        boolean charNotEqual = (char1 != char2); // Expected: true
        System.out.println("Test 2 - Primitive char Inequality: " + charNotEqual);

        // Test 3: Inequality with float and double
        float float1 = 5.0f;
        float float2 = 5.5f;
        double double1 = 5.0;
        boolean floatNotEqual = (float1 != float2); // Expected: true
        boolean floatDoubleNotEqual = (float1 != double1); // Expected: false (same value, different types)
        System.out.println("Test 3 - Primitive float Inequality: " + floatNotEqual);
        System.out.println("Test 3 - float != double Inequality: " + floatDoubleNotEqual);

        // Test 4: Inequality with Strings (String Pool)
        String str1 = "Hello";
        String str2 = "World"; // Different string literal
        boolean stringNotEqual = (str1 != str2); // Expected: true
        System.out.println("Test 4 - String Literal Inequality: " + stringNotEqual);

        // Test 5: Inequality with new String() (Different Object References)
        String str3 = new String("Hello");
        String str4 = new String("World");
        boolean stringNewNotEqual = (str3 != str4); // Expected: true
        System.out.println("Test 5 - String (new String()) Inequality: " + stringNewNotEqual);

        // Test 6: String Content Comparison using .equals() for inequality
        boolean stringContentNotEqual = !str3.equals(str4); // Expected: true (compares content)
        System.out.println("Test 6 - String Content Inequality (using .equals()): " + stringContentNotEqual);

        // Test 7: Inequality with null references
        String str5 = null;
        String str6 = "Hello";
        boolean nullNotEqual = (str5 != str6); // Expected: true
        System.out.println("Test 7 - Null vs Non-null Inequality: " + nullNotEqual);

        // Test 8: Object Reference Inequality
        MyClass obj1 = new MyClass(10);
        MyClass obj2 = new MyClass(20);
        boolean objectRefNotEqual = (obj1 != obj2); // Expected: true (Different objects)
        System.out.println("Test 8 - Object Reference Inequality: " + objectRefNotEqual);

        // Test 9: Object Content Inequality using .equals()
        boolean objectContentNotEqual = !obj1.equals(obj2); // Expected: true (content is different)
        System.out.println("Test 9 - Object Content Inequality (using .equals()): " + objectContentNotEqual);

        // Test 10: Array Reference Inequality
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean arrayNotEqual = (array1 != array2); // Expected: true (Different objects in memory)
        System.out.println("Test 10 - Array Reference Inequality: " + arrayNotEqual);

        // Test 11: Array Content Inequality (using Arrays.equals())
        boolean arrayContentNotEqual = !java.util.Arrays.equals(array1, array2); // Expected: false (content is same)
        System.out.println("Test 11 - Array Content Inequality (using Arrays.equals()): " + arrayContentNotEqual);
    }
}
