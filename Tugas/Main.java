import java.util.Scanner;

// Class utama
class Rumah {
    private String nama;
    private String noTelepon;
    private Sultan sultan;
    private Expatriat expatriat;

    // Konstruktor
    public Rumah() {
        sultan = new Sultan();
        expatriat = new Expatriat();
    }

    public void mainMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda: ");
        nama = scanner.nextLine();
        System.out.print("Masukkan No Telepon Anda: ");
        noTelepon = scanner.nextLine();

        boolean lagi = true;
        while (lagi) {
            System.out.println("Pilihan Rumah (Ketik 1/2):");
            System.out.println("1. Sultan");
            System.out.println("2. Expatriat");
            System.out.print("Pilihan Anda: ");
            int pilihanRumah = scanner.nextInt();

            if (pilihanRumah == 1) {
                sultan.pilihJenisRumah();
            } else if (pilihanRumah == 2) {
                expatriat.pilihJenisRumah();
            } else {
                System.out.println("Pilihan tidak valid!");
                continue;
            }

            System.out.print("Apakah ingin input lagi [y/t]: ");
            String inputLagi = scanner.next();
            lagi = inputLagi.equalsIgnoreCase("y");
        }

        int totalHarga = sultan.totalHarga() + expatriat.totalHarga();
        System.out.println("\nTotal yang harus dibayar: Rp" + totalHarga);
        System.out.println("Terima kasih, " + nama + "!");
        scanner.close();
    }
}

// Class Sultan
class Sultan {
    private int hargaArab = 2100000000;
    private int hargaAsia = 1700000000;
    private int hargaAfrika = 1000000000;
    private int totalArab = 0;
    private int totalAsia = 0;
    private int totalAfrika = 0;

    // Method untuk memilih jenis rumah Sultan
    public void pilihJenisRumah() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilihan Anda (Jenis Rumah Sultan) (Ketik 1/2/3):");
        System.out.println("1. Sultan Arab");
        System.out.println("2. Sultan Asia");
        System.out.println("3. Sultan Afrika");
        System.out.print("Pilihan Anda: ");
        int pilihan = scanner.nextInt();

        System.out.print("Banyak rumah yang ingin dibeli: ");
        int jumlah = scanner.nextInt();

        if (pilihan == 1) {
            totalArab += hitungHargaArab(jumlah);
        } else if (pilihan == 2) {
            totalAsia += hitungHargaAsia(jumlah);
        } else if (pilihan == 3) {
            totalAfrika += hitungHargaAfrika(jumlah);
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }

    // Non-void methods untuk menghitung harga per jenis rumah
    public int hitungHargaArab(int jumlah) {
        return hargaArab * jumlah;
    }

    public int hitungHargaAsia(int jumlah) {
        return hargaAsia * jumlah;
    }

    public int hitungHargaAfrika(int jumlah) {
        return hargaAfrika * jumlah;
    }

    // Non-void method untuk menghitung total harga
    public int totalHarga() {
        return totalArab + totalAsia + totalAfrika;
    }
}

// Class Expatriat
class Expatriat {
    private int hargaImport = 988000000;
    private int hargaLokal = 920000000;
    private int hargaNew = 900000000;
    private int totalImport = 0;
    private int totalLokal = 0;
    private int totalNew = 0;

    // Method untuk memilih jenis rumah Expatriat
    public void pilihJenisRumah() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilihan Anda (Jenis Rumah Expatriat) (Ketik 1/2/3):");
        System.out.println("1. Expatriat Import");
        System.out.println("2. Expatriat Lokal");
        System.out.println("3. Expatriat New");
        System.out.print("Pilihan Anda: ");
        int pilihan = scanner.nextInt();

        System.out.print("Banyak rumah yang ingin dibeli: ");
        int jumlah = scanner.nextInt();

        if (pilihan == 1) {
            totalImport += hitungHargaImport(jumlah);
        } else if (pilihan == 2) {
            totalLokal += hitungHargaLokal(jumlah);
        } else if (pilihan == 3) {
            totalNew += hitungHargaNew(jumlah);
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }

    // Non-void methods untuk menghitung harga per jenis rumah
    public int hitungHargaImport(int jumlah) {
        return hargaImport * jumlah;
    }

    public int hitungHargaLokal(int jumlah) {
        return hargaLokal * jumlah;
    }

    public int hitungHargaNew(int jumlah) {
        return hargaNew * jumlah;
    }

    // Non-void method untuk menghitung total harga
    public int totalHarga() {
        return totalImport + totalLokal + totalNew;
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Rumah rumah = new Rumah();
        rumah.mainMethod();
    }
}