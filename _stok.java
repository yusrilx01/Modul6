/*** Moh Yusril Ihza Maulana */
public class _stok
{   //mendefinisikan instace variable dengan static
   static String nama_brg,kode_brg,tab;
   static int stok_tersedia,stok_masuk;
   static int stok_keluar=0;
   //constructor default
   public _stok(){
       System.out.println("Nama Barang");
       System.out.println("Kode Barang");
       System.out.println("Stok Barang");
    }
    //constructor utama
    public _stok(String nama,String kode,int stok,String tap){
        nama_brg=nama;
        kode_brg=kode;
        stok_tersedia=stok;
        tab=tap;
    }
    //method yang digunakan untuk mendapatkan nama barang
    public String get_nama_brg(){
        System.out.print(nama_brg);
        return nama_brg;
    }
    //method yang digunakan untuk mendapatkan kode barang
    public String  get_kode_brg(){
        System.out.print(kode_brg);
        return kode_brg;
    }
    // method yang digunakan untuk mengeset stok barang yang masuk
    public void set_stok_masuk(int stok){
        stok_masuk=stok;
    }
    //method yang digunakan untuk mendapatkan stok barang yang masuk
    public int get_stok_masuk(){
        System.out.print(stok_masuk);
        return stok_masuk;
    }
    //method yang di gunakan untuk mendapatkan stok barang yang tersedia
    public int get_stok_tersedia(){
        stok_tersedia+=stok_masuk;
        stok_tersedia=stok_tersedia-stok_keluar;
        System.out.print(stok_tersedia);
        return stok_tersedia;
    }
    //method yang digunakan untuk mendapatkan stok barang yang keluar
    public int get_stok_keluar(){
        System.out.print(stok_keluar);
        return stok_keluar;
    }
    //method yang digunakan untuk mengeset  stok barang yang keluar
    public void set_stok_keluar(int stok){       
         stok_keluar=stok_keluar+stok_keluar;
        stok_keluar=stok;
        
    }
    //method ini digunakan sebagai jarak
    public void tab(){
        System.out.print(tab);
    }
    /*** Moh Yusril Ihza Maulana */
}
