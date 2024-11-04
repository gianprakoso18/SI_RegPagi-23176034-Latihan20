/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.targetsaldotabungan;

/**
 *
 * @author gianp
 * NAMA     : Gian Prakoso
 * KELAS    : Sistem Informasi
 * NIM      : 23176034
 */
public class TargetSaldoTabungan {
    public static void main(String[] args) {
        double saldoAwal = 3500000;
        double saldoTarget = 6000000;
        double bunga = 0.08;
        int bulan = 1;

        while (saldoAwal < saldoTarget) {
            saldoAwal += saldoAwal * bunga;
            System.out.printf("Saldo di bulan ke-%d Rp. %,d%n", bulan, (int) saldoAwal);
            bulan++;
        }
    }
}