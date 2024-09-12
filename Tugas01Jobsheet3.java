import java.util.Scanner;
public class Tugas01Jobsheet3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tarifLis = 1500;
        System.out.print("Jumlah penggunaan listrik: ");
        double penggunaan = input.nextDouble();

        double totalTagihan = tarifLis * penggunaan;
        boolean banyakpenggunaan = penggunaan > 500;
        System.out.println("total tagihan Listrik: Rp " + totalTagihan);
        System.out.println(" melebihi 500 atau tidak = " + banyakpenggunaan);
    }
}

