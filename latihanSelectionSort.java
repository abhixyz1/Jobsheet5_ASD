/**
 * @author Abhinaya
 */
public class latihanSelectionSort {
    public static void main(String[] args) {
        
        /*
         * Materi : Selection Sort
         * Selection Sort adalah metode algoritma prngurutan yang bekerja dengan cara mencari elemen terkecil dari array dan menukarnya dengan elemen pertama.
         * Kemudian mencari elemen terkecil dari array yang tersisa dan menukarnya dengan elemen kedua. Proses ini berlanjut sampai seluruh elemen terurut.
         * 
         * 1. Mulai dari awal array, cari elemen terkecil dan tukar dengan elemen pertama.
         * 2. Lanjutkan proses ini untuk setiap posisi berikutnya di array sampai array terurut.
         * 
         * ilustrasi cara kerja selection sort :
         * Awal : 11, 25, 12, 22, 64, 3, 9, 14, 7
         * - Iterasi 1 :
         * langkah 1 : 3, 25, 12, 22, 64, 11, 9, 14, 7 -> 3 adalah elemen terkecil, tukar dengan 11
         * Langkah 2 : 3, 7, 12, 22, 64, 11, 9, 14, 25 -> 7 adalah elemen terkecil, tukar dengan 25
         * Langkah 3 : 3, 7, 9, 22, 64, 11, 12, 14, 25 -> 9 adalah elemen terkecil, tukar dengan 12
         * Langkah 4 : 3, 7, 9, 11, 64, 22, 12, 14, 25 -> 11 adalah elemen terkecil, tukar dengan 22
         * Langkah 5 : 3, 7, 9, 11, 12, 64, 22, 14, 25 -> 12 adalah elemen terkecil, tukar dengan 64
         * Langkah 6 : 3, 7, 9, 11, 12, 14, 22, 64, 25 -> 14 adalah elemen terkecil, tukar dengan 64
         * Langkah 7 : 3, 7, 9, 11, 12, 14, 22, 25, 64 -> 22 adalah elemen terkecil, tukar dengan 64
         * - Dan hasil akhirnya adalah 3, 7, 9, 11, 12, 14, 22, 25, 64
         */

        // Implementasi Selection Sort dengan Java
        int arr[] = { 11, 25, 12, 22, 64, 3, 9, 14, 7 }; // pertama mendeklarasikan array yang akan diurutkan
        int n = arr.length; // mendeklerasikan integer n yang berisi panjang array
        int temp = 0; // mendeklarasikan integer temp yang berisi 0 sebagai penampung sementara saat pertukaran

        System.out.println("Array Sebelum Selection Sort");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < n; i++) { // untuk mengulangi proses sebanyak panjang array
            for (int j = i + 1; j < n; j++) {  // untuk mencari elemen terkecil dari array yang belum diurutkan
                if (arr[i] > arr[j]) { // untuk membandingkan elemen array jika elemen sebelumnya lebih besar dari elemen setelahnya
                    // Swap elements
                    temp = arr[i]; // jika kondisi diatas terpenuhi maka elemen sebelumnya akan disimpan di temp
                    arr[i] = arr[j]; // elemen sebelumnya akan diisi dengan elemen setelahnya
                    arr[j] = temp;  // elemen setelahnya akan diisi nilai dari temp
                }
            }
        }

        System.out.println("\nArray Setelah Selection Sort");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
