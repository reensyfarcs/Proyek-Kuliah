class PBO2
{
    String nama;
    int umur;
    String warnaBulu;
    
    PBO2(String nama, int umur, String waraBulu){
        this.nama = nama;
        this.umur = umur;
        this.warnaBulu = warnaBulu;
    }
        void gonggong() {
        System.out.println(nama+ "sedang menggonggong.");
        }
        void berburu(){
        System.out.println(nama+ "sedang berburu.");
        }
    }
    public class Rubah {
    public static void main (String[] args)
    {
        PBO2 rubah1 = new PBO2 ("Rufus", 3, "Putih");
        PBO2 rubah2 = new PBO2 ("Artik", 2, "Coklat");
        
        rubah1.gonggong();
        rubah1.berburu();
        
        rubah2.gonggong();
        rubah2.berburu();
        
        System.out.println("Nama: "+rubah1.nama+", Umur: "+rubah1.umur+", Warna Bulu: "+rubah1.warnaBulu);
        System.out.println("Nama: "+rubah2.nama+", Umur: "+rubah2.umur+", Warna Bulu: "+rubah2.warnaBulu);
    }
    }

