/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Melida160623.dao;
import Melida160623.model.Anggota;
import java.util.List;
/**
 *
 * @author Lenovo
 */
public interface AnggotaDao {
    void insert(Anggota Anggota);
    void update(int index, Anggota anggota);
    void delete(int index);
    Anggota getAnggota(int index);
    List<Anggota> getAll();
    
}
