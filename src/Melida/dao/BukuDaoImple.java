/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Melida.dao;

import Melida.model.Buku;
import java.util.*;

/**
 *
 * @author HP
 */
public class BukuDaoImple implements BukuDao{
    private final List<Buku> data1 = new ArrayList<>();

    public BukuDaoImple() {
        data1.add(new Buku("B001", "Jarkom", "Imelda", "Imelda"));
        data1.add(new Buku("B002", "Algoritma", "Melida", "Sari"));
    }
    
    // coba tambahkan data secara manual
    @Override
    public void insert(Buku buku) {
        data1.add(buku);
    }

    @Override
    public void update(int index, Buku buku) {
        data1.set(index,buku);
    }

    @Override
    public void delete(int index) {
        data1.remove(index);
    }

    @Override
    public Buku getBuku(int index) {
        return data1.get(index);
    }

    @Override
    public List<Buku> getAll() {
        return data1;
    }
  
}
