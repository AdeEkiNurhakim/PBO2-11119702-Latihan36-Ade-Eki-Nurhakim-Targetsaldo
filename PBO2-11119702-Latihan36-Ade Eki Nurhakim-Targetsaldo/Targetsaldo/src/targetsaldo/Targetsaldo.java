/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package targetsaldo;

/**
 *
 * @author Ekiw
 */
public class Targetsaldo {

    /**
     * @param args the command line arguments
     */
     public static void main (String [] args) {
     int a=1;
     int saldoawal = 2500000;
     double saldo, bunga, hasil;
     bunga = 0.15;
     while(saldoawal<=6000000){
     System.out.println(saldoawal);
     saldo = (bunga*saldoawal)+saldoawal;
    }
    }  
}