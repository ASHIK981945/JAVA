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

![Jvm](/Photos/Jvm.png)

## Procedure-Oriented Vs Object-Oriented Programming
![Procedure vs Object Oreiented Programmig](/Photos/ProcedureVsObject.PNG)

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


Feature |	Method Overloading |	Method Overriding
Definition| Defining multiple methods with the same name but different parameters in the same class. |	Redefining a method of the parent class in the child class with the same signature.
Purpose	 | Used to increase code readability and flexibility by allowing different ways to call a method.| Used to provide a specific implementation of a method already defined in the parent class.
Parameters | 	Methods must have different parameter lists (different number, type, or order of parameters).|	The method must have the same parameter list as the parent class method.
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