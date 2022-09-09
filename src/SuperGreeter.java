import java.util.Scanner;

public class SuperGreeter {
    Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("Det virker!");
        greet();
        askAboutAge();
        AJTracey();
    }

    public void greet() {
        System.out.println("Hej, hvad hedder du? ");
        String indtastnavn = sc.next();
        System.out.println("Hej!" + " " + indtastnavn);
    }

    public void askAboutAge() {
        System.out.println("Hvor gammel er du? ");
        int alder = sc.nextInt();
        System.out.println(alder);
    }

    public void AJTracey() {
        System.out.println("ASK ABOUT ME I DID IT" + " " + "LET MAN STAY ON MY SOFA I DID IT");
        String whoIsAjTracey = sc.next();
        System.out.println(whoIsAjTracey);
    }

    public static void main (String[] args) {
        SuperGreeter sg = new SuperGreeter();
        sg.start();

    }
}
