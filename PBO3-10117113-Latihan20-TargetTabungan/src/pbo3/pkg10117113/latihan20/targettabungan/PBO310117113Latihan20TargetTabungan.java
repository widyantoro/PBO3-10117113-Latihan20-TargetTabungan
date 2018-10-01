/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan20.targettabungan;
import java.text.DecimalFormat;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program untuk menargetkan jumlah tabungan pada bulan yang 
 *            diinginkan
 */
public class PBO310117113Latihan20TargetTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,saldo,saldoTarget,saldoSatu,saldoDua;
        double bunga;
       
        saldo = 3500000;
        saldoTarget = 6000000;
       
        
        i = 0;
        while(saldo <= saldoTarget){
            saldoSatu  = saldo * 8/100;
            saldoDua = saldoSatu + saldo;
            saldo = saldoDua;
            i++;
            DecimalFormat df = new DecimalFormat ("#,###,###");
            System.out.println("Saldo di Bulan Ke-"+i+" Rp."+df.format(saldo));
        }
    }
    
}
