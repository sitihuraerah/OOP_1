/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilangankelipatan3;

/**
 *
 * @author SITI
 */
public class BilanganKelipatan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 3;
        
        do {
            if (i%5!=0){
                System.out.println(i);
            }
            i+=3;
        } while (i<=30);
    }
}
