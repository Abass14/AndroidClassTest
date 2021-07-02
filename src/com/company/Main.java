package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
        //GETTING THE OBJECT INSTANCE OF FIELD CLASS
        Field theFields = new Field();
        //GETTING THE OBJECT INSTANCE OF METHOD CLASS
        Methods theMethods = new Methods();
        //CALLING THE ADMINROWCOL METHOD FROM METHOD CLASS
        theMethods.adminRowCol();

        //DO WHILE LOOP FOR CONTROLLING THE BEHAVIOR OF THE BOT
        do {
            //DISPLAYING MENU AND SELECTING MENU
            theMethods.displayMenu();
            theMethods.menuSelector();
            if (theMethods.menuSelect == 1) {
                //DISPLAYING SEATS
                theMethods.displayArray();
            }else if (theMethods.menuSelect == 2) {
                //INPUTTING ROW AND SEAT
                theMethods.userRowCol();
                //CONDITIONS FOR SELECTING AND PURCHASING A TICKET
                if (theMethods.userRow > theMethods.adminRow || theMethods.userCol > theMethods.adminCol || theMethods.userRow < 0 || theMethods.userCol < 0) {
                    System.out.println("Row and Seat number invalid");
                }else {
                    if (theMethods.arraySeat[theMethods.userRow - 1][theMethods.userCol - 1] != " B ") {
                        theMethods.buyATicket();
                    }else {
                        System.out.println("Seat has been taken");
                    }
                }
            }else if (theMethods.menuSelect == 3) {
                //DISPLAYING STATS
                theMethods.displayStatistics();
            }else if (theMethods.menuSelect == 4) {
                //BOT TERMINATING MESSAGE
                System.out.println("Bye!");
            }else if (theMethods.menuSelect > 3 || theMethods.menuSelect < 0) {
                System.out.println("Invalid menu selection. Please try again with the accepted selections.");
            }
        }while (theFields.count != theMethods.menuSelect);

    }
}
