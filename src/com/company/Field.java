package com.company;

public class Field {
    //INITIALIZING VARIABLES
    int adminRow;
    int adminCol;
    int userRow;
    int userCol;
    int ticketPrice = 10;
    int ticketNoPurchased = 0;
    double totalNoTicket;
    double percentagePurchasedTicket;
    int currentIncome = 0;
    int totalNoIncome;
    double percentage = 100;
    int count = 4;
    int menuSelect = 0;
    //MENU ARRAY
    String[] menu = {"Show the seats", "Buy a ticket", "Statistics", "Exit"};
    //DECLARING ARRAY FOR SEAT ARRANGEMENT
    String[][] arraySeat;
}
