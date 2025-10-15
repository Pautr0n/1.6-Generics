package levels1and2;


class GenericMethods {

    static <T,S,U> void printGenerics(T t, S s, U u){

        IO.println("Printing argument 1: " + t + "\n" +
                "Printing argument 2: " + s + "\n" +
                        "Printing argument 3: " + u + "\n");
    }

    static <T,S> void printGenerics(boolean bool, T t, S s){

        IO.println("Printing argument 1: " + t + "\n" +
                "Printing argument 2: " + s + "\n" +
                "Printing argument 3: " + bool + "\n");
    }
    @SafeVarargs
    static <T> void printGenerics(T...t){
        for(T l:t){
            IO.println(l);
        }

    }




}
