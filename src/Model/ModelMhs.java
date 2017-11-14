/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Star Ramadhan
 */
class ModelMahasiswa {

    String nim, nama;

    public ModelMahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }
}

/**
 * @param args the command line arguments
 */
public class ModelMhs {

    public static void main(String[] args) {
        // TODO code application logic here
        new View.ViewMhs().setVisible(true);
    }

}
