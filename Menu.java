import java.util.Scanner;
import java.util.ArrayList;
public class Menu{
    public static void main(String[] args) {
        HovedProgram h = new HovedProgram();
    }
}


class HovedProgram{
    Scanner sc = new Scanner(System.in);

    ArrayList<Person> personListe = new ArrayList<Person>();


    HovedProgram(){
        System.out.println("Hei, Dette Programmet Viser Deg Hva Som Skjer Denne Uka");
        System.out.println();
        System.out.println("[1] Skriv ut eksisterende person");
        System.out.println("[2] Legg inn ny person");
        System.out.println("[3] Søk etter person");
        System.out.println("[0] Avslutt");
        System.out.println("=============================================");

        boolean quit = false;
        int menuItem;

        do {
            System.out.print(">> ");
            menuItem = sc.nextInt();

            switch (menuItem) {
                case 1:
                    System.out.println("Skriv ut person");
                    System.out.println();
                    skrivPerson();
                    break;
                case 2:
                    System.out.println("Ny person");
                    System.out.println();
                    nyPerson();
                    break;

                case 3:
                    System.out.println("Søker person");
                    System.out.println();
                    sokPerson();
                    break;

                case 0:
                    System.out.println("Avslutt");
                    break;
                default:
                    System.out.println("Feil tastet.");
                    break;
            }
        } while (menuItem != 0);
    }

    public void skrivPerson(){
        System.out.println("\n Person:\n----------------------");
        for(Person p: personListe){
                System.out.println(p);
                System.out.println("*********************");
        }
    }

    public void nyPerson(){
        System.out.print("Skriv inn alder: ");
        String alder = sc.next();
        
        sc.nextLine();

        System.out.print("Skriv inn navn: ");
        String navn  = sc.nextLine();
       
        personListe.add(new Person(navn,alder));
    }

    public void sokPerson(){
        System.out.print("Person navn: ");
        String navn = sc.nextLine();

        sc.nextLine();
        
        navn = navn.replaceAll("\\s","");

        for(Person p: personListe){
            if(navn.equals(p.hentNavn())){
                System.out.println("Fant navnet" + navn);
            }else{
                System.out.println("finner ikke navn" + navn);
            }
        }

    }
}
