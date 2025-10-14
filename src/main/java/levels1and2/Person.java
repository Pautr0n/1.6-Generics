package levels1and2;

class Person {

    private String givenName, familyName;
    private int age;

    public Person (String givenName, String familyName, int age){
        this.givenName=givenName;
        this.familyName=familyName;
        this.age=age;
    }

    @Override
    public String toString(){
        return givenName + " " + familyName + " is " + age + " years old.";
    }

}
