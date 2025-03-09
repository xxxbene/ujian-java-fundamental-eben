package com.juaracoding.ebenujian1jf.ujian1;

public class Soal5 {
    public static void main(String[] args) {

        int[] hargaTiketFilm = {50000, 60000, 70000, 80000, 90000};
        int totalHarga = 0;

        for (int i = 0; i < hargaTiketFilm.length; i++) {
            System.out.println("Harga Tiket Film " + (i+1) + ": " + hargaTiketFilm[i]);
            totalHarga += hargaTiketFilm[i];
        }

        System.out.println("Total Harga Tiket: " + totalHarga);
    }
}
