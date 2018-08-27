class Person{
    private final String name;
    private final int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String hentNavn(){
        return name;
    }

    public int hentAlder(){
        return age;
    }


    public String toString(){
        return "Navn: " + name + "\nAlder: " + age;
    }

}
