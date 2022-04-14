/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table_driven_construction;

/**
 *
 * @author faishal
 */

import java.util.Scanner;
public class mainNamaHewan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama Hewan : ");
        String kl = input.nextLine();
        System.out.println(NamaHewan.getNamaHewan(kl));
        input.close();
    }
}
