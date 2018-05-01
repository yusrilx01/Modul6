import java.util.*;
public class Stok
{
    static ArrayList<String> nama_brg =new ArrayList<String>();
    static ArrayList<String> kode_brg =new ArrayList<String>();
    static ArrayList<Integer> stok_tersedia =new ArrayList<Integer>();
    static ArrayList<Integer> stok_keluar =new ArrayList<Integer>();
    public void tambah_barang(String nama){
        nama_brg.add(nama);
    }
    public void tambah_kode_brg(String kode){
        nama_brg.add(kode);
    }
    public void tambah_stok(int stok){
        stok_tersedia.add(stok);
    }
    public void tambah_stok_keluar(int stok){
       stok_keluar.add(stok);
    }
    public ArrayList get_nama_brg(){       
     return nama_brg;    
    }
    public ArrayList get_no(){
      if(nama_brg.size()==0){
          System.out.print("\n?");
        }
      else{  
          for (int i=0;i<nama_brg.size();i++){
             System.out.print(i+0);  
            }  
        }
      return nama_brg;
    }
    public ArrayList get_kode(){
      if(nama_brg.size()==0){
          System.out.print("\tnone");
        }
      else{  
          for (int i=0;i<nama_brg.size();i++){
             System.out.print(i+0);  
            }  
        }
      return nama_brg;
    }
    
    
}
