/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1prakpbo;

/**
 *
 * @author Ardya
 */
public class Konversi {
    static double suhu;  //pendeklarasian
    private double hitr;
    private double hitf;
    private double hitk;
    
    Konversi (int suhu){
        this.suhu = suhu;
        this.hitr = this.hitungr();
        this.hitf = this.hitungf();
        this.hitk = this.hitungk();
    }
    
    public void updateKonversi(int suhu){
        this.suhu = suhu;
        this.hitr = this.hitungr();
        this.hitf = this.hitungf();
        this.hitk = this.hitungk();
    }
    
    public void showKonversi(){
        System.out.println("  ");
        System.out.println("Suhu Dalam Celsius : " + this.suhu + "°C"); 
        System.out.println("Dalam Fahrenheit   : " + this.hitf + "°F"); 
        System.out.println("Dalam Reamur       : " + this.hitr + "°R");    
        System.out.println("Dalam Kelvin       : " + this.hitk + "°K");
        
        //Titik Beku 0
        //Titik didih 100
        //Titik normal >1
        
        if (suhu<1){
            System.out.println("Kondisi Air Beku."); //perulangan untuk mendapatkan kondisi air (Beku)
        }
        else if (suhu>0 && suhu <100){
            System.out.println("Kondisi Air Normal."); // Kondisi air normal
        }       
        else if (suhu>=100){
            System.out.println("Kondisi Air Mendidih."); //Kondisi Air mendidih
        }
    
    }
    
public double hitungf(){
        return (double) ((suhu*9)/5+32); //rumus fahrenheit
    }
public double hitungr(){
        return (double) ((suhu*4)/5); //rumus reamur
    }
public double hitungk(){
        return (double) (suhu+273.15); //rumus kelvin
    }
}
