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
    }
}
