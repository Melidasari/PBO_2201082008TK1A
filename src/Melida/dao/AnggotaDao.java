/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Melida.dao;

import Melida.model.Anggota;
import java.util.List;

/**
 *
 * @author LABMM07
 */
public interface AnggotaDao {

    void insert(Anggota anggota);

    void update(int index, Anggota anggota);

    void delete(int index);

    Anggota getAnggota(int index);

    List<Anggota> getAll();
}
