package levels1and2;

import java.util.ArrayList;

public class Main {

    public static void main (String[] args){

        String arg1 ="argument 1", arg2="argument 2", arg3="argument 3";

        IO.println("Exercise 1:");
        IO.println("Checking it is possible to put arguments in any position inside the constructor:");
        NoGenericMethods ngm1 = new NoGenericMethods(arg1,arg2,arg3);
        IO.println(ngm1);

        NoGenericMethods ngm2 = new NoGenericMethods(arg2, arg1,arg3);
        IO.println(ngm2);

        NoGenericMethods ngm3 = new NoGenericMethods(arg3,arg1,arg2);
        IO.println(ngm3);

        Person person = new Person("Carmen", "De Mairena", 85);
        int intArg = 10;
        IO.println("Exercise 2: Executing levels1and2.GenericMethods printGenerics() with arguments in different position:");
        GenericMethods.printGenerics(person,arg1,intArg);
        GenericMethods.printGenerics(arg1,person,intArg);
        GenericMethods.printGenerics(intArg,arg1,person);

        IO.println("Level 2. Exercise 1: Executing levels1and2.GenericMethods printGenerics() with a non generic argument:");
        GenericMethods.printGenerics(true,person,arg3);

        Person person2 = new Person("Cañita", "Brava", 79);
        Person person3 = new Person("Bernardo", "Cortés", 91);

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person2);
        personList.add(person3);

        IO.println("Level 2. Exercise 2: Executing levels1and2.GenericMethods printGenerics() with a generic List");
        GenericMethods.printGenerics(personList);

    }

}
