package com.strings;

public class StringPerformanceBasicComparision {

	public static void main(String[] args) {
        long startTime, endTime;
        String result;

        // String literals
        startTime = System.nanoTime();
        String s1 = "Hello";
        String s2 = "World";
        result = s1 + s2;
        endTime = System.nanoTime();
        System.out.println("String literals: " + (endTime - startTime) + " ns"); //24125 ns

        // new String()
        startTime = System.nanoTime();
        String s3 = new String("Hello");
        String s4 = new String("World");
        result = s3 + s4;
        endTime = System.nanoTime();
        System.out.println("new String(): " + (endTime - startTime) + " ns"); //5667 ns

        // StringBuilder
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append("World");
        result = sb.toString();
        endTime = System.nanoTime();
        System.out.println("StringBuilder: " + (endTime - startTime) + " ns"); //4000 ns

        // StringBuffer
        startTime = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        buffer.append("World");
        result = buffer.toString();
        endTime = System.nanoTime();
        System.out.println("StringBuffer: " + (endTime - startTime) + " ns"); //37292 ns
    }

}
