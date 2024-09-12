package com.strings;

public class StringMethodsDemo {
    public static void main(String[] args) {
        // Initialize strings for demonstration
        String str1 = "Hello";
        String str2 = " World";
        String str3 = "Hello World";
        String str4 = "HELLO WORLD";
        String str5 = " Java ";
        String str6 = "Hello,World,Java";

        // charAt(int index)
        System.out.println("charAt(1): " + str1.charAt(1)); // e

        // length()
        System.out.println("length(): " + str1.length()); // 5

        // substring(int beginIndex)
        System.out.println("substring(6): " + str3.substring(6)); // World

        // substring(int beginIndex, int endIndex)
        System.out.println("substring(6, 11): " + str3.substring(6, 11)); // World

        // equals(String str)
        System.out.println("equals(str3): " + str1.equals(str3)); // false

        // equalsIgnoreCase(String anotherString)
        System.out.println("equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4)); // true

        // compareTo(String anotherString)
        System.out.println("compareTo(str3): " + str1.compareTo(str3)); // negative value

        // contains(CharSequence s)
        System.out.println("contains(\"World\"): " + str3.contains("World")); // true

        // startsWith(String prefix)
        System.out.println("startsWith(\"Hello\"): " + str3.startsWith("Hello")); // true

        // endsWith(String suffix)
        System.out.println("endsWith(\"World\"): " + str3.endsWith("World")); // true

        // split(String regex)
        String[] splitArray = str6.split(",");
        System.out.println("split(\",\"): ");
        for (String s : splitArray) {
            System.out.println(s); // Hello\nWorld\nJava
        }

        // join(CharSequence delimiter, CharSequence... elements)
        String joinedString = String.join(" ", "Hello", "Java");
        System.out.println("join(\" \", \"Hello\", \"Java\"): " + joinedString); // Hello Java

        // trim()
        System.out.println("trim(): " + str5.trim()); // Java

        // toLowerCase()
        System.out.println("toLowerCase(): " + str4.toLowerCase()); // hello world

        // toUpperCase()
        System.out.println("toUpperCase(): " + str1.toUpperCase()); // HELLO

        // replace(CharSequence target, CharSequence replacement)
        System.out.println("replace(\"World\", \"Java\"): " + str3.replace("World", "Java")); // Hello Java

        // concat(String str)
        System.out.println("concat(str2): " + str1.concat(str2)); // Hello World

        // format(String format, Object... args)
        String formattedString = String.format("Hello %s", "Java");
        System.out.println("format(\"Hello %s\", \"Java\"): " + formattedString); // Hello Java

        // valueOf(Object obj)
        System.out.println("valueOf(123): " + String.valueOf(123)); // 123

        // intern()
        String internedString = str1.intern();
        System.out.println("intern(): " + (internedString == str1)); // true

        // StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb.toString()); // Hello World

        // StringBuffer
        StringBuffer sbf = new StringBuffer();
        sbf.append("Hello");
        sbf.append(" World");
        System.out.println("StringBuffer: " + sbf.toString()); // Hello World
    }
}
