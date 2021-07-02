package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.math.RoundingMode;

public class Methods extends Field {
    //SCANNER FOR ALL INPUTS
    Scanner scanner = new Scanner(System.in);

    //METHOD TAKING IN ADMIN ROW AND COLUMN INPUTS
    public void adminRowCol (){
        System.out.print("Enter number of rows: ");
        adminRow = scanner.nextInt();
        System.out.print("Enter number of column: ");
        adminCol = scanner.nextInt();
        arraySeat = new String[adminRow][adminCol];

        for (int i = 0; i < adminRow; i++) {
            for (int j = 0; j < adminCol; j++) {
                arraySeat[i][j] = " A ";
            }
        }
        totalNoTicket = adminCol * adminRow;
    }

    //METHOD TAKING IN USER ROW AND COLUMN INPUTS
    public void userRowCol(){
        System.out.print("Enter a Row number: ");
        userRow = scanner.nextInt();
        System.out.print("Enter a Seat number: ");
        userCol = scanner.nextInt();
    }

    //METHOD DISPLAYING SEAT ARRANGEMENT
    public void displayArray (){
        for (int i = 0; i < adminRow; i++) {
            for (int j = 0; j < adminCol; j++) {
                System.out.print(arraySeat[i][j] + " ");
            }
            System.out.println();
        }
    }

    //METHOD DISPLAYING MENU LIST
    public void displayMenu (){
        for (int i = 1; i <= super.menu.length; i++) {
            System.out.print(i + ". ");
            for (int j = 0; j < super.menu.length ; j++) {
                if (i == j + 1) {
                    System.out.print(super.menu[j]);
                    System.out.println();
                }
            }
        }
    }

    //METHOD FOR SELECTING MENU
    public void menuSelector(){
        System.out.print("Select a Menu: ");
        super.menuSelect = scanner.nextInt();
    }

    //METHOD FOR DISPLAYING STATISTICS
    public void displayStatistics(){
        System.out.println("This is the number of purchased Ticket: " + ticketNoPurchased);
        System.out.println("The % of purchased Ticket: " + String.format("%.2f", percentagePurchasedTicket) + " %");
        System.out.println("This is the current income: $" + currentIncome);
        System.out.println("This is the Total income expected is $" + totalNoIncome);
    }

    //METHOD FOR BUYING TICKET
    public void buyATicket(){
        arraySeat[userRow - 1][userCol - 1] = " B ";
        currentIncome += ticketPrice;
        ticketNoPurchased++;
        totalNoIncome = (int) (totalNoTicket * ticketPrice);
        percentagePurchasedTicket = (ticketNoPurchased/ totalNoTicket) * percentage;
        System.out.println("You've just booked a Ticket of Seat no: " + userCol + " in Row: " + userRow);
    }


}
