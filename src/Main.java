import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int PF;


        System.out.println("Kolik chces nacist filmu?");
        PF = sc.nextInt();
        Film[] film = new Film[PF];
        for (int i = 0; i < PF; i++) {
            System.out.println("Jaký je název filmu?");
            String filmName = sc.nextLine();
            System.out.println("Jaký je rok vydání filmu?");
            int filmYear = sc.nextInt();
            sc.nextLine();
            System.out.println("Jaké je hodnocení filmu?");
            int filmRating = sc.nextInt();
            sc.nextLine();
            System.out.println("Kolik herců hrálo v tomto filmu?");
            int PH = sc.nextInt();
            sc.nextLine();
            Herec[] herec = new Herec[PH];
            for (int j = 0; j < PH; j++) {
                System.out.println("Jaké je jméno herce?");
                String herecName = sc.nextLine();
                System.out.println("Jaký je rok narození herce?");
                int herecYear = sc.nextInt();
                sc.nextLine();
                herec[j] = new Herec(herecName, herecYear);
            }
            film[i] = new Film(filmName, filmYear, filmRating, herec);
        }
        System.out.println("Filmy s hodnocením nad 80 jsou: ");
        for (int i = 0; i < PF; i++) {
            if (film[i].getHodnoceni() > 80) {
                System.out.println(film[i].getNazev() + " (hodnocení je:" + film[i].getHodnoceni() + ")");
                for (int j = 0; j < film[i].getPolehercu().length; j++) {
                    System.out.println("Jména herců v tomto filmu jsou: ");
                    System.out.println((j + 1) + ". " + film[i].getPolehercu()[j].getJmeno());
                }
            }
        }
        Film nejlepsi = film[0];
        for (Film film1 : film) {
            if (film1.getHodnoceni() < nejlepsi.getHodnoceni()) {
                nejlepsi = film1;
            }
        }
        System.out.println("nejlepsi film je: " + nejlepsi.getNazev());
        for (int j = 0; j < nejlepsi.getPolehercu().length; j++) {
            System.out.println("Jména herců v tomto filmu jsou: ");
            System.out.println((j + 1) + ". " + nejlepsi.getPolehercu()[j].getJmeno());
        }
    }
}