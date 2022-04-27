import java.util.Scanner;

public class QueueMain {

    public static void menu() {
        System.out.println("Masukkan operasi yang diiinginkan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. Cari letak indeks");
        System.out.println("7. Cari nilai dari indeks");
        System.out.println("0. Exit");
        System.out.println("====================");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int n = sc.nextInt();

        Queue Q = new Queue(n);

        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    if (Q.IsFull()){
                        pilih = 0;
                    } else {
                        System.out.print("Masukkan data baru : ");
                        int dataMasuk = sc.nextInt();
                        Q.Enqueue(dataMasuk);
                        break;
                    }
                case 2:
                    if (Q.IsEmpty()) {
                        pilih = 0;
                    } else {
                        int dataKeluar = Q.Dequeue();
                        if (dataKeluar != 0) {
                            System.out.println("Data yang dikeluarkan : " + dataKeluar);
                            break;
                        }
                    }

            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 0);
    }
}