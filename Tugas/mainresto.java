import java.util.Scanner;
class pbo3 {
    private String reservasi;
    private int no, harga, jumlah, total;
    
    public  pbo3(String reservasi, int harga, int jumlah, int no){
        this.reservasi=reservasi;
        this.harga=harga;
        this.jumlah=jumlah;
        this.total=total;
        this.no=no;
    }
    public void data() {
         System.out.println("Nama Reservasi :\t"+reservasi);
         System.out.println("Jumlah Pesanan :\t"+jumlah);
         System.out.println("No.  Reservasi:\t"+no);
    }
    
    protected int administrasi(){
        total= jumlah*harga;
        return total;
    }
}

public class mainresto{
    public static void main(String [] xx) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Masukan Nama Reservasi :\t");
        String reservasi = sc.nextLine();
        
        System.out.print("Masukan Nomor Reservasi:\t");
        int no=sc.nextInt();
        
        System.out.print("Masukan Jumlah Pesanan :\t");
        int jumlah = sc.nextInt();
        
        System.out.print("Masukan Harga          :\t");
        int harga = sc.nextInt();
        
        pbo3 reserved= new pbo3(reservasi,harga,jumlah,no);
        
        reserved.data();
        
        System.out.println("Total Biaya Reservasi : Rp "+reserved.administrasi());
        
    }
}