import java.util.Scanner;

public class SuperGreeter {
    Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("Det virker!");
        greet();
        askAboutAge();
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

    public static void main (String[] args) {
        SuperGreeter sg = new SuperGreeter();
        sg.start();

    }
}
