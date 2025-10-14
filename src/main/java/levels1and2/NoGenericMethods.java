package levels1and2;

class NoGenericMethods {

    private String argument1, argument2, argument3;

    public NoGenericMethods(String argument1, String argument2, String argument3){

        this.argument1=argument1;
        this.argument2=argument2;
        this.argument3=argument3;

    }

    public void setArgument1(String argument1) {
        this.argument1 = argument1;
    }

    public void setArgument2(String argument2) {
        this.argument2 = argument2;
    }

    public void setArgument3(String argument3) {
        this.argument3 = argument3;
    }

    public String getArgument1() {
        return argument1;
    }

    public String getArgument2() {
        return argument2;
    }

    public String getArgument3() {
        return argument3;
    }

    @Override
    public String toString(){
        return "Displaying levels1and2.NoGenericMethods value:\n" +
                "Argument 1 = " + argument1 + "\n"+
                "Argument 2 = " + argument2 + "\n"+
                "Argument 3 = " + argument3 +
                "\nEnd of levels1and2.NoGenericMethods value.\n";

    }
}
