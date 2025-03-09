package com.juaracoding.ebenujian1jf.ujian1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Masukan Nama Film:");
        String namaFilm = obj.nextLine();
        System.out.println("Nama Film Dengan Huruf Besar: "+namaFilm.toUpperCase());
    }
}
