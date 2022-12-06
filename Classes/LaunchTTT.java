package mrkool.Game1.Classes;
import java.util.Scanner;
public class LaunchTTT {
    public static void Launch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do You Want to Play Single Player or Dual Player ? ");
        System.out.println("Press 1 for Single Player / Press 2 for dual Player");
        int Mode = sc.nextInt();
        if(Mode==1){
            new KickStartTTT().SinglePlayer();
        }
        else if (Mode==2) {
            new KickStartTTT().DualPlayer();
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
