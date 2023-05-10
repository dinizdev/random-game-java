import java.util.Scanner;

public class Random_Game {
    //define colors
    static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) {


        Scanner my_number = new Scanner(System.in);

        int r_number = 1 + (int)(100 * Math.random());
        int user, i;

        System.out.print(ANSI_PURPLE + " =========== Mini Game Numeros Aleatorios ========= \n\n");

            //logica
        for(i = 0 ; i >= 0 ; i++) {
            System.out.println(ANSI_YELLOW + "Digite um numero aleatorio: ");
            user = my_number.nextInt();

            //logica if
        if(user == r_number) {
            System.out.println(ANSI_GREEN + "Voce acertou!!! \n");
            System.out.println(ANSI_GREEN + "Numero sorteado:" + r_number);
            break;
            }else if (r_number >= user) {
            System.out.println(ANSI_RED + "\n Numero maior");
            }
            else {
                System.out.println(ANSI_RED + "\n Numero menor");
            }
        }
    }
}
