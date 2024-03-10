package CRUD;

import java.util.Scanner;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<dvd_film> dvds = new ArrayList<>();
        Scanner sc =  new Scanner(System.in);
        int menu;
        
        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
    
        System.out.println("\033[0;96m╔══════════════════════════════════════╗");
        System.out.println("║           BlurayFlix Store           ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║ [1] Add DVD                          ║");
        System.out.println("║ [2] Display DVD                      ║");
        System.out.println("║ [3] Update DVD                       ║");
        System.out.println("║ [4] Delete DVD                       ║");
        System.out.println("║ [0] Exit                             ║");
        System.out.println("╚══════════════════════════════════════╝\n");
        System.out.print("\033[0;95mPlease enter your option: ");
        menu = sc.nextInt();
        sc.nextLine();

        switch (menu) {
            case 1:
                System.out.println("\n\033[0;93m╔══════════════════════════════════════╗");
                System.out.println("║              ADD DVD                 ║");
                System.out.println("╚══════════════════════════════════════╝");
                System.out.print("Enter DVD Name          : ");
                String dvdName = sc.nextLine();
                System.out.print("Enter Genre             : ");
                String genre = sc.nextLine();
                System.out.print( "Enter Release Year      : ");
                int releaseYear = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Director's Name   : ");
                String director = sc.nextLine();
                System.out.print("Enter Price             : ");
                int price = sc.nextInt();
                sc.nextLine();
                dvd_film newDVD = new dvd_film(dvdName, genre, releaseYear, director, price);
                dvds.add(newDVD);
                System.out.println("\n\033[0;92mDVD added Successfully!");
                    break;
            
            case 2:
                if(dvds.isEmpty()) {
                    System.out.println("\n\033[0;91mNo DVD available. Please add DVD!");
                }
                else{
                    System.out.println("\n\033[0;94m╔══════════════════════════════════════╗");
                    System.out.println("             \033[0;94mDVD Movie List");
                    System.out.println("========================================");
                for (int i = 0; i < dvds.size();i++){
                    dvd_film dvd = dvds.get(i);
                        System.out.println(+(i+1)+". DVD Name     : " + dvd.dvdName);
                        System.out.println("   Genre        : " + dvd.genre);
                        System.out.println("   Release Year : " + dvd.releaseYear);
                        System.out.println("   Director     : " + dvd.director);
                        System.out.println("   Price        : Rp. " + dvd.price);
                        System.out.println("========================================");
                        System.out.println("----------------------------------------");
                }
                System.out.println("╚══════════════════════════════════════╝");
            }
                break;
            
            case 3:
                if(dvds.isEmpty()) {
                    System.out.println("\n\033[0;91mNo DVD available. Please add DVD!");
                }
                else{
                    System.out.print("Enter DVD list number to update: ");
                    int number = sc.nextInt();
                    sc.nextLine();
                    if(number < 1 || number > dvds.size()){
                        System.out.println("\n\033[0;91mInvalid number, please try again!");
                    }
                    else{
                        int update = number - 1;
                        dvd_film dvd = dvds.get(update);
                        System.out.println("\n\033[0;96m╔══════════════════════════════════════╗");
                        System.out.println("║             UPDATE DVD               ║");
                        System.out.println("╚══════════════════════════════════════╝");
                        System.out.print("Enter DVD Name          : ");
                        String newdvdName = sc.nextLine();
                        System.out.print("Enter Genre             : ");
                        String newgenre = sc.nextLine();
                        System.out.print( "Enter Release Year      : ");
                        int newreleaseYear = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Director's Name   : ");
                        String newdirector = sc.nextLine();
                        System.out.print("Enter Price             : ");
                        int newprice = sc.nextInt();
                        sc.nextLine();
                        dvd.dvdName = newdvdName;
                        dvd.genre = newgenre;
                        dvd.releaseYear = newreleaseYear;
                        dvd.director = newdirector;
                        dvd.price = newprice;
                        System.out.println("\n\033[0;92mDVD updated Successfully!");
                    }
                }
                    break;
            
            case 4:
                if(dvds.isEmpty()) {
                    System.out.println("\n\033[0;91mNo DVD available. Please add DVD!");
                }
                else{
                    System.out.print("Enter DVD list number to delete: ");
                    int number = sc.nextInt();
                    sc.nextLine();
                    if(number < 1 || number > dvds.size()){
                        System.out.println("\n\033[0;91mInvalid number, please try again!");
                    }
                    else{
                        if(number < 1 || number > dvds.size()){
                            System.out.println("\n\033[0;91mInvalid number, please try again!");
                        }
                        else{
                            int delete = number - 1;
                            dvds.remove(delete);
                            System.out.println("\n\033[0;92mDVD deleted Successfully!");
                        }
                    }
                }
                    break;
            case 0:
                System.out.println("\n\033[0;97mExiting program...");
                System.exit(0);
                break;
            }
            System.out.println("\n\033[0;93mPress enter to return to the main menu...");
            sc.nextLine();

            
        }
}
}