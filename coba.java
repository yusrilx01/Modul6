/*** Moh Yusril Ihza Maulana */
import java.util.*;//mengimport semua packed util
import java.lang.*;//mengimport semu packed lang
public class coba
{

  public static void main(){
      int pilih,masuk,keluar;
      String kode;
      Scanner input=new Scanner(System.in);
      _stok[] stok=new _stok[1];//membuat array dengan jumlah index 1
      stok[0]=new _stok("Pensil","kd_001",20,"               ");//membuat dan memasukan objek berparameter kedalam array stok
      System.out.println("\n==============================================================================");
      System.out.println("                         program inventaris barang");
      System.out.println("==============================================================================");
      System.out.print("No. Kode Barang  Nama barang\t Stok Tersedia\t Stok Masuk\t Stok keluar\n");  
      for(int i=0;i<stok.length;i++){
        System.out.print(+i+01);
        System.out.print("   ");
        stok[i].get_kode_brg();//memanggil method untuk mendapatkan kode barang
        System.out.print("       ");
        stok[i].get_nama_brg();//memanggil method untuk mendapatkan nama barang
        stok[i].tab();
        stok[i].get_stok_tersedia();//memanggil method untuk mendapatkan jumlah stok yang tersedia
        System.out.print("\t\t");
        stok[i].get_stok_masuk();//memanggil method untuk mendapatkan jumlah stok yang masuk
        System.out.print("\t\t");
        stok[i].get_stok_keluar();//memanggil method untuk mendapatkan jumlah stok yang keluar
        System.out.println();
        }
      System.out.println("\n------------------------------------------------------------------------------");
      System.out.println("[1]barang_masuk    [2]stok keluar     [3]exit");
      System.out.print("Masukan pilihan anda: ");
      pilih=input.nextInt();
      if(pilih==1){
        System.out.print("masukan kode barang: ");
        kode=input.next();
        if(kode.equalsIgnoreCase("kd_001")){
           System.out.println("[Menu Barang keluar]");
            System.out.println("------------------------------------------------------------------------------\n");
            System.out.print("masukan jumlah barang masuk: ");
            masuk=input.nextInt();
            stok[0].set_stok_masuk(masuk);//memanggil method untuk mengeset jumlah stok yang masuk
            System.out.print(masuk+" telah masuk");
            main();
        }
      }else
      if(pilih==2){
        System.out.print("masukan kode barang: ");
        kode=input.next();
        if(kode.equalsIgnoreCase("kd_001")){
            System.out.println("[Menu Barang keluar]");
            System.out.println("------------------------------------------------------------------------------\n");
            System.out.print("masukan jumlah barang keluar: ");
            keluar=input.nextInt();
            stok[0].set_stok_keluar(keluar);//memanggil method untuk mengeset jumlah stok yang masuk
            System.out.print(keluar+" telah keluar");
            main();
            
        }
      }else
      if(pilih==3){
        System.out.print("Terima Kasih Telah menggunakan program kami");
        System.exit(0);
        }
    }
    /*** Moh Yusril Ihza Maulana */
}
