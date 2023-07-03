/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Melida160623.dao;
import java.util.List;
import java.util.ArrayList;
import Melida160623.model.Peminjaman;
/**
 *
 * @author Melida Sari
 */
public abstract class PeminjamanDaoImpl implements PeminjamanDao{
    private List<Peminjaman> data = new ArrayList<>();
    
    public PeminjamanDaoImpl() {
        data.add(new Peminjaman("A001","Jarkom","10 Juli 2023","12 Juli 2023 "));
        data.add(new Peminjaman("A002","PBO","17 Agustus 2022","19 Agustus 2022"));
    }
    
    public void insert(Peminjaman peminjaman){
        data.add(peminjaman);
    }
    
    public void update(int index, Peminjaman peminjaman){
        data.set(index, peminjaman);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Peminjaman getPeminjaman(int index){
        return data.get(index);
    }
    
    public List<Peminjaman> getAll(){
        return data;
    }
}
