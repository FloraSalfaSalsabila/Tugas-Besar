/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diskrit2;

/**
 *
 * @author flora fauna
 */
import java.util.Scanner;
public class Testhitung {
    

	
 public static void main(String [] argh){
	 Scanner a =new Scanner(System.in);
	 Hitung mulai = new Hitung();
	 
	 System.out.print("mulai dr :");
	 long min = a.nextLong();
	 System.out.print("akhir  :");
	 long max = a.nextLong();
	 mulai.Menghitung(min, max);
	 
 }
}


