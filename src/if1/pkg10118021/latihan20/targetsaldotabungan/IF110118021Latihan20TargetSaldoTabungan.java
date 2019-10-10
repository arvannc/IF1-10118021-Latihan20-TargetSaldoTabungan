/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118021.latihan20.targetsaldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Arvan
 * NAMA     : M Arvan Nurcahyana
 * KELAS    : IF-1
 * NIM      : 10118021
 * Deskripsi Program : Target Saldo Tabungan
 */
public class IF110118021Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //mengubah kurensi ke rupiah
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp ");
        formatRp.setMonetaryDecimalSeparator('.');
        formatRp.setGroupingSeparator('.');
        rupiah.setDecimalFormatSymbols(formatRp);
        
        double bunga;
        double saldo = 3500000;
        
        int i = 1;
        while (i <= 10) {
            bunga = saldo * 0.08;
            saldo = (int) (saldo + bunga);
            System.out.printf("Saldo di bulan ke-"+ i + " %s%n",rupiah.format(saldo));
            i++;
            if (saldo >= 6000000) 
                break;
        }
        System.out.println("(Developed by : M. Arvan Nurcahyana)");
    }
}
