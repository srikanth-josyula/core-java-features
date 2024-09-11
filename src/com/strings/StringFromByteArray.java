package com.strings;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class StringFromByteArray {
    public static void main(String[] args) {
        
        // 1. String(byte[] bytes) - Using platform's default charset (e.g., UTF-8 on most systems)
        byte[] bytesDefault = {72, 101, 108, 108, 111}; // ASCII values for "Hello"
        String str1 = new String(bytesDefault);
        System.out.println("String from byte[] (default charset): " + str1);
        // Output: "Hello"
        
        // 2. String(byte[] bytes, Charset charset) - Using a specified charset (e.g., UTF-8)
        Charset charset = StandardCharsets.UTF_8;
        String str2 = new String(bytesDefault, charset);
        System.out.println("String from byte[] (UTF-8 charset): " + str2);
        // Output: "Hello"

        // 3. String(byte[] bytes, int offset, int length) - Subarray, default charset
        byte[] subBytes = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100}; // "Hello World"
        String str3 = new String(subBytes, 6, 5); // Extracts "World"
        System.out.println("String from byte[] (default charset, subarray): " + str3);
        // Output: "World"

        // 4. String(byte[] bytes, int offset, int length, Charset charset) - Subarray with charset
        String str4 = new String(subBytes, 0, 5, charset); // Extracts "Hello"
        System.out.println("String from byte[] (UTF-8 charset, subarray): " + str4);
        // Output: "Hello"

        // 5. String(byte[] bytes, String charsetName) - Using charset name (e.g., UTF-8)
        String charsetName = "UTF-8";
        String str5 = null;
		try {
			str5 = new String(bytesDefault, charsetName);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace(); //IF NOt given COMPILE Error
		}
        System.out.println("String from byte[] (specified charset name): " + str5);
        // Output: "Hello"

        // Additional Example - Handling Non-ASCII Bytes
        byte[] utf8Bytes = {(byte) 0xE2, (byte) 0x82, (byte) 0xAC}; // UTF-8 encoding for the Euro symbol '€'
        String str6 = new String(utf8Bytes, charset);
        System.out.println("String from byte[] (non-ASCII, UTF-8): " + str6);
        // Output: "€"
    }
}
