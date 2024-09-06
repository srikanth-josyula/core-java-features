package com.operations;

public class EqualityOperatorTest {
    public static void main(String[] args) {
        // Test 1: Primitive Type Equality (int)
        int num1 = 5;
        int num2 = 5;
        boolean primitiveEqual = (num1 == num2); // Expected: true
        System.out.println("Test 1 - Primitive int Equality: " + primitiveEqual);

        // Test 2: Primitive Type Equality (char)
        char char1 = 'a';
        char char2 = 'a';
        boolean charEqual = (char1 == char2); // Expected: true
        System.out.println("Test 2 - Primitive char Equality: " + charEqual);

        // Test 3: Primitive Type Equality (float and double)
        float float1 = 5.0f;
        float float2 = 5.0f;
        double double1 = 5.0;
        boolean floatEqual = (float1 == float2); // Expected: true
        boolean floatDoubleEqual = (float1 == double1); // Expected: true (float is promoted to double)
        System.out.println("Test 3 - Primitive float Equality: " + floatEqual);
        System.out.println("Test 3 - float == double Equality: " + floatDoubleEqual);

        // Test 4: Equality with Strings (String Pool)
        String str1 = "Hello";
        String str2 = "Hello"; // Points to the same object due to String Pooling
        boolean stringPoolEqual = (str1 == str2); // Expected: true
        System.out.println("Test 4 - String Equality (from String Pool): " + stringPoolEqual);

        // Test 5: Equality with new String() (Different Object References)
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        boolean stringNewEqual = (str3 == str4); // Expected: false (Different objects)
        System.out.println("Test 5 - String Equality (new String()): " + stringNewEqual);
        
        // Test 6: String Content Comparison using .equals()
        boolean stringContentEqual = str3.equals(str4); // Expected: true (compares content)
        System.out.println("Test 6 - String Content Equality (using .equals()): " + stringContentEqual);

        // Test 7: Equality with null references
        String str5 = null;
        String str6 = null;
        boolean nullEquality = (str5 == str6); // Expected: true (both are null)
        System.out.println("Test 7 - Null Equality: " + nullEquality);

        // Test 8: Comparing non-null with null
        boolean nonNullEquality = (str1 == str5); // Expected: false (str1 is not null, str5 is null)
        System.out.println("Test 8 - Non-null vs Null Equality: " + nonNullEquality);

        // Test 9: Object Reference Comparison
        MyClass obj1 = new MyClass(10);
        MyClass obj2 = new MyClass(10);
        boolean objectRefEqual = (obj1 == obj2); // Expected: false (Different objects, reference comparison)
        System.out.println("Test 9 - Object Reference Equality: " + objectRefEqual);

        // Test 10: Object Content Comparison using .equals() (Custom implementation)
        boolean objectContentEqual = obj1.equals(obj2); // Expected: true (compares content based on overridden equals)
        System.out.println("Test 10 - Object Content Equality (using .equals()): " + objectContentEqual);

        // Test 11: Array Equality (Reference Comparison)
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean arrayEqual = (array1 == array2); // Expected: false (Different objects in memory)
        System.out.println("Test 11 - Array Equality (Reference Comparison): " + arrayEqual);

        // Test 12: Array Content Comparison (Manual content comparison or Arrays.equals())
        boolean arrayContentEqual = java.util.Arrays.equals(array1, array2); // Expected: true (compares content)
        System.out.println("Test 12 - Array Content Equality (using Arrays.equals()): " + arrayContentEqual);

        // Do's and Don'ts
        // Do 1: Use == for Primitive Types
        int x = 100;
        int y = 100;
        boolean primitiveComparison = (x == y); // Expected: true
        System.out.println("Do 1 - Primitive Comparison: " + primitiveComparison);

        // Don't 1: Don't use == for Objects unless comparing references
        MyClass myClass1 = new MyClass(20);
        MyClass myClass2 = new MyClass(20);
        boolean objectRefCompare = (myClass1 == myClass2); // Expected: false (compares references, not content)
        System.out.println("Don't 1 - Object Reference Comparison: " + objectRefCompare);

        // Do 2: Use .equals() for Object Content Comparison
        boolean objectEqualsComparison = myClass1.equals(myClass2); // Expected: true (compares content)
        System.out.println("Do 2 - Object Content Comparison using .equals(): " + objectEqualsComparison);

        // Don't 2: Be cautious with String comparison using ==
        String s1 = "World";
        String s2 = new String("World");
        boolean stringLiteralEqual = (s1 == s2); // Expected: false (different references)
        System.out.println("Don't 2 - String Literal vs new String Comparison using ==: " + stringLiteralEqual);
    }
}

class MyClass {
    int value;

    MyClass(int value) {
        this.value = value;
    }

    // Override equals() method to compare object content
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MyClass myClass = (MyClass) obj;
        return value == myClass.value;
    }
}
