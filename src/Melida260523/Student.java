/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Melida260523;

/**
 *
 * @author Lenovo
 */
public class Student extends Person{
    public Student(){
        super("Anna","Padang");
        System.out.println("Inside student:Constructor");
       //beberapa kode di sini
    } 
    
    @Override
    public String getName(){
        System.out.println("Student:getname");
        return name;
    }

    public static void main( String[] args ){
    Student anna = new Student();
    System.out.println("Nama "+anna.name);
    System.out.println("Alamat "+anna.address);
    } 
}
