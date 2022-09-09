import java.util.Scanner;

public class SuperGreeter {
    public void start() {
        System.out.println("Det virker!");
    }

    public static void main (String[] args) {
        SuperGreeter sg = new SuperGreeter();
        SuperGreeter greet = new SuperGreeter();
        sg.start();

        // lade bruger indtaste navn
        System.out.println("Indtast dit navn: ");
        Scanner sc = new Scanner(System.in);
        String indtastnavn = sc.next();
        System.out.println("Hej!" + " " + indtastnavn);


    }
}
