/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mhetodvoidmain;

/**
 *
 * @author MOKLET-1
 */
public class Methodvoidmain {

   
    String nama, makanan;
    //Agar method dapat berjalan, kita perlu mamanggilnya pada method main
    public static void main(String[] args){ 
   
        // Membuat Objek dari Class Methodvoidmain
        Methodvoidmain Hewan = new Methodvoidmain();
        System.out.println("====== KUCING =======");
        Hewan.Kucing();
        System.out.println("====== kelinci ======");
        Hewan.Hamster();
    }
    
    void Kucing(){
        nama = "abdel";
        makanan = "daging";
        System.out.println("Nama Kucing Saya Adalah: "+nama);
        System.out.println("Kucing Saya Suka Makan: "+makanan);
    }
    
    void Hamster(){
        nama = "temon";
        makanan = "sayur";
        System.out.println("Nama Hamster Saya Adalah: "+nama);
        System.out.println("Hamster Saya Suka Makan: "+makanan);
    }
}

    

