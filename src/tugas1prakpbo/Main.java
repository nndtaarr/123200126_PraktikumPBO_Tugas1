/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 */
package tugas1prakpbo;
import java.util.Scanner;
/**
 *
 * @author Ardya
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suhu;
        int menu;
        boolean selesai = false;
        
        Scanner Input = new Scanner(System.in);
        Scanner Menu = new Scanner(System.in);
        
        System.out.println("+---------------------------+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+---------------------------+");
        System.out.println("Input Data");
        System.out.println("-----------");
        System.out.print("Suhu Dalam Celcius : ");
        suhu = Input.nextInt(); //input suhu Celcius
       
        Konversi konversi = new Konversi (suhu);
        do{
            System.out.println("  ");
            System.out.println("Opsi");
            System.out.println("-----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilihan : ");
            menu = Menu.nextInt();
            
            switch(menu){
               case 1:
                   konversi.showKonversi();
                   break;
               case 2:
                   System.out.println("  ");
                   System.out.println("Input Data");
                   System.out.println("-----------");
                   Input = new Scanner(System.in);
                   System.out.print("Suhu Dalam Celcius : ");
                   suhu = Input.nextInt();
                   konversi.updateKonversi(suhu);
                   break;
               case 3:
                    selesai = true;
               break;
               default:
                    System.out.println("Upss !! Opsi tidak ada. Mohon masukkan opsi dengan benar !! ");
                break;
           }
        } while(!selesai);
    }
}
