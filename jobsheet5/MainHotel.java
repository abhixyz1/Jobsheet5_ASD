package jobsheet5;
/**
 * @author Abhinaya
 */
public class MainHotel {
    public static void main(String[] args) {
        HotelService list = new HotelService();
        Hotel h1 = new Hotel();
        h1.Hotel("Aston", "Bali", 500000, (byte) 5);
        Hotel h2 = new Hotel();
        h2.Hotel("Hilton", "Jakarta", 750000, (byte) 5);
        Hotel h3 = new Hotel();
        h3.Hotel("Ibis", "Bandung", 300000, (byte) 3);
        Hotel h4 = new Hotel();
        h4.Hotel("Santika", "Yogyakarta", 400000, (byte) 4);
        Hotel h5 = new Hotel();
        h5.Hotel("Novotel", "Surabaya", 600000, (byte) 4);


        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("--------------------------------------------");
        System.out.println("------- Data Hotel Sebelum Sorting ---------");
        System.out.println("--------------------------------------------");
        list.tampil();
        
        System.out.println("--------------------------------------------");
        System.out.println("------- Data Hotel Setelah Sorting ---------");
        System.out.println("------ Berdasarkan Harga (Bubble Sort) -----");
        System.out.println("--------------------------------------------");
        list.bubbleSort();
        list.tampil();

        System.out.println("--------------------------------------------");
        System.out.println("------- Data Hotel Setelah Sorting ---------");
        System.out.println("---- Berdasarkan Harga (Selection Sort) ----");
        System.out.println("--------------------------------------------");
        list.selectionSort();
        list.tampil();

        System.out.println("--------------------------------------------");
        System.out.println("------- Data Hotel Setelah Sorting ---------");
        System.out.println("----- Berdasarkan Bintang (Bubble Sort) ----");
        System.out.println("--------------------------------------------");
        list.bubbleSortBintang();
        list.tampil();

        System.out.println("--------------------------------------------");
        System.out.println("------- Data Hotel Setelah Sorting ---------");
        System.out.println("--- Berdasarkan Bintang (Selection Sort) ---");
        System.out.println("--------------------------------------------");
        list.selectionSortBintang();
        list.tampil();


    }    
}
