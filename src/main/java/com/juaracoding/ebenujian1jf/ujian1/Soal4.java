package com.juaracoding.ebenujian1jf.ujian1;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] films = new String[5];

        System.out.println("Daftar Film Bioskop:");

        for (int i = 0; i < films.length; i++) {
            System.out.println("Masukan Nama Film " + (i+1) + ": ");
            films[i] = scanner.nextLine();
        }
        System.out.println("\nFilm yang ingin ditonton:");

        for (int i = 0; i < films.length; i++) {
            System.out.println((i+1) + ". " +films[i]);

        }
    }
}
