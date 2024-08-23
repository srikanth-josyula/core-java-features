package com.objects.constructors;

public abstract class ConstructorIllegalModifers {

	// Illegal modifier for the constructor in type ConstructorNamings; only public,
	// protected & private are permitted
	abstract ConstructorNamings() {
	
		/**
		 * Constructors cannot be abstract because they are meant to initialize instances of a class. 
		 * An abstract constructor would imply that the class is abstract and its constructor should be implemented by a subclass, 
		 * but constructors are not intended to be inherited or implemented. 
		 * They must provide a concrete way to create and initialize an instance, which is incompatible with being abstract.
		 **/
	};

	static ConstructorNamings() {

		/**
		 * Constructors cannot be static. Static methods belong to the class itself
		 * rather than instances of the class. Constructors are meant to initialize new
		 * instances of the class, so they cannot be static. If you need static
		 * initialization, you should use a static block:
		 * 
		 **/

	}

	final ConstructorNamings() {
		/**
		 * Constructors cannot be final because the final modifier prevents methods from
		 * being overridden in subclasses, but constructors are not subject to method
		 * overriding. The purpose of a constructor is to set up a new instance, and
		 * making it final does not align with its intended use and concept.
		 * 
		 **/
	}

	synchronized ConstructorNamings() {

		/***
		 * Constructors cannot be synchronized because synchronization is used to
		 * control concurrent access to methods or blocks of code. Since constructors
		 * are used to create and initialize objects and are not designed to handle
		 * concurrency issues, synchronization does not apply to them. Synchronization
		 * is relevant for methods that operate on shared resources after the object is
		 * created.
		 * 
		 **/

	}
}
