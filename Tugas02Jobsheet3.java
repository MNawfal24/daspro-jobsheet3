import java.util.Scanner;
public class Tugas02Jobsheet3{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        double upahKerja, jamKerja, gajiKerja, bonus, pajak, gajiBersih;
        System.out.println("jam kerja karyawan = " );
        jamKerja = sc.nextDouble();
        System.out.println("upah kerja karyawan = " );
        upahKerja = sc.nextDouble();
        gajiKerja = upahKerja * jamKerja;
        bonus = gajiKerja * 0.1;
        pajak = gajiKerja * 0.05;
        gajiBersih = gajiKerja + bonus - pajak;
        System.out.println ("Total Gaji Karyawan = Rp " + gajiBersih);


    }
}

