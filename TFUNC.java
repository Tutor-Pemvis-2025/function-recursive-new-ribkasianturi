// 12S25018 - Ribka Sianturi

import java.util.*;
import java.lang.Math;

public class TFUNC {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, hasil;

        n = Integer.parseInt(input.nextLine());
        hasil = hitungRekursif(n);
        System.out.println("Bilangan yang dimasukkan : " + n);
        System.out.println("Hasil perhitungan rekursif : " + hasil);
    }
    
    public static int hitungRekursif(int angka) {
        int hasilRekursi;

        if (angka == 1) {
            hasilRekursi = 1;
        } else {
            hasilRekursi = angka + hitungRekursif(angka - 1);
        }
        
        return hasilRekursi;
    }
}
