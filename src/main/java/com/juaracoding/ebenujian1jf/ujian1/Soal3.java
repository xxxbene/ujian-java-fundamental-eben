package com.juaracoding.ebenujian1jf.ujian1;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;


public class Soal3 {
    public static void main(String[] args) {
        int jumlahTiket;
        int hargaWeekend = 45000;
        int hargaWeekday = 35000;
        int hargaSebelumDiskon;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah tiket: ");
        jumlahTiket = Integer.parseInt(scanner.nextLine());

        System.out.print("Masukkan tanggal (YYYY-MM-DD): ");
        String inputDate = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(inputDate, formatter);

        DayOfWeek dayOfWeek = date.getDayOfWeek();

        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            hargaSebelumDiskon = jumlahTiket * hargaWeekend;
        } else {
            hargaSebelumDiskon = jumlahTiket * hargaWeekday;
        }

        if (jumlahTiket > 5) {
            System.out.println("Total Harga Dengan Diskon: " + (hargaSebelumDiskon * 0.9));
        } else {
            System.out.println("Total Harga Tanpa Diskon: " + hargaSebelumDiskon);
        }

    }
}
