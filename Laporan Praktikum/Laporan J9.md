# LAPORAN JOBSHEET 9 PRAKTIKUM ALGORITMA DAN STRUKTUR DATA

Dibuat oleh : <p>
Yasmine Navisha Andhani <p>
1F D4 Teknik Informatika <p>
2141720047 <p>

# 8.2 Praktikum 1
## 8.2.1 Langkah - langkah Percobaan
1. Perhatikan Diagram Class Queue berikut ini: <p>
<img src="J9 - 8.2.1 (1).PNG"> <p>
Berdasarkan diagram class tersebut, akan dibuat program class Queue dalam Java.
2. Buat package dengan nama Praktikum1, kemudian buat class baru dengan nama Queue.
3. Tambahkan atribut-atribut Queue sesuai diagram class, kemudian tambahkan pula konstruktornya seperti gambar berikut ini. <p>
<img src="J9 - 8.2.1 (3).PNG"> <p>
4. Buat method IsEmpty bertipe boolean yang digunakan untuk mengecek apakah queue kosong. <p>
<img src="J9 - 8.2.1 (4).PNG"> <p>
5. Buat method IsFull bertipe boolean yang digunakan untuk mengecek apakah queue sudah penuh. <p>
<img src="J9 - 8.2.1 (5).PNG"> <p>
6. Buat method peek bertipe void untuk menampilkan elemen queue pada posisi paling depan. <p>
<img src="J9 - 8.2.1 (6).PNG"> <p>
7. Buat method print bertipe void untuk menampilkan seluruh elemen pada queue mulai dari posisi front sampai dengan posisi rear. <p>
<img src="J9 - 8.2.1 (7).PNG"> <p>
8. Buat method clear bertipe void untuk menghapus semua elemen pada queue <p>
<img src="J9 - 8.2.1 (8).PNG"> <p>
9. Buat method Enqueue bertipe void untuk menambahkan isi queue dengan parameter dt yang bertipe integer <p>
<img src="J9 - 8.2.1 (9).PNG"> <p>
10. Buat method Dequeue bertipe int untuk mengeluarkan data pada queue di posisi belakang <p>
<img src="J9 - 8.2.1 (10).PNG"> <p>
11. Selanjutnya, buat class baru dengan nama QueueMain tetap pada package Praktikum1. Buat method menu bertipe void untuk memilih menu program pada saat dijalankan. <p>
<img src="J9 - 8.2.1 (11).PNG"> <p>
12. Buat fungsi main, kemudian deklarasikan Scanner dengan nama sc.
13. Buat variabel n untuk menampung masukan berupa jumlah maksimal elemen yang dapat disimpan pada queue. <p>
<img src="J9 - 8.2.1 (13).PNG"> <p>
14. Lakukan instansiasi objek Queue dengan nama Q dengan mengirimkan parameter n sebagai kapasitas elemen queue <p>
<img src="J9 - 8.2.1 (14).PNG"> <p>
15. Deklarasikan variabel dengan nama pilih bertipe integer untuk menampung pilih menu dari pengguna.
16. Lakukan perulangan menggunakan do-while untuk menjalankan program secara terus menerus sesuai masukan yang diberikan. Di dalam perulangan tersebut, terdapat pemilihan kondisi menggunakan switch-case untuk menjalankan operasi queue sesuai dengan masukan pengguna <p>
<img src="J9 - 8.2.1 (16a).PNG"> <p>
<img src="J9 - 8.2.1 (16b).PNG"> <p>
17. Compile dan jalankan class QueueMain, kemudian amati hasilnya.

## 8.2.2 Verifikasi Hasil Percobaan
<img src="J9 - 8.2.2.PNG">

## 8.2.3 Pertanyaan
1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size bernilai 0?
> : Kerena pada saat awal program dijalankan queue masih kosong, jadi front dan rear masih berada pada indeks -1 (diluar queue), dan size = 0 karena queue belum terisi
2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut! <p>
<img src="J9 - 8.2.3 (2).PNG"> <p>
> : Pada method Enqueue berparameter dt berisikan algoritma jika array sudah terisi penuh (IsFull) maka akan ada perintah untuk print tulisan "Queue sudah penuh"
3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut! <p>
<img src="J9 - 8.2.3 (3).PNG"> <p>
> : Pada method Dequeue berisikan algoritma pendeklarasian variable dt dengan tipe data interger, lalu jika array masih kosong (IsEmpty) maka akan ada perintah untuk print tulisan "Queue masih kosong", selaint itu maka nilai dt = array queue dengan indeks ke front (dt = data[front]) maka nilai size akan di decrement, kemudian lanjut pada sesi pemilihan kondisi
4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i=front?
> : Karena tidak selalu awal dari indeks yang bernilai itu bermulai dari indeks 0
5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut! <p>
<img src="J9 - 8.2.3 (5).PNG"> <p>
> : Jika array masih kosong (IsEmpty) makan akan ada perintah untuk print tulisan "queue masih kosong, selain itu deklarasi variable i dengan tipe data interger, dimana i = front, ketika i tidak sama dengan nilai rear maka akan melakukan print array indeks ke i, lalu nilai i = i ditambah 1 kemudian sisa bagi  max. Setelah itu print array indeks ke i dan print "Jumlah elemen = size
6. Tunjukkan potongan kode program yang merupakan queue overflow!
> : <img src="J9 - 8.2.3 (6).PNG"> <p>
7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan!
> : <img src="J9 - 8.2.3 (7).PNG"> <p>
<img src="J9 - 8.2.3 (7a).PNG"> <p>

# 8.3 Praktikum 2

## 8.3.1 Langkah - langkah Percobaan
1. Perhatikan Diagram Class berikut ini:
Berdasarkan diagram class tersebut, akan dibuat program class Nasabah dalam Java. <P>
<img src="J9 - 8.3.1 (1).PNG"> <p>
2. Buat package dengan nama Praktikum2, kemudian buat class baru dengan nama Nasabah.
3. Tambahkan atribut-atribut Nasabah seperti pada Class Diagram, kemudian tambahkan pula konstruktornya seperti gambar berikut ini. <P>
<img src="J9 - 8.3.1 (3).PNG"> <p>
4. Salin kode program class Queue pada Praktikum 1 untuk digunakan kembali pada Praktikum 2 ini. Karena pada Praktikum 1, data yang disimpan pada queue hanya berupa array bertipe integer, sedangkan pada Praktikum 2 data yang digunakan adalah object, maka perlu dilakukan modifikasi pada class Queue tersebut.
5. Lakukan modifikasi pada class Queue dengan mengubah tipe int[] data menjadi Nasabah[] data karena pada kasus ini data yang akan disimpan pada queue berupa object Nasabah. Modifikasi perlu dilakukan pada atribut, method Enqueue, dan method Dequeue. <p>
<img src="J9 - 8.3.1 (5a).PNG"> <p>
<img src="J9 - 8.3.1 (5b).PNG"> <p>
Baris program Nasabah dt = new Nasabah(); akan ditandai sebagai error, untuk mengatasinya, tambahkan konstruktor default di dalam class Nasabah.
6. Karena satu elemen queue terdiri dari beberapa informasi (norek, nama, alamat, umur, dan saldo), maka ketika mencetak data juga perlu ditampilkan semua informasi tersebut, sehingga meodifikasi perlu dilakukan pada method peek dan method print. <p>
<img src="J9 - 8.3.1 (6).PNG"> <p>
7. Selanjutnya, buat class baru dengan nama QueueMain tetap pada package Praktikum2. Buat method menu untuk mengakomodasi pilihan menu dari masukan pengguna <p>
<img src="J9 - 8.3.1 (7).PNG"> <p>
8. Buat fungsi main, deklarasikan Scanner dengan nama sc
9. Buat variabel max untuk menampung kapasitas elemen pada queue. Kemudian lakukan instansiasi objek queue dengan nama antri dan nilai parameternya adalah variabel jumlah. <p>
<img src="J9 - 8.3.1 (9).PNG"> <p>
10. Deklarasikan variabel dengan nama pilih bertipe integer untuk menampung pilih menu dari pengguna.
11. Tambahkan kode berikut untuk melakukan perulangan menu sesuai dengan masukan yang diberikan oleh pengguna. <p>
<img src="J9 - 8.3.1 (11).PNG"> <p>
12. Compile dan jalankan class QueueMain, kemudian amati hasilnya.

## 8.3.2 Verifikasi Hasil Percobaan


## 8.3.3 Pertanyaan
1. Pada class QueueMain, jelaskan fungsi IF pada potongan kode program berikut!<p>
<img src="J9 - 8.3.3 (1).PNG"> <p>
> : Jika kebalikan dari nilai norek hanya "" (nilai norek tidak kosong) dan Jika kebalikan dari nilai nama hanya "" (nilai nama tidak kosong) dan Jika kebalikan dari nilai alamat hanya "" (nilai alamat tidak kosong) dan jika nilai umur tidak samadengan 0 (!= 0) dan jika nilai saldo tidak samadengan 0 (!= 0) maka akan melanjutkan perintah selanjutnya
2. Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula daftar menu 5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear dapat dipanggil!
> : <img src="J9 - 8.3.3 (2).PNG"> <p>
<img src="J9 - 8.3.3 (2a).PNG"> <p>
<img src="J9 - 8.3.3 (2b).PNG"> <p>

# 8.4 Tugas
1. Tambahkan dua method berikut ke dalam class Queue pada Praktikum 1: <p>
a. Method peekPosition(data: int) : void <p>
Untuk menampilkan posisi dari sebuah data di dalam queue, misalnya dengan mengirimkan data tertentu, akan diketahui posisi (indeks) data tersebut berada di urutan ke berapa <p>
b. Method peekAt(position: int) : void <p>
Untuk menampilkan data yang berada pada posisi (indeks) tertentu
Sesuaikan daftar menu yang terdapat pada class QueueMain sehingga kedua method tersebut dapat dipanggil! <p>
> : 
```java
public class Queue {

    int data[];
    int front, rear, size, max;

    public Queue(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan : " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(int n) {
        if (!IsEmpty()) {
            for (int i = 0; i < max; i++) {
                if (data[i] == n) {
                    System.out.println("Elemen berada pada indeks ke : " + i + " yaitu data ke " + (i + 1));
                }
            }
        }
    }

    public void peekAt(int position) {
        for (int i = 0; i < max; i++) {
            if (i == position) {
                System.out.println("Nilai dari indeks tersebut adalah : " + data[position]);
            }
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(int dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public int Dequeue() {
        int dt = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    rear++;
                }
            }
        }
        return dt;
    }
}
```
```java
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
                    System.out.print("Masukkan data baru : ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan : " + dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
                case 6:
                    System.out.print("Masukkan nilai dari indeks yang dicari : ");
                    int cari = sc.nextInt();
                    Q.peekPosition(cari);
                    break;
                case 7:
                    System.out.print("Masukkan indeks yang anda cari : ");
                    int p = sc.nextInt();
                    Q.peekAt(p);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih ==7);
    }
}
```
Output <p>
<img src="J9 - 8.2.2.PNG">

2. Buatlah program antrian untuk mengilustasikan mahasiswa yang sedang meminta tanda tangan KRS pada dosen DPA di kampus. Ketika seorang mahasiswa akan mengantri, maka dia harus menuliskan terlebih dulu NIM, nama, absen, dan IPK seperti yang digambarkan pada Class diagram berikut:
> :
class Mahasiswa <p>
```java
public class Mahasiswa {

    String nim, nama;
    int absen;
    double ipk;

    Mahasiswa(String nim, String n, int a, double i){
        this.nim = nim;
        this.nama = n;
        this.absen = a;
        this.ipk = i;
    }
}
```
class QueueMahasiswa
```java
public class QueueMahasiswa {

    Mahasiswa[] antrian;
    int front, rear, size, max;

    public QueueMahasiswa(int n) {
        max = n;
        antrian = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan adalah : ");
            System.out.println("Nim : " + antrian[front].nim);
            System.out.println("Nama : " + antrian[front].nama);
            System.out.println("Absen : " + antrian[front].absen);
            System.out.println("IPK : " + antrian[front].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPositionNim(String n) {
        if (!IsEmpty()) {
            for (int i = 0; i < max; i++) {
                if (antrian[i] == n) {
                    System.out.println("Elemen berada pada indeks ke : " + i + " yaitu data ke " + (i + 1));
                } else {
                    System.out.println("Data tidak ditemukan, atau mungkin data sudah dikeluarkan");
                }
            }
        }
    }

    public void peekPositionNama(String n) {
        if (!IsEmpty()) {
            for (int i = 0; i < max; i++) {
                if (antrian[i] == n) {
                    System.out.println("Elemen berada pada indeks ke : " + i + " yaitu data ke " + (i + 1));
                } else {
                    System.out.println("Data tidak ditemukan, atau mungkin data sudah dikeluarkan");
                }
            }
        }
    }

    public void peekPositionAbsen(int n) {
        if (!IsEmpty()) {
            for (int i = 0; i < max; i++) {
                if (antrian[i] == n) {
                    System.out.println("Elemen berada pada indeks ke : " + i + " yaitu data ke " + (i + 1));
                } else {
                    System.out.println("Data tidak ditemukan, atau mungkin data sudah dikeluarkan");
                }
            }
        }
    }

    public void printMahasiswa(int position) {
        for(int i = 0, i < max; i++){
            if (i = position){
                System.out.println("Nilai dari indeks tersebut adalah : ");
                System.out.println("Nim : " + antrian[position].nim);
                System.out.println("Nama : " + antrian[position].nama);
                System.out.println("Absen : " + antrian[position].absen);
                System.out.println("IPK : " + antrian[position].ipk);
            }
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Elemen terbelakang adlah : ");
            System.out.println("Nim : " + antrian[rear].nim);
            System.out.println("Nama : " + antrian[rear].nama);
            System.out.println("Absen : " + antrian[rear].absen);
            System.out.println("IPK : " + antrian[rear].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println("Elemen terbelakang adlah : ");
                System.out.println("Nim : " + antrian[i].nim);
                System.out.println("Nama : " + antrian[i].nama);
                System.out.println("Absen : " + antrian[i].absen);
                System.out.println("IPK : " + antrian[i].ipk);
                i = (i + 1) % max;
            }
            System.out.println("Elemen terbelakang adlah : ");
            System.out.println("Nim : " + antrian[i].nim);
            System.out.println("Nama : " + antrian[i].nama);
            System.out.println("Absen : " + antrian[i].absen);
            System.out.println("IPK : " + antrian[i].ipk);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(Mahasiswa mhs) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = mhs;
            size++;
        }
    }

    public Mahasiswa Dequeue() {
        Mahasiswa mhs = new Mahasiswa();
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            mhs = antrian[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    rear++;
                }
            }
        }
        return mhs;
    }
}
```
class QueueMahasiswaMain
```java
import java.util.Scanner;

public class QueueMahasiswaMain {
    
    public static void menu() {
        System.out.println("Masukkan operasi yang diiinginkan");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian belakang");
        System.out.println("6. Cari letak indeks dengan NIM");
        System.out.println("7. Cari letak indeks dengan Nama");
        System.out.println("8. Cari letak indeks dengan Absen");
        System.out.println("9. Mencetak data mahasiswa berdasarkan urutan indeks");
        System.out.println("0. Exit");
        System.out.println("====================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas mahasiswa : ");
        int jumlah = sc.nextInt();
        QueueMahasiswa antri = new QueueMahasiswa(jumlah);
        
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("NIM Mahasiswa : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String n = sc.nextLine();
                    System.out.print("Absen Mahasiswa : ");
                    int a = sc.nextInt();
                    System.out.print("IPK : ");
                    double i = sc.nextDouble();
                    Mahasiswa m = new Mahasiswa(nim, n, a, i);
                    sc.nextLine();
                    antri.Enqueue(m);
                    break;
                case 2:
                    Mahasiswa data = antri.Dequeue();
                    if(!"".equals(data.nim) && !"".equals(data.nama ) && (data.absen) != 0 && data.ipk != 0){
                        System.out.println("Antrian yang keluar : ");
                        System.out.println("NIM : "+data.nim);
                        System.out.println("Nama : "+data.nama);
                        System.out.println("Absen : "+data.absen);
                        System.out.println("IPK : "+data.ipk);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan NIM Mahasiswa yang dicari : ");
                    String cari = sc.nextLine();
                    antri.peekPositionNim(cari);
                case 7:
                    System.out.print("Masukkan Nama Mahasiswa yang dicari : ");
                    String car = sc.nextLine();
                    antri.peekPositionNama(car);
                case 8:
                    System.out.print("Masukkan Absen Mahasiswa yang dicari : ");
                    int ca = sc.nextInt();
                    antri.peekPositionAbsen(ca);
                case 9:
                    System.out.print("Masukkan urutan mahasiswa yang anda cari : ");
                    int p = sc.nextInt();
                    antri.printMahasiswa(p);
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8 || pilih == 9);
    }
}
```