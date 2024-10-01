import java.util.*;
import java.lang.Math;

public class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double tugas1, tugas, kuis, kuis1, uts, uts1, uas, uas1, hasil;

        System.out.println("Masukkan Nilai Tugas =");
        tugas1 = input.nextDouble();
        System.out.println("Masukkan Nilai Kuis =");
        kuis1 = input.nextDouble();
        System.out.println("Masukkan Nilai UTS =");
        uts1 = input.nextDouble();
        System.out.println("Masukkan Nilai UAS =");
        uas1 = input.nextDouble();
        tugas = tugas1 * 0.2;
        kuis = kuis1 * 0.1;
        uts = uts1 * 0.3;
        uas = uas1 * 0.4;
        hasil = tugas + kuis + uts + uas;
        System.out.println("Hasil =" + hasil);
    }
}
