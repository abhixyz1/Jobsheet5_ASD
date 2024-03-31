package jobsheet5;
/**
 * @author Abhinaya
 */
public class Hotel {
    String nama, kota;
    int harga;
    byte bintang;

    void Hotel(String n, String k, int h, byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }
    void tampilAll(){
        System.out.println("Nama Hotel\t: " + nama);
        System.out.println("Kota\t\t: " + kota);
        System.out.println("Harga\t\t: " + harga);
        System.out.println("Bintang\t\t: " + bintang);
    }
    
}
