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

        // Implementasi Selection Sort dengan Java Contoh 2 dengan Ascending
        int[] arr2 = {23, 35, 14 ,7, 67, 89, 20};
        int n2 = arr2.length;
        int temp2 = 0;

        System.out.println("\nArray Sebelum Selection Sort");
        for (int i = 0; i < n2; i++) {
            System.out.print(arr2[i] + " ");
        }

        for (int i = 0; i < n2; i++) {
            for (int j = i + 1; j < n2; j++) {
                if (arr2[i] > arr2[j]) {
                    temp2 = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp2;
                }
            }
        }

        System.out.println("\nArray Setelah Selection Sort");
        for (int i = 0; i < n2; i++) {
            System.out.print(arr2[i] + " ");
        }

        /*
         * Penjelasan Alur Algoritma Selection Sort menggunakan Ascending:
         * data awal array : {23, 35, 14, 7, 67, 89, 20}
         * 
         * - Iterasi 1 :
         * elemen terkecil : 7 (index ke 3)
         * {7, 35, 14, 23, 67, 89, 20} -> 7 adalah elemen terkecil, tukar dengan 23
         * 
         * - Iterasi 2 :
         * elemen terkecil : 14 (index ke 2)
         * {7, 14, 35, 23, 67, 89, 20} -> 14 adalah elemen terkecil, tukar dengan 35
         * 
         * - Iterasi 3 :
         * elemen terkecil : 20 (index ke 6)
         * {7, 14, 20, 23, 67, 89, 35} -> 20 adalah elemen terkecil, tukar dengan 35
         * 
         * - Iterasi 4 :
         * elemen terkecil : 23 (index ke 3)
         * {7, 14, 20, 23, 67, 89, 35} -> 23 adalah elemen terkecil, tukar dengan 67
         * 
         * - Iterasi 5 :
         * elemen terkecil : 35 (index ke 6)
         * {7, 14, 20, 23, 35, 89, 67} -> 35 adalah elemen terkecil, tukar dengan 89
         * 
         * - Iterasi 6 :
         * elemen terkecil : 67 (index ke 6)
         * {7, 14, 20, 23, 35, 67, 89} -> 67 adalah elemen terkecil, tukar dengan 89
         * 
         * hasil akhirnya adalah 7, 14, 20, 23, 35, 67, 89
         */

        /*
         * Jelaskan Tindakan yang dilakukan oleh Selection Sort Jika Menemukan Elemen data yang sama Nilainya
         * 
         * Algoritma Selection Sort akan mencari elemen dengan nilai terkecil dan menukarnya dengan elemen pertama
         * Jika ada elemen terkecil dengan nilai yang sama, maka elemen yang pertama kali ditemukan akan dipilih
         * 
         * Contoh Array : {23, 33, 45, 17, 33}
         * 
         * - Iterasi 1 :
         * elemen terkecil : 17 (index ke 3)
         * {17, 33, 45, 23, 33} -> 17 adalah elemen terkecil, tukar dengan 23
         * 
         * - Iterasi 2 :
         * elemen terkecil : 23 (index ke 3)
         * {17, 23, 45, 33, 33} -> 23 adalah elemen terkecil, tukar dengan 33
         * 
         * - Iterasi 3 :
         * elemen terkecil : 33 (index ke 3)
         * {17, 23, 33, 45, 33} -> 33 adalah elemen terkecil, tukar dengan 45
         * 
         * - Iterasi 4 :
         * elemen terkecil : 33 (index ke 4)
         * {17, 23, 33, 33, 45} -> 33 adalah elemen terkecil, tukar dengan 45
         * 
         * - Hasil akhirnya adalah {17, 23, 33, 33, 45}
         */
    }
}
