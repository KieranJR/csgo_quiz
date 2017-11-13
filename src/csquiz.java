import java.util.Scanner;
public class csquiz {
    public static void main(String[] args) {
        int c = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Svara a,b,c eller d.");
        System.out.println("Hur många skott har en Galil i ett magasin?");
        System.out.println("a) 25");
        System.out.println("b) 30");
        System.out.println("c) 35");
        System.out.println("d) 40");

        String in;
        in = scan.nextLine();

        if (in.equals("c")) {
            System.out.println("Rätt!\n");
            c++;
        } else if (in.equals("C")) {
            System.out.println("Rätt!\n");
            c++;
        } else {
            System.out.println("Fel!\n");
        }
        System.out.println("Svara a,b,c eller d.");
        System.out.println("När släpptes CS:GO?");
        System.out.println("a) 2011");
        System.out.println("b) 2012");
        System.out.println("c) 2013");
        System.out.println("d) 2010");

        in = scan.nextLine();

        if (in.equalsIgnoreCase("b")) {
            System.out.println("Rätt!\n");
            c++;
        } else {
            System.out.println("Fel! \n");
        }

        System.out.println("Svara a,b,c eller d.");
        System.out.println("Vilka vapen i spelet kan använda ljuddämpare?");
        System.out.println("a) Ak-47 och glock");
        System.out.println("b) M4A1-S och USP-S");
        System.out.println("c) M4A4 och P2000");
        System.out.println("d) Famas och Galil");

        in = scan.nextLine();

        if(in.equalsIgnoreCase("b")) {
            System.out.println("Rätt!\n");
            c++;
        }else {
            System.out.println("Fel!\n");
        }


        System.out.println("Svara a,b,c eller d.");
        System.out.println("Hur många skott har P2000 totalt?");
        System.out.println("a) 65");
        System.out.println("b) 53");
        System.out.println("c) 61");
        System.out.println("d) 74");
        in = scan.nextLine();

        if(in.equalsIgnoreCase("a")) {
            System.out.println("Rätt!\n");
            c++;
        }else {
            System.out.println("Fel!\n");
        }


        System.out.println("Svara a,b,c eller d.");
        System.out.println("Vilket år blev de_mirage tillagt");
        System.out.println("a) 2014");
        System.out.println("b) 2012");
        System.out.println("c) 2015");
        System.out.println("d) 2013");

        in = scan.nextLine();

        if(in.equalsIgnoreCase("d")) {
            System.out.println("Rätt!\n");
            c++;
        }else {
            System.out.println("Fel!\n");
        }


        System.out.println("Svara a,b,c eller d.");
        System.out.println("Vad heter den mest ikoniska mapen för cs:go?");
        System.out.println("a) de_mirage");
        System.out.println("b) de_inferno");
        System.out.println("c) de_dust2");
        System.out.println("d) de_cache");

        in = scan.nextLine();

        if(in.equalsIgnoreCase("c")) {
            System.out.println("Rätt!\n");
            c++;
        }else {
            System.out.println("Fel!\n");
        }

        System.out.println(c + " Rätt ut av 6!");

        System.out.println(100 * c/6 + "%");

    }
}
