import java.util.*;
public class test
{
   public static void main(){
        System.err.print("Moh Yusril Ihza Maulana");
        int pilih;
        String nama;
        Scanner input=new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("            program inventaris barang");
        System.out.println("==================================================");
        System.out.print("No.  Nama barang\t Stok Tersedia\t Stok keluar");
        Stok a =new Stok();
        //a.get_no();
        a.get_nama_brg();
        
        System.out.println("\n---------------------------------------------------");
        System.out.println("[1]tambah barang    [2]tambah stok  [3]stok keluar [4] hapus barang");
        System.out.print("Masukan pilihan anda: ");
        pilih=input.nextInt();
        if (pilih==1){
            nama=input.next();
            a.tambah_barang(nama);
            main();
        }else
        if(pilih==2){
        
        }else
        if(pilih==3){
        
        }else
        if(pilih==4){
        
        }
    }
}
