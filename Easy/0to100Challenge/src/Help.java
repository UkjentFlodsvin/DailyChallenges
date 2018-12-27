/**
 * Created by marku on 31.08.2016.
 */
import java.util.Scanner;
public class Help {
    private final static int[] FINGER_VALUES = {10, 10, 10, 10, 50, 5, 1, 1, 1, 1};
    private final static String LEFT = "00001111";
    private final static String RIGHT = "11110000";

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine())
        {
            System.out.println(fingerCount(scanner.nextLine()));
        }
    }

    public static int fingerCount(String fingers)
    {
        int fingerValue = 0;
        if (!LEFT.contains(fingers.substring(0, 4)) || !RIGHT.contains(fingers.substring(6, 10)))
        {
            return -1;
        }
        for (int i = 0; i < fingers.length(); i++)
        {
            if (fingers.charAt(i) == '1')
            {
                fingerValue += FINGER_VALUES[i];
            }

        }
        return fingerValue;
    }
}
