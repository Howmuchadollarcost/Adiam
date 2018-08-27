class Person{
    private final String name;
    private final String age;

    Person(String name, String age){
        this.name = name;
        this.age = age;
    }

    public String hentNavn(){
        return name;
    }

    public String hentAlder(){
        return age;
    }

    @Override
    public String toString(){
        return "Navn: " + name + "\nAlder: " + age;
    }

}
