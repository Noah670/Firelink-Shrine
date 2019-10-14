import java.util.*;

import javax.swing.JOptionPane;

public class FireLink {
    public static void main(String[] args) {
        System.out.println("Bonefire Lit!");
        JOptionPane.showMessageDialog(null, "Welcome to the Firelink Shire ... Kindled one ...");
        JOptionPane.showMessageDialog(null,
                "Here you will find a blacksmith to repair your items and a friendly potion seller");
        System.out.println("Type 1 to walk towards the blacksmith");
        System.out.println("Type 2 to walk towards the potion seller");

        Scanner input = new Scanner(System.in);

        int playerChoice = input.nextInt();
        input.close();
        if (playerChoice == 1) {
            JOptionPane.showMessageDialog(null, "Walking towarads the blacksmith");
        } else if (playerChoice == 2) {

            JOptionPane.showMessageDialog(null, "Walking towards the potion shop");

        } else {
            JOptionPane.showMessageDialog(null, "You ran into a wall");

        }

        JOptionPane.showMessageDialog(null, "Game Over!");

    }

}