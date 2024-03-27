/**
 * @author Abhinaya
 */
public class latihanBubbleSort {
    public static void main(String[] args) {

        /*
         * Materi : Bubble Sort
         * Bubble Sort adalah metode algoritma pengurutan sederhana yang bekerja dengan cara bergerak berulang dari awal hingga akhir data untuk
         * membandingkan semua elemen yang saling bersebelahan. Selama melakukan perbandingan jika ditemukan urutan elemen data yang tidak
         * sesuai berdasarkan kondisi tertentu maka tukar ke dua posisi elemen data tersebut.
         * 
         * 1. Mulai dari awal array, bandingkan setiap pasangan elemen dan tukar jika
         * elemen pertama lebih besar.
         * 2. Lakukan langkah ini sampai akhir array, yang akan menempatkan elemen
         * terbesar di posisi terakhir.
         * 3. Ulangi proses ini untuk setiap elemen kecuali yang terakhir ditempatkan.
         * 
         * ilustrasi cara kerja bubble sort :
         * Awal : 7, 1, 3, 4, 9, 2, 6
         * - Iterasi 1 :
         * Langkah 1 : 1, 7, 3, 4, 9, 2, 6 -> Tukar 7 dan 1
         * Langkah 2 : 1, 3, 7, 4, 9, 2, 6 -> Tukar 7 dan 3
         * Langkah 3 : 1, 3, 4, 7, 9, 2, 6 -> Tukar 7 dan 4
         * Langkah 4 : 1, 3, 4, 7, 9, 2, 6 -> Tidak ada pertukaran
         * Langkah 5 : 1, 3, 4, 7, 2, 9, 6 -> Tukar 9 dan 2
         * Langkah 6 : 1, 3, 4, 7, 2, 6, 9 -> Tukar 9 dan 6
         * - Iterasi 2 :
         * Langkah 1 : 1, 3, 4, 7, 2, 6, 9 -> Tidak ada pertukaran
         * Langkah 2 : 1, 3, 4, 2, 7, 6, 9 -> Tukar 7 dan 2
         * Langkah 3 : 1, 3, 4, 2, 6, 7, 9 -> Tukar 7 dan 6
         * - Iterasi 3 :
         * Langkah 1 : 1, 3, 4, 2, 6, 7, 9 -> Tidak ada pertukaran
         * Langkah 2 : 1, 3, 2, 4, 6, 7, 9 -> Tukar 4 dan 2
         * - Iterasi 4 :
         * Langkah 1 : 1, 3, 2, 4, 6, 7, 9 -> Tukar 4 dan 2
         * - Iterasi 5 :
         * Langkah 1 : 1, 2, 3, 4, 6, 7, 9 -> Tukar 3 dan 2
         * - Dan hasil akhirnya adalah 1, 2, 3, 4, 6, 7, 9
         */

        // Implementasi Bubble Sort dengan Java
        int[] arr = { 7, 1, 3, 4, 9, 2, 6 }; // pertama mendeklarasikan array yang akan diurutkan
        int n = arr.length; // mendeklerasikan integer n yang berisi panjang array
        int temp = 0; // mendeklarasikan integer temp yang berisi 0 sebagai penampung sementara saat
                      // pertukaran

        System.out.println("Array Sebelum Bubble Sort");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < n; i++) { // untuk mengulangi proses sebanyak panjang array
            for (int j = 1; j < (n - i); j++) { // untuk mengulangi proses sebanyak panjang array dikurangi i
                if (arr[j - 1] > arr[j]) { // untuk membandingkan elemen array jika elemen sebelumnya lebih besar dari
                                           // elemen setelahnya
                    // Swap elements
                    temp = arr[j - 1]; // jika kondisi diatas terpenuhi maka elemen sebelumnya akan disimpan di temp
                    arr[j - 1] = arr[j]; // elemen sebelumnya akan diisi dengan elemen setelahnya
                    arr[j] = temp; // elemen setelahnya akan diisi nilai dari temp
                }
            }
        }

        System.out.println("\nArray Setelah Bubble Sort");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
