

# Introduction to Java[Unit-1]
Java is an object-oriented,cross platform,multi-purpose programming language produced by **Sun Microsystem**.It is a combination of features of C and C++ with some additional concepts.Most Java programs contains classes,which are used to define objects,and methods,which are assigened to individual classes.Java is also known for being stricter then C++,meaning variables and functions must be explicitly defined.This means Java source code may produce errors or "exceptions" more easily then any other language.
> [!important]
Oracle acquired Sun Microsystem in Jan 2010.Therefore,Java is maintained and distributed by Oracle.

## Features of Java
- Object-Oriented:
- Platform independent: Programs written in one operating system can be able to run in any Operating System
- Simple: Include's may features of C/C++,which make's it easy to understand.
- Secure: Java provides a wide range of protection from viruses and malicious programs.
- Portable: Running the same program with Java on different platforms is possible.
- Robust: During the devlopment of the program,it helps us to find possible mistake's as soon as possible.
- Multi-threaded:It allows to write a program that performs several different tasks simultaneously.
- Distributed: Java is designed for distributed internal enviroments as it manages the TCP/IP protocal.

## History of Java
- 1990 James Gosling(Devloper of Java).
- Platform independent language(OAK).
- 1995 consistency.
- Applets(it was used to create GUI applications,animation,play sounds).
- JavaFX and Swing (used to creating GUI applications).

## Java Virtual Machine(JVM)
- JVM as it's name suggest is "virtual" computer that resides in the "real" computer as a software process.
- JVM  give's java the flexibilty of platform indpendence.
- JVM reads "byte code",interpret it and execute the program.

![Jvm]

## Procedure-Oriented Vs Object-Oriented Programming
![Procedure vs Object Oreiented Programmig]

> Note:Java is a Statically-Typed-Language which means every variable must have specific data types before use.Jun data type
declare gara xam tei type ko data rakhnu parxa.
Java is case sensitive

- **Datatypes**:The type of data that a variable can  hold.
- **Variables**:are container where we can store values.


-**class**(blueprint of an object)
-**object**(instance of a class)
**oop**:(object  oriented programmming)
**features**:Abstraction ,polymorphim, inheritance,encapsulation, class and object ,modularity

syntax:
class classname{
    // data number
    //methods
}

-----------------------------------------------

student student = new student();
student.detail();
class student{
    string name;
    string address;
    
    void default()
    {
        system.out.println(name+address);
    }
}



**constructor**
A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes

```c
// Create a Main class
public class Main {
  int x;

  // Create a class constructor for the Main class
  public Main() {
    x = 5;
  }

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
```


**default constructor**
A constructor that has no parameters is known as default constructor. A default constructor is invisible. And if we write a constructor with no arguments, the compiler does not create a default constructor. It is taken out. It is being overloaded and called a parameterized constructor. The default constructor changed into the parameterized constructor. But Parameterized constructor can’t change the default constructor. The default constructor can be implicit or explicit.

**Implicit Default Constructor**: If no constructor is defined in a class, the Java compiler automatically provides a default constructor. This constructor doesn’t take any parameters and initializes the object with default values, such as 0 for numbers, null for objects.

**Explicit Default Constructor**: If we define a constructor that takes no parameters, it’s called an explicit default constructor. This constructor replaces the one the compiler would normally create automatically. Once you define any constructor (with or without parameters), the compiler no longer provides the default constructor for you.

```c
class GFG {

    // Default Constructor
    GFG() { System.out.println("Default constructor"); }

    // Driver function
    public static void main(String[] args)
    {
        GFG hello = new GFG();
    }
}
```

**parameter constructor**
Constructors can also take parameters, which is used to initialize attributes.
The following example adds an int y parameter to the constructor. Inside the constructor we set x to y (x=y). When we call the constructor, we pass a parameter to the constructor (5), which will set the value of x to 5:

```c
public class Main {
  int x;

  public Main(int y) {
    x = y;
  }

  public static void main(String[] args) {
    Main myObj = new Main(5);
    System.out.println(myObj.x);
  }
}

// Outputs 5
```
**copy contructor**


**ployymoxphism (having mutilp form)**

# method overloading 
```c
int add (int a  , int b);
int add (int a, int b , int c);
int add (double a, double b);
```

**recursion**


**nested class**
it is defined inside other class

**fuctions**
it promotes encopsulation
code rcadibility


**types**
static nested class
non-static nested class 

**pass by value**
-sends a copy of a value
-it works on datatypes such a int ,float,string

**pass by reference**
-sends the actual value
-it works on object


```c
int a=10;
int b;
b=a;
print (b);
// change b value b but not change a
b=20; 
```


**properties** ->
	The Properties class represents a persistent set of properties. The Properties can be saved to a stream or loaded from a stream. It belongs to java.util package. Properties define the following instance variable. This variable holds a default property list associated with a Properties object. 
	```c
	Properties p = new Properties();
	Properties p = new Properties(Properties propDefault);
	```

**methods/behaviours** ->
	Behavior for a class of objects is defined as a list of messages that an instance of that class can respond to.
	
	Java Methods are blocks of code that perform a specific task. A method allows us to reuse code, improving both efficiency and organization. All methods in Java must belong to a class. Methods are similar to functions and expose the behavior of objects

```c
// Creating a method
// that prints a message
public class Method {
  
    // Method to print message
    public void printMessage() {
        System.out.println("Hello, Geeks!");
    }

    public static void main(String[] args) {
      
        // Create an instance of the Method class
        Method m = new Method();
        m.printMessage();  // Calling the method
    }
}
```

**oop principal / four main features of object oriented programming**

**Inheritance** ->(overriding)
	
**superclass** (parent) - the class being inherited from 
**subclass** (child) - the class that inherits from another class

**Inheritance** is an important pillar of OOP (object oriented programming) it is 
	the mechanism in java by which one class is allow to inherite the features (fields and methods) of another calss .


``c
class parent {  
	// super class
	public void displayA() 
	{
		System.out.("AAAAAA)
	}
	public void displayB()
	{
		System.outprintln();
	}
}
	// sub class
public class child extends parent{
	@override (over write )
	public void displayA()
	{
		System.out.println("AAA")
	}
		public void display AB(){
		super.displayA()
		super.displayB()
		this.displayA()
	}
}

``

**Polymorphism**
	(over write Overwriting refers to the process of replacing existing data with new information)
	 
	(over loading ->With method overloading, multiple methods can have the same name with different parameters)
	  
	(name save but work different)(having mutiple form) --->

**polymorphism**is java is a concept by which we can peerform a single (int 2 or 3 double)action in
	different ways.polymorphism is derived from 2 greek words:paly and morphs.the word "poly" means many and "morphs" forms. so ploymorphism many forms 
	there are two tpyes of polymorphism in java :compile-time polymorphism and runtime polymorphism .we can perform polymorphism in java by method overloading {compile time} and method overloading {runtime}

```c
public class Polymorphism {

    // polymorphism : having multiple forms

    // method overloading
    // Example :
    // int add (int a , int b);
    // int add (int a, int b , int c);
    // int add (double a, double b);

    // program example

    int add(int a, int b) {
        return a + b;
    }

    // method overloded with 3 int parameters
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // methods overloading with 2 double types parameters
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        // use object

        Polymorphism object = new Polymorphism();
        int result = object.add(45, 31);
        System.out.println("addition of two number:" + result);
        System.out.println("...............................");

        // use static
        // int result = add(0, 0);
        // System.out.println("addition of two number" + result);

        // use static
        int value = Polymorphism.add(2, 3, 4);
        System.out.println("addition of three number :" + value);
        System.out.println("...............................");

        // use object
        Polymorphism object1 = new Polymorphism();
        int resultdouble = object1.add(12, 12);
        System.out.println("addition of two number of double " + resultdouble);

    }

}
```
**Abstraction** 

	Abstraction is a process of hiding the implementation details from the 
	user only the fuctionlity will be provided to the user.in other wors, the user will have the information on what the object does instead of how it does it. in java , abstraction is achieved using Abstract classes and interfaces 

```c
 public class Box{
	int l,b,h,vol;

	void getdata(){
		l = 10;
		b = 5;
		h = 2;
	}
	void calculate (){
		vol= l*b*h;
		System.out.println("volume of a box is :"+ vol);
	}
 }
	public static void main(String[] args){
		Box obj = new Box();
		obj.getdata();
		obj.calculate();

	}
```
    Encapsulaste (source ) -->

		Encapsulate in java is a mechanism of wrapping the  data (variables) and 
		code acting on the data (method) together as a single unit. in encapsulation, the variable of a class will be hidden from other class, add can be accessed only through the methods of thier current class .therefore,it is also known as data hiding
```c
Class Rectangle {


public int length; // all class variables 
public int breadth;

//Default constructor
public Rectangle ()
{
this.length = 0;
this.breath = 0;
}


//parameters constructor // this --> G variable 
public Rectangle (int length ,int breath){
this.lenght = length ;
this.breath = breath;
}


//method to calculate area

public void area()
{}

int result = length * breadth;
System.out.println(result);
}  
```


**take array size from user**
**//hit**
scanner scanner = new scanner(System.in)
SYstem.out.println();
int arrysize = scanner.nextInt();
take array data use;
display smallest number among them;


(this  /  super )
``c
class parent {
	public void displayA() 
	{
		System.out.("AAAAAA)
	}
	public void displayB()
	{
		System.outprintln();
	}
}
public class child extends parent{
	@override (over write )
	public void displayA()
	{
		System.out.println("AAA")
	}
		public void display AB(){
		super.displayA()
		super.displayB()
		this.displayA()
	}


}
```

```c
class parent {
	void add (int a , int b){
		system.out.println("addition result:" + (a+b))
	}
	void subtract(int a , int b){
		system.out.println("addition result:" + (a-b))
	}
}
 
pubic class child extends parent{
	void  add & subtract (int c ,int d){
		super.add(a,b); // no define
		super.add(c,d); // define
		super.subtract(c,d);
	}
	void divide (int c,int d){
		system.out.println("divided resulf:"+(c\d));
	}
	void AddSubtractDivide(int a ,int b){
		this.add&subtract(a,b);
		this.divide(a,b);
	}
}
```

main body ma

 child a = new child();
 int res = a.AddSubtractDivid();
 System.out.println(res);



**constructor**
A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes

```c
// Create a Main class
public class Main {
  int x;

  // Create a class constructor for the Main class
  public Main() {
    x = 5;
  }

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
```


**default constructor**
A constructor that has no parameters is known as default constructor. A default constructor is invisible. And if we write a constructor with no arguments, the compiler does not create a default constructor. It is taken out. It is being overloaded and called a parameterized constructor. The default constructor changed into the parameterized constructor. But Parameterized constructor can’t change the default constructor. The default constructor can be implicit or explicit.

**Implicit Default Constructor**: If no constructor is defined in a class, the Java compiler automatically provides a default constructor. This constructor doesn’t take any parameters and initializes the object with default values, such as 0 for numbers, null for objects.

**Explicit Default Constructor**: If we define a constructor that takes no parameters, it’s called an explicit default constructor. This constructor replaces the one the compiler would normally create automatically. Once you define any constructor (with or without parameters), the compiler no longer provides the default constructor for you.

```c
class GFG {

    // Default Constructor
    GFG() { System.out.println("Default constructor"); }

    // Driver function
    public static void main(String[] args)
    {
        GFG hello = new GFG();
    }
}
```

**parameter constructor**
Constructors can also take parameters, which is used to initialize attributes.
The following example adds an int y parameter to the constructor. Inside the constructor we set x to y (x=y). When we call the constructor, we pass a parameter to the constructor (5), which will set the value of x to 5:

```c
public class Main {
  int x;

  public Main(int y) {
    x = y;
  }

  public static void main(String[] args) {
    Main myObj = new Main(5);
    System.out.println(myObj.x);
  }
}

// Outputs 5
```
**copy contructor**
1) find the second largest element in the array
2) check if a array is sorted or not 
3) find missing number from array 
 <!-- eg 12456 -->


 **arraylist**
The ArrayList class is a resizable array, which can be found in the java.util package.
The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want.

 **switchcase**
Instead of writing many if..else statements, you can use the switch statement.
The switch statement selects one of many code blocks to be executed

```c
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}
```

```c
 add items -->which category -->food("","")
 view items -->all show
 delete items --> itemname
 ```


**inheritance**
extracting the poperty
from parent class (super) to child class (sub class)


**function**
-polymorphism
-code reusability
-method overriding

**types**
-single
-multiple
-multilevel
-hybrid

**command line argument**

```c
public class Commandline {
    public static void main(String[] args) {
        for (int i = 0; i <= args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
```

**super keyword**
The super keyword refers to superclass (parent) objects. It is used to call superclass methods, and to access the superclass constructor. 
it is used to access parent consructor



**different between method overloading and method overriding**


|Feature   |	Method Overloading                                                                       |   Method Overriding |
----------|------------------------------------------------------------------------------------------|-------------------------------------------------------|
|Definition| Defining multiple methods with the same name but different parameters in the same class. |	Redefining a method of the parent class in the child class with the same signature.|
| Purpose	 | Used to increase code readability and flexibility by allowing different ways to call a method.| Used to provide a specific implementation of a method already defined in the parent class.
|Parameters | 	Methods must have different parameter lists (different number, type, or order of parameters).|	The method must have the same parameter list as the parent class method.
Return Type |	Can have different return types. |	Must have the same return type (or a subclass, in case of covariant return types).
Scope |	Happens within the same class.|	Happens in different classes (parent and child).
Access Modifiers	| Can have any access modifier.	 | Cannot reduce the visibility of the overridden method (e.g., public in the parent must remain public in the child).
Static Methods |	Can be overloaded. |	Cannot be overridden; instead, they are hidden.
Performance |	Faster, as the method call is resolved at compile-time. |	Slower, as the method call is resolved at runtime using dynamic method dispatch.


**Example of Method Overloading**
```c
  class OverloadingExample {
    void show(int a) {
        System.out.println("Integer: " + a);
    }
    
    void show(double a) {
        System.out.println("Double: " + a);
    }
    
    void show(String a) {
        System.out.println("String: " + a);
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();
        obj.show(10);
        obj.show(10.5);
        obj.show("Hello");
    }
}

```

**Example of Method Overriding:**
```c
    class Parent {
        int add;
    void display() {
        System.out.println("This is the parent class");
    }
}

class Child extends Parent {
    void add() {
        System.out.println("This is the child class");
    }
    
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();  // Calls the overridden method in Child class
    }
}


```


**Dynamic method dispakh (overriding)**
 -> it is also know as runtime polymorphism


 **Advantages**
 -> losses couping can be actiered
      a -> b -> c
      a -> c

 **it can be achiered in**
 **abstract classes  (need out)**
         An abstract class can have both abstract (without body) and concrete methods.
```c
abstract class Animal {
  public abstract void animalSound();
  public void sleep() {
    System.out.println("Zzz");
  }
}
```

**interface**
 Another way to achieve abstraction in Java, is with interfaces.
An interface is a completely "abstract class" that is used to group related methods with empty bodies:

interface is a blueprint of class
it is consist of abstract methods and keywords such as public,static,final
interface is used to achieve ,mutiple, inheritance

```c
// interface
interface Parent {
    void makesound();
}

class Child implements Parent {
    public void makesound() {
        System.out.println("sound of child class");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.makesound();

    }
}
```

**need same varible then**
// click right
// source action



**final class**constant class whose data cannot be modified
class person ->attributs ->name(string),salary(double)->class child (child class)



```c
public class FindclassExample {
    public static void main(String[] args) {
        final String name = "charlie";
        // name = "alpha";
        System.out.println(name);
    }
}
```



```c

//final class ->useprivate class
class Person {
    String name = "Ashik";
    final Double salary = 10.00;

}

class Child extends Person {
    void dispaly() {
        System.out.println("name:---->" + name);
        System.out.println("price:---->" + salary);

    }

}

public class Classworkfc {
    public static void main(String[] args) {
        Child c = new Child();
        c.name = "person b";
        // c.salary = 200.00;
        c.dispaly();
    }
}

```

**final keyword**it is a constant keywork


**Access_control**