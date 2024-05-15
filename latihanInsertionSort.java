/**
 * @author Abhinaya
 */
public class latihanInsertionSort {
    public static void main(String[] args) {
        
        /*
         * Materi : Insertion Sort
         * Selection Sort adalah metode algoritma pengurutan sederhana yang dimulai dari elemen kedua array
         * dan membandingkan dengan elemen pertama, lalu apabila elemen kedua lebih kecil dari elemen pertama maka
         * elemen pertama akan digeser ke kanan dan elemen kedua akan menggantikan posisi elemen pertama.
         * 
         * 1. Mulai dari elemen kedua, bandingkan dengan elemen sebelumnya dan tukar jika perlu.
         * 2. Lanjutkan ke elemen berikutnya dan ulangi prosesnya, “menyisipkan” elemen ini ke posisi yang tepat di bagian terurut.
         * 
         * ilustrasi cara kerja insertion sort :
         * Awal : 43, 21, 12, 45, 32, 54, 65, 23, 76, 34
         * - Iterasi 1 :
         * Langkah 1 : 21, 43, 12, 45, 32, 54, 65, 23, 76, 34 -> 21 lebih kecil dari 43, tukar posisi
         * Langkah 2 : 12, 21, 43, 45, 32, 54, 65, 23, 76, 34 -> 12 lebih kecil dari 43, tukar posisi
         * Langkah 3 : 12, 21, 43, 45, 32, 54, 65, 23, 76, 34 -> 45 lebih besar dari 43, tidak ada tukar posisi
         * Langkah 4 : 12, 21, 43, 45, 32, 54, 65, 23, 76, 34 -> 32 lebih kecil dari 45, tukar posisi
         * Langkah 5 : 12, 21, 32, 43, 45, 54, 65, 23, 76, 34 -> 54 lebih besar dari 45, tidak ada tukar posisi
         * Langkah 6 : 12, 21, 32, 43, 45, 54, 65, 23, 76, 34 -> 65 lebih besar dari 54, tidak ada tukar posisi
         * Langkah 7 : 12, 21, 32, 43, 45, 54, 65, 23, 76, 34 -> 23 lebih kecil dari 65, tukar posisi
         * Langkah 8 : 12, 21, 23, 32, 43, 45, 54, 65, 76, 34 -> 76 lebih besar dari 65, tidak ada tukar posisi
         * Langkah 9 : 12, 21, 23, 32, 43, 45, 54, 65, 76, 34 -> 34 lebih kecil dari 76, tukar posisi
         * - Dan hasil akhirnya adalah 12, 21, 23, 32, 34, 43, 45, 54, 65, 76
         */

         // Implementasi Insertion Sort dengan Java
            int arr[] = { 43, 21, 12, 45, 32, 54, 65, 23, 76, 34 }; // pertama mendeklarasikan array yang akan diurutkan
            int n = arr.length; // mendeklerasikan integer n yang berisi panjang array

            System.out.println("Array Sebelum Insertion Sort");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

            for (int i = 1; i < n; i++) { // dimulai dari elemen kedua array karena elemen pertama dianggap sudah berada di posisi yang benar
                while ((i > 0) && (arr[i] < arr[i - 1])) { // membandingkan elemen yang sedang diurutkan dengan elemen-elemen sebelumnya dengan array. Jika elemen yang sedang diurutkan lebih kecil dari elemen sebelumnya maka akan dilakukan pertukaran posisi
                    int temp = arr[i];  // membuat variabel temp yang berisi elemen yang sedang diurutkan
                    arr[i] = arr[i - 1]; // elemen yang sedang diurutkan akan ditukar dengan elemen sebelumnya
                    arr[i - 1] = temp; // elemen sebelumnya akan ditukar dengan elemen yang sedang diurutkan
                    i--; // mengurangi nilai i
                }
            }

            System.out.println("\nArray Setelah Insertion Sort");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

            // Implementasi Insertion Sort dengan Java Contoh 2 dengan Descending
            int[] arr2 = { 23, 35, 14, 7, 67, 89, 20 }; 
            int n2 = arr2.length;

            System.out.println("\nArray Sebelum Insertion Sort Descending");
            for (int i = 0; i < n2; i++) {
                System.out.print(arr2[i] + " ");
            }

            for (int i = 1; i < n2; i++) {
                while ((i > 0) && (arr2[i] > arr2[i - 1])) {
                    int temp = arr2[i];
                    arr2[i] = arr2[i - 1];
                    arr2[i - 1] = temp;
                    i--;
                }
            }

            System.out.println("\nArray Setelah Insertion Sort Descending");
            for (int i = 0; i < n2; i++) {
                System.out.print(arr2[i] + " ");
            }

            /*
             * Penjelasan Alur Algoritma Insertion Sort menggunakan Descending:
             * data awal array : {23, 35, 14, 7, 67, 89, 20}
             * 
             * - Iterasi 1 :
             * Mulai dengan indeks ke 1 (35)
             * Karena 35 > 23, maka simpan 35 dan letakkan di sebelum 23
             * 35 {23, 23, 14, 7, 67, 89, 20} -> {35, 23, 14, 7, 67, 89, 20}
             * 
             * - Iterasi 2 :
             * Pindah ke indeks ke 2 (14)
             * Karena 14 < 23 dan 14 < 35, maka 14 tetap di tempatnya
             * {35, 23, 14, 7, 67, 89, 20}
             * 
             * - Iterasi 3 :
             * Pindah ke indeks ke 3 (7)
             * Karena 7 < 14, 7 < 23, dan 7 < 35, maka 7 tetap di tempatnya
             * {35, 23, 14, 7, 67, 89, 20}
             * 
             * - Iterasi 4 :
             * Pinah ke indeks ke 4 (67)
             * Karena 67 > 7, 67 > 14, 67 > 23, dan 67 > 35, maka simpan 67 dan letakkan di sebelum 35
             * 67 {35, 23, 14, 7, 7, 89, 20} -> 67 {35, 23, 14, 14, 7, 89, 20} -> 67 {35, 23, 23, 14, 7, 89, 20}
             * -> 67 {35, 35, 23, 14, 7, 89, 20} -> {67, 35, 23, 14, 7, 89, 20}
             * 
             * - Iterasi 5 :
             * Pindah ke indeks ke 5 (89)
             * Karena 89 > 7, 89 > 14, 89 > 23, 89 > 35, dan 89 > 67, maka simpan 89 dan letakkan di sebelum 67
             * 89 {67, 35, 23, 14, 7, 7, 20} -> 89 {67, 35, 23, 14, 14, 7, 20} -> 89 {67, 35, 23, 23, 14, 7, 20}
             * -> 89 {67, 35, 35, 23, 14, 7, 20} -> 89 {67, 67, 35, 23, 14, 7, 20} -> {89, 67, 35, 23, 14, 7, 20}
             * 
             * - Iterasi 6 :
             * Pindah ke indeks ke 6 (20)
             * Karena 20 > 7, 20 > 14, 20 < 23, 20 < 35, 20 < 67, dan 20 < 89, maka simpan 20 dan letakkan sebelum 14
             * 20 {89, 67, 35, 23, 14, 7, 7} -> 20 {89, 67, 35, 23, 14, 14, 7} -> {89, 67, 35, 23, 20, 14, 7}
             * 
             * Hasil akhirnya adalah {89, 67, 35, 23, 20, 14, 7}
             */

    }
}
