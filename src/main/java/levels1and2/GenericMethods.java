package levels1and2;

import java.util.List;

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

    static <T> void printGenerics(List<T> list){
        if(list==null||list.isEmpty()){
            IO.println("List is null or empty.");
            return;
        }
        for(T l:list){
            IO.println(l);
        }

    }




}
