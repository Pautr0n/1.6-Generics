package levels1and2;


public class Main {

    public static void main(String[] args) {

        String arg1 = "argument 1", arg2 = "argument 2", arg3 = "argument 3";

        System.out.println("Exercise 1:");
        System.out.println("Checking it is possible to put arguments in any position inside the constructor:");
        NoGenericMethods ngm1 = new NoGenericMethods(arg1, arg2, arg3);
        System.out.println(ngm1);

        NoGenericMethods ngm2 = new NoGenericMethods(arg2, arg1, arg3);
        System.out.println(ngm2);

        NoGenericMethods ngm3 = new NoGenericMethods(arg3, arg1, arg2);
        System.out.println(ngm3);

        Person person = new Person("Carmen", "De Mairena", 85);
        int intArg = 10;
        System.out.println("Exercise 2: Executing levels1and2.GenericMethods printGenerics() with arguments in different position:");
        GenericMethods.printGenerics(person, arg1, intArg);
        GenericMethods.printGenerics(arg1, person, intArg);
        GenericMethods.printGenerics(intArg, arg1, person);

        System.out.println("Level 2. Exercise 1: Executing levels1and2.GenericMethods printGenerics() with a non generic argument:");
        GenericMethods.printGenerics(true, person, arg3);


        System.out.println("Level 2. Exercise 2: Executing levels1and2.GenericMethods printGenerics() with a generic variable argument list");
        GenericMethods.printGenerics(1, "Tron", true, 5.236, person);

    }

}
