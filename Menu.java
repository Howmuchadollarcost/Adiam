import java.util.Scanner;
import java.util.ArrayList;
public class Menu{
    public static void main(String[] args) {
        HovedProgram h = new HovedProgram();
        h.nyPerson();
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
        System.out.println("[0] Avslutt");
        System.out.println("=============================================");

        boolean quit = false;
        int menuItem;

        do {
            System.out.print("> ");
            menuItem = sc.nextInt();

            switch (menuItem) {
                case 1: System.out.println("Skriv ut person");
                    skrivPerson();
                    break;
                case 2: System.out.println("Ny person");
                    nyPerson();
                    break;
                case 0: quit = true;break;
                default:System.out.println("Feil tastet.");
            }
        } while (!quit);
        System.out.println("Avslutt");
    }

    public void skrivPerson(){
        System.out.println("\n Person:\n----------------------");
        for(Person p: personListe){
                System.out.println(p);
                System.out.println("*********************");
        }
    }

    public void nyPerson(){
        System.out.print("Skriv inn navn: ");
        String navn  = sc.next();

        System.out.print("Skriv inn alder: ");
        String alder = sc.next();

        personListe.add(new Person(navn,alder));
    }
}
