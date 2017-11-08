/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testformatnumber;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 *
 * @author sulleynguyen
 */
public class TestDinhDangSymbol {

    public static void main(String[] args) {
        int a = 242543436;
        DecimalFormat df = new DecimalFormat("#,####");
        DecimalFormatSymbols dfs = 
                new DecimalFormatSymbols(Locale.getDefault());
        dfs.setGroupingSeparator('.');
        df.setDecimalFormatSymbols(dfs);
        System.out.println("dcf: " + df.format(a));
    }
}
