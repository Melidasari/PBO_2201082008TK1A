/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Melida.controller;
import Melida.model.*;
import Melida.dao.*;
import Melida.view.*;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class PeminjamanController {
    FormPeminjaman view;
    Peminjaman peminjaman;
    PeminjamanDao dao;
    AnggotaDao anggotaDao;
    BukuDao bukuDao;

    public PeminjamanController(FormPeminjaman view) {
        this.view = view;
        dao = new PeminjamanDaoImple();
        anggotaDao = new AnggotaDaoImpl();
        bukuDao = new BukuDaoImple();
    }
    
    //buat clearForm
    public void clearForm(){
        view.getTglPinjam().setText("");
        view.getTglKembali().setText("");
    }
    
    public void isiCombo(){
        view.getCboAnggota().removeAllItems();
        List<Anggota> listAnggota = anggotaDao.getAll();
        for (Anggota anggota : listAnggota) {
            view.getCboAnggota().addItem(anggota.getKodeAnggota()); 
        }
        
        view.getCboBuku().removeAllItems();
        List<Buku> listBuku = bukuDao.getAll();
        for (Buku buku : listBuku) {
            view.getCboBuku().addItem(buku.getKodeBuku()); 
        }
    }
    
    //buat tampilan
    public void tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel)view.getTabelPeminjaman().getModel();
        tabelModel.setRowCount(0);
        List<Peminjaman> list = dao.getAll();
        for(Peminjaman c : list){
            try {
                Object[] row = {
                    c.getKodeAnggota(),
                    c.getKodeBuku(),
                    c.getTglPinjam(),
                    c.getTglKembali(),
                    c.getSelisih()
                };
                tabelModel.addRow(row);
            } catch (ParseException ex) {
                Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //aktif buton insert
    public void insert(){
        peminjaman = new Peminjaman();
        peminjaman.setKodeAnggota(view.getCboAnggota().getSelectedItem().toString());
        peminjaman.setKodeBuku(view.getCboBuku().getSelectedItem().toString());
        peminjaman.setTglPinjam(view.getTglPinjam().getText());  // perlakuan ke tipe selain string beda
        peminjaman.setTglKembali(view.getTglKembali().getText());
        dao.insert(peminjaman);
        JOptionPane.showMessageDialog(view, "Data Insert OK!");
    }
    
    // aktif buton update
    public void update(){
        int index = view.getTabelPeminjaman().getSelectedRow();
        peminjaman.setKodeAnggota(view.getCboAnggota().getSelectedItem().toString());
        peminjaman.setKodeBuku(view.getCboBuku().getSelectedItem().toString());
        peminjaman.setTglPinjam(view.getTglPinjam().getText());
        peminjaman.setTglKembali(view.getTglKembali().getText());
        dao.update(index, peminjaman);
        JOptionPane.showMessageDialog(view, "Data Update OK!");
    }
    
    // buton delete
    public void delete(){
        int index = view.getTabelPeminjaman().getSelectedRow();
        dao.delete(index);
        JOptionPane.showMessageDialog(view, "Data Delete OK!");
    }
    
    // data gel All
    public void getPeminjaman(){
        int index = view.getTabelPeminjaman().getSelectedRow();
        peminjaman = dao.getPeminjaman(index);
        view.getCboAnggota().setSelectedItem(peminjaman.getKodeAnggota());
        view.getCboBuku().setSelectedItem(peminjaman.getKodeBuku());
        view.getTglPinjam().setText(peminjaman.getTglPinjam());
        view.getTglKembali().setText(peminjaman.getTglKembali());
        
    }
}
