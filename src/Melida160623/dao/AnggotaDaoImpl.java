/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Melida160623.dao;
import java.util.List;
import java.util.ArrayList;
import Melida160623.model.Anggota;
/**
 *
 * @author Lenovo
 */
public class AnggotaDaoImpl implements AnggotaDao {
   private List<Anggota> data = new ArrayList<>();
    
   public AnggotaDaoImpl(){
       data.add(new Anggota ("A001","Melida Sari","Padang","P"));
       data.add(new Anggota ("A002","Arrasya","Padang","L"));
       data.add(new Anggota ("A003","Asrivo","Sijunjung","P"));
   }
   
    public void insert(Anggota anggota) {
        data.add(anggota);
    }
    public void update(int index, Anggota anggota){
        data.set(index, anggota);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Anggota getAnggota(int index){
        return data.get(index);
    }
    public List<Anggota> getAll(){
        return data;
    }
}
  
