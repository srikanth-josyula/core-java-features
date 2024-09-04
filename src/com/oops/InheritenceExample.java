package com.oops;

//Single Inheritance
class A {
 void displayA() {
     System.out.println("Class A method");
 }
}

//Class B inherits from Class A
class B extends A {  // Single Inheritance
 void displayB() {
     System.out.println("Class B method");
 }
}

//Multilevel Inheritance
//Class C inherits from Class B
class C extends B {  // Multilevel Inheritance
 void displayC() {
     System.out.println("Class C method");
 }
}

//Hierarchical Inheritance
//Class D and Class E both inherit from Class A
class D extends A {  // Hierarchical Inheritance
 void displayD() {
     System.out.println("Class D method");
 }
}

class E extends A {  // Hierarchical Inheritance
 void displayE() {
     System.out.println("Class E method");
 }
}

//Hybrid Inheritance
//Hybrid Inheritance involves combining multiple types of inheritance
class F extends C {  // Hybrid Inheritance (combination of Multilevel and Single Inheritance)
 void displayF() {
     System.out.println("Class F method");
 }
}

public class InheritenceExample {
 public static void main(String[] args) {
     // Demonstrating Single Inheritance
     B objB = new B();
     objB.displayA(); // Inherited from A
     objB.displayB(); // Defined in B

     // Demonstrating Multilevel Inheritance
     C objC = new C();
     objC.displayA(); // Inherited from A through B
     objC.displayB(); // Inherited from B
     objC.displayC(); // Defined in C

     // Demonstrating Hierarchical Inheritance
     D objD = new D();
     objD.displayA(); // Inherited from A
     objD.displayD(); // Defined in D

     E objE = new E();
     objE.displayA(); // Inherited from A
     objE.displayE(); // Defined in E

     // Demonstrating Hybrid Inheritance
     F objF = new F();
     objF.displayA(); // Inherited from A through B and C
     objF.displayB(); // Inherited from B through C
     objF.displayC(); // Inherited from C
     objF.displayF(); // Defined in F
 }
}

