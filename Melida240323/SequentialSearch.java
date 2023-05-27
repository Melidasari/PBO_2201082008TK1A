/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Melida240323;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class SequentialSearch {
     public static void main(String[]args) 
    {
        int[] data;
        int n,i,x;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Banyak data = ");
        n = in.nextInt();
        data = new int [n];
        //mengisi array
        for(i=0;i<n;i++)
        {
            data [i]= rand.nextInt(10);
        }
        System.out.print("Nilai yang dicari = ");
        x = in.nextInt();
        //menampilkan isi array
        System.out.println("\n===Data===");
        for(i=0;i<n;i++)
        {
            System.out.println((i+1)+"."+data[i]);
        }
        //sequental
        int banyak = 0;
        for(i=0;i<n;i++)
        {
            if(data[i]==x)
                System.out.println("Ada di data ke- "+ (i+1));
                //break
                banyak++;
        }
    
    if(banyak>0)
         System.out.println("Angka "+ x +"ada sebanyak "+ banyak +"buah");
    else //banyak=0
        System.out.println("Angka "+ x +"tidak ada dalam data");
   }
}
