/**
 * Created by marku on 31.08.2016.
 */
import java.util.Scanner;

public class Challenge {
    public static final int [] FINAL_VALUE = {10,10,10,10,50,5,1,1,1,1};
    public static final String RIGHT = "11110000";
    public static final String LEFT  = "00001111";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Velkommen til 0 til 100 på hånd kalkulatoren!");
        System.out.println("Venligst tast inn ditt 10 sifrede tall:");

        while (scan.hasNextLine()) {
            System.out.println(calculate(scan.nextLine()));
        }
    }

    public static String calculate(String fingers){
        int value = 0;
        if (!LEFT.contains(fingers.substring(0,4)) || !RIGHT.contains(fingers.substring(6,10))){
            return ("Invalid format!");
        }
        for (int i = 0; i < 10; i++){
            if ((fingers.charAt(i)=='1')){
                value += FINAL_VALUE[i];
            }
        }
        return ("Din verdi er: " + value);
        }

}
