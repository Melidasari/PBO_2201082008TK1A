/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Melida160623.dao;
import java.util.List;
import Melida160623.model.Buku;
/**
 *
 * @author Lenovo
 */
public interface BukuInterface {
    public void insert(Buku buku) throws Exception;
    public void update(Buku buku) throws Exception;
    public void delete(Buku buku) throws Exception;
    public Buku getBuku(String kode) throws Exception;
    public List<Buku> getAll() throws Exception;
}
