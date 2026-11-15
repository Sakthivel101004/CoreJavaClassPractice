--What is Inheritance?
	Inheritance is a mechanism in Java where one class acquires the properties and methods of another class.

There are two important terms:
	- Parent Class: The class whose properties and methods are inherited.
	- Child Class: The class that inherits the properties and methods from the parent class.
	Other names:
	- Parent class = Superclass
	- Child class = Subclass

--Syntax of Inheritance

	class Parent {
	    // Properties and methods
	}
	
	class Child extends Parent {
	    // Additional properties and methods
	}


"extends is the keyword used to achieve inheritance in Java."


--Types of Inheritance in Java
 	
 
Single Inheritance	  -- One parent and one child
Multilevel Inheritance 	--A class inherits from another child class
Hierarchical Inheritance	--Multiple child classes inherit from one parent
Multiple Inheritance	--One child inherits from multiple parents
Hybrid Inheritance	--Combination of inheritance types


Java supports single, multilevel and hierarchical inheritance through classes.

Java does not support multiple inheritance through classes to avoid ambiguity. However, it can be achieved using interfaces.



Advantages

Code Reusability: We can reuse existing code.
Reduces Code: We don't need to write the same code again.
Easy Maintenance: Code becomes easier to maintain.
Method Overriding: Child classes can provide their own implementation of parent methods.









