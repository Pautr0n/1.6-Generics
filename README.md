# **Sprint 1, Task 6 - Generics**

## Exercise Description:
- ***Level1:***
  - **Exercise 1:**
    - Create a class called NoGenericMethods that stores 3 arguments of the same type.
      - Implement the getters and setter and a constructor to initialize the arguments.
      - Check that the 3 arguments can be passed in any order to the constructor.
    - **Exercise 2:**
      - Create a class called Person with the attributes givenName, familyName and age.
      - Create a class called GenericMethods with a Generic method that accepts 3 generic arguments. This method has to display the 3 arguments received.
      - Call this Generic method from the main() passing 3 different Objects like: Person, String, int.
  - ***Level 2:***
    - **Exercise 1:**
      - Modify the previous exercise 2 from level 1. Change one of the generic arguments non-generic.
    - **Exercise 2:**
      - Modify the above exercise 1 level 2. Change the arguments of the method for a variable-length argument list.
  - ***Level 3:***
    - **Exercise 1:**
      - Create an Interface called Phone, and three classes; GenericClass, SmartPhone and Main.
      - Phone interface should have the method call();
      - Smartphone Implements Phone, and it has defined a method called takePicture().
      - The GenericClass should have two methods:
        - The first one receives an argument constrained by Phone interface.
        - The second one receives an argument constrained by SmartPhone.
      - From within these two methods call the methods of SmartPhone and Phone.
      - Inside the Main, pass an object of the Class SmartPhone to both GenericClass methods.
      - Can the method constrained by the Phone interface, in the Generica class, call the takePicture() method?

## **Technologies Used**
- JDK 21
- IntelliJ IDE
- Git & GitHub
- Maven

## **Requirements**
- JDK 21 or greater. (JRE 21 +)
- Maven dependencies:
  - 

## **Installation**
n/a

## **Execution**
- **Using an IDE (from source code without building the project):**
    - Download the repository.
    - Open the project with the IDE
    - Execute the main or the testing classes inside test/java directory.

## **Deployment**
n/a

## **Contributions**
This code has been written by a novice, I will really appreciate your contributions:
1. Fork the repository
2. Create a new branch
3. Commit your contributions
4. Upload them to your branch
5. Execute a pull request
