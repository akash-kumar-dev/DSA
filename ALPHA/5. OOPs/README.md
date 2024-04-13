# Object Oriented Design (OOPs)

### Class & Objects
**Objects ->** entities in the real world

**Classes ->** group of these intities

***

### Access Modifier
1. Private
2. Default
3. Protected
4. Public

***

### concepts in OOPs
1. Encapsulation
2. Inheritance
3. Abstraction
4. polymorphism
***

## 1. Encapsulation
    Defined as the wrapping up of Data & methods under a single intity (Class). It also implements Data Hiding.

***
### Construcotrs

    Constructors is a special method which is invoked automatically at the time of object creation.
1. constructors have same name as class or structure.
2. Constructors don't have a return type. (NOT even Void).
3. Constructors are only called One, at Object creation.
4. Memory allocation happens when constructor is called.

**Types of Constructors:**
1. Non-Parameterized
2. Parameterized Constructor
3. Copy Constructor (Shallow and Deep Copy)

***

## 2. Inheritance
    Inheritance is when properties & Method of base class are passed on to a derived class.
**Types of Inheritance**
1. Single Level Inheritance
2. Multi Level Inheritance
3. Hierarchial Inheritance
4. Multiple Inheritance (_in JAVA this inheritance done by Interfacing_)

***

## 3. Polymorphism
    (Many Forms)
**1. Compile Time Polymorphism (Static)**
    Method Overloading

**2.Run Time Polymorphism(Dynamic)**
    Method Overriding

***

## 4. Abstraction
    Hiding all unnecessary details and showing only the important parts to the class.

1. Abstarction Classes (idea Not implementation)
2. Interfaces

**1. Abstarct Class**

    1. Cannot craete an instance of abstract class.
    2. can Have abstarction/ non-abstarct Methods(Function)
    3. can have constructors

**2. Interfaces** Interface is a bluePrint of a class

    1. All methods are Public, abstarct & without Implementation.
    2. Used to achieve total abstarction.
    3. variables in the interface are final, public & Static.

1. In Java for implementation of **Multiple Inheritance**.
2. Total Abstraction(100% Abstarction)

***
