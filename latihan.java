/**
 * @author Abhinaya
 */
public class latihan {
    public static void main(String[] args) {
        
        /* Materi Bubble Short
         * Bubble short adalah metode pengurutan dengan cara membandingkan elemen array yang berdekatan dan menukar elemen jika diperlukan.
         * Algoritma bubble short bekerja dengan cara membandingkan elemen pertama dengan elemen kedua, jika elemen pertama lebih besar dari elemen kedua maka elemen pertama akan ditukar dengan elemen kedua.
         * Lalu elemen kedua akan dibandingkan dengan elemen ketiga, jika elemen kedua lebih
         * besar dari elemen ketiga maka elemen kedua akan ditukar dengan elemen ketiga.
         * Begitu seterusnya hingga elemen terakhir.
        contoh:
            * array = {3, 7, 4, 1}
            * iterasi pertama
                * 3 > 7, maka 3, 7, 4, 1
                * 7 > 4, maka 3, 4, 7, 1
                * 7 > 1, maka 3, 4, 1, 7
            * iterasi kedua
                * 3 < 4, maka 3, 4, 1, 7
                * 4 > 1, maka 3, 1, 4, 7
                * 4 < 7, maka 3, 1, 4, 7
            * iterasi ketiga
                * 3 > 1, maka 1, 3, 4, 7
                * 3 < 4, maka 1, 3, 4, 7
                * 4 < 7, maka 1, 3, 4, 7
         */
        // latihan Bubble Short 1 //
        int[] arr = {5, 3, 1, 9, 8, 2, 4, 5, 7, 6}; // mendeklerasikan array yang akan diurutkan
        int n = arr.length; // mendeklarasikan panjang array
        int temp = 0; // mendeklarasikan variabel temp untuk menyimpan nilai sementara

        System.out.println("Sebelum diurutkan: ");
        for (int i = 0; i < n; i++) { 
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < n; i++) { // perulangan untuk mengurutkan array
            for (int j = 1; j < (n - i); j++) { // perulangan untuk membandingkan elemen array 
                if (arr[j - 1] > arr[j]) { // jika elemen array sebelumnya lebih besar dari elemen array sekarang
                    //swap elements
                    temp = arr[j - 1]; // menyimpan nilai elemen array sebelumnya ke dalam variabel temp
                    arr[j - 1] = arr[j]; // mengganti nilai elemen array sebelumnya dengan elemen array sekarang
                    arr[j] = temp;  // mengganti nilai elemen array sekarang dengan nilai temp yang berisi nilai elemen array sebelumnya
                }
            }
        }

        /*  penjelasan alur latihan bubble short 1
        pertama array yang akan diurutkan adalah {5, 3, 1, 9, 8, 2, 4, 5, 7, 6}
        lalu pengurutannya dimulai dari 5, 3, 1, 9, 8, 2, 4, 5, 7, 6

        -iterasi pertama
        5 > 3, 3 < 5, maka 3, 5, 1, 9, 8, 2, 4, 5, 7, 6
        5 > 1, 1 < 5, maka 3, 1, 5, 9, 8, 2, 4, 5, 7, 6
        5 < 9, maka 3, 1, 5, 9, 8, 2, 4, 5, 7, 6
        9 > 8, 8 < 9, maka 3, 1, 5, 8, 9, 2, 4, 5, 7, 6
        9 > 2, 2 < 9, maka 3, 1, 5, 8, 2, 9, 4, 5, 7, 6
        9 > 4, 4 < 9, maka 3, 1, 5, 8, 2, 4, 9, 5, 7, 6
        9 > 5, 5 < 9, maka 3, 1, 5, 8, 2, 4, 5, 9, 7, 6
        9 > 7, 7 < 9, maka 3, 1, 5, 8, 2, 4, 5, 7, 9, 6
        9 > 6, 6 < 9, maka 3, 1, 5, 8, 2, 4, 5, 7, 6, 9

        -iterasi kedua
        3 > 1, 1 < 3, maka 1, 3, 5, 8, 2, 4, 5, 7, 6, 9
        3 < 5, maka 1, 3, 5, 8, 2, 4, 5, 7, 6, 9
        5 > 8, 8 < 5, maka 1, 3, 5, 8, 2, 4, 5, 7, 6, 9
        5 > 2, 2 < 5, maka 1, 3, 5, 2, 8, 4, 5, 7, 6, 9
        5 > 4, 4 < 5, maka 1, 3, 5, 2, 4, 8, 5, 7, 6, 9
        5 > 5, maka 1, 3, 5, 2, 4, 5, 8, 7, 6, 9
        5 > 7, 7 < 5, maka 1, 3, 5, 2, 4, 5, 7, 8, 6, 9
        8 > 6, 6 < 8, maka 1, 3, 5, 2, 4, 5, 7, 6, 8, 9
        9 > 8, maka 1, 3, 5, 2, 4, 5, 7, 6, 8, 9

        -iterasi ketiga
        1 < 3, maka 1, 3, 5, 2, 4, 5, 7, 6, 8, 9
        3 < 5, maka 1, 3, 5, 2, 4, 5, 7, 6, 8, 9
        5 > 2, 2 < 5, maka 1, 3, 2, 5, 4, 5, 7, 6, 8, 9
        5 > 4, 4 < 5, maka 1, 3, 2, 4, 5, 5, 7, 6, 8, 9
        5 > 5, maka 1, 3, 2, 4, 5, 5, 7, 6, 8, 9
        5 > 7, 7 < 5, maka 1, 3, 2, 4, 5, 5, 7, 6, 8, 9
        7 > 6, 6 < 7, maka 1, 3, 2, 4, 5, 5, 6, 7, 8, 9
        9 > 8, maka 1, 3, 2, 4, 5, 5, 6, 7, 8, 9

        -iterasi keempat
        1 < 3, maka 1, 3, 2, 4, 5, 5, 6, 7, 8, 9
        3 > 2, 2 < 3, maka 1, 2, 3, 4, 5, 5, 6, 7, 8, 9

        Array yang sudah diurutkan dengan bubble short 1 adalah 1, 2, 3, 4, 5, 5, 6, 7, 8, 9
        */
        System.out.println("\nSetelah diurutkan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // menampilkan array yang sudah diurutkan
        }

        // Latihan Bubble Short 2 //

        int[] arr2 = {14, 13, 19, 27, 43, 10, 33, 17, 42, 15, 87, 23, 37, 11, 12, 16, 18, 21, 24, 25};
        int n2 = arr2.length;
        int temp2 = 0;

        System.out.println("\nSebelum diurutkan: ");
        for (int i = 0; i < n2; i++) {
            System.out.print(arr2[i] + " ");
        }

        for (int i = 0; i < n2; i++) {
            for (int j = 1; j < (n2 - i); j++) {
                if (arr2[j - 1] > arr2[j]) {
                    //swap elements
                    temp2 = arr2[j - 1];
                    arr2[j - 1] = arr2[j];
                    arr2[j] = temp2;
                }
            }
        }

        System.out.println("\nSetelah diurutkan: ");
        for (int i = 0; i < n2; i++) {
            System.out.print(arr2[i] + " ");
        }

        /* Materi Selection Short
         * Selection short adalah metode pengurutan dengan cara mencari elemen terkecil dari array dan menukar elemen tersebut dengan elemen pertama.
         * Lalu mencari elemen terkecil dari array kecuali elemen pertama dan menukar elemen tersebut dengan elemen kedua.
         * Begitu seterusnya hingga elemen terakhir.
         * contoh:
            * array = {3, 7, 4, 1}
            * iterasi pertama
                * mencari elemen terkecil dari array {3, 7, 4, 1} yaitu 1
                * menukar elemen terkecil dengan elemen pertama, maka 1, 7, 4, 3
            * iterasi kedua
                * mencari elemen terkecil dari array kecuali elemen pertama {7, 4, 3}
                * elemen terkecil adalah 3
                * menukar elemen terkecil dengan elemen kedua, maka 1, 3, 4, 7
            data sudah terurut, dan hasilnya adalah 1, 3, 4, 7
         */

        // Latihan Selection Short 1 //

        int[] arr3 = {5, 3, 1, 9, 8, 2, 4, 5, 7, 6};
        int n3 = arr3.length;
        
        System.out.println("\nSebelum diurutkan: ");
        for (int i = 0; i < n3; i++) {
            System.out.print(arr3[i] + " ");
        }

        for (int i = 0; i < n3 - 1; i++) { // perulangan untuk mengurutkan array
            int index = i; // mendeklarasikan variabel index yang berisi nilai i
            for (int j = i + 1; j < n3; j++) { // perulangan untuk membandingkan elemen array
                if (arr3[j] < arr3[index]) { // jika elemen array sekarang lebih kecil dari elemen array index
                    index = j; // index akan berisi nilai j
                }
            }
            int smallerNumber = arr3[index]; // mendeklarasikan variabel smallerNumber yang berisi nilai arr3[index]
            arr3[index] = arr3[i]; // mengganti nilai arr3[index] dengan nilai arr3[i]
            arr3[i] = smallerNumber; // mengganti nilai arr3[i] dengan nilai smallerNumber
        }

        System.out.println("\nSetelah diurutkan: ");
        for (int i = 0; i < n3; i++) {
            System.out.print(arr3[i] + " ");
        }

        /* penjelasan alur latihan selection short 1
        pertama array yang akan diurutkan adalah {5, 3, 1, 9, 8, 2, 4, 5, 7, 6}
        lalu pengurutannya dimulai dari 5, 3, 1, 9, 8, 2, 4, 5, 7, 6

        -iterasi pertama
        mencari elemen terkecil dari array {5, 3, 1, 9, 8, 2, 4, 5, 7, 6} yaitu 1
        menukar elemen terkecil dengan elemen pertama, maka 1, 3, 5, 9, 8, 2, 4, 5, 7, 6

        -iterasi kedua
        mencari elemen terkecil dari array kecuali elemen pertama {3, 5, 9, 8, 2, 4, 5, 7, 6} yaitu 2
        menukar elemen terkecil dengan elemen kedua, maka 1, 2, 5, 9, 8, 3, 4, 5, 7, 6

        -iterasi ketiga
        mencari elemen terkecil dari array kecuali elemen pertama dan kedua {5, 9, 8, 3, 4, 5, 7, 6} yaitu 3
        menukar elemen terkecil dengan elemen ketiga, maka 1, 2, 3, 9, 8, 5, 4, 5, 7, 6

        dan seterusnya sampai terahkir yaitu 1, 2, 3, 4, 5, 5, 6, 7, 8, 9
         */

        /* Materi Insertion Short
            * Insertion short adalah metode pengurutan dengan cara membandingkan elemen array satu per satu dari kiri ke kanan.
            * Algoritma insertion short bekerja dengan cara membandingkan elemen array pertama dengan elemen array kedua.
            * Jika elemen array pertama lebih besar dari elemen array kedua maka elemen array pertama akan ditukar dengan elemen array kedua.
            * Begitu seterusnya hingga elemen terakhir.
            * Metode Insertion short seperti memasukkan kartu ke dalam tangan, dimana kartu yang dimasukkan akan diletakkan pada posisi yang tepat.
            * contoh:
                * array = {3, 7, 4, 1}
                * iterasi pertama
                    * 3, 7, 4, 1
                    * 3 < 7, maka 3, 7, 4, 1
                * iterasi kedua
                    * 3, 7, 4, 1
                    * 7 > 4, maka 3, 4, 7, 1
                    * 3 < 4, maka 3, 4, 7, 1
                * iterasi ketiga
                    * 3, 4, 7, 1
                    * 7 > 1, maka 3, 4, 1, 7
                    * 4 > 1, maka 3, 1, 4, 7
                    * 3 > 1, maka 1, 3, 4, 7
                * iterasi keempat
                    * 1, 3, 4, 7
                    * data sudah terurut, dan hasilnya adalah 1, 3, 4, 7
         */

         // Latihan Insertion Short 1 //
        int[] arr4 = {5, 3, 1, 9, 8, 2, 4, 5, 7, 6};
        int n4 = arr4.length;
        
        System.out.println("\nSebelum diurutkan: ");
        for (int i = 0; i < n4; i++) {
            System.out.print(arr4[i] + " ");
        }

        for (int i = 1; i < n4; i++) { // perulangan untuk mengurutkan array
            int key = arr4[i]; // mendeklarasikan variabel key yang berisi nilai arr4[i]
            int j = i - 1; // mendeklarasikan variabel j yang berisi nilai i - 1

            while (j >= 0 && arr4[j] > key) { // perulangan untuk membandingkan elemen array
                arr4[j + 1] = arr4[j]; // mengganti nilai arr4[j + 1] dengan nilai arr4[j]
                j = j - 1; // mengurangi nilai j dengan 1
            }
            arr4[j + 1] = key; // mengganti nilai arr4[j + 1] dengan nilai key
        }

        System.out.println("\nSetelah diurutkan: ");
        for (int i = 0; i < n4; i++) {
            System.out.print(arr4[i] + " ");
        }

        /* penjelasan alur latihan insertion short 1
        pertama array yang akan diurutkan adalah {5, 3, 1, 9, 8, 2, 4, 5, 7, 6}
        lalu pengurutannya dimulai dari 5, 3, 1, 9, 8, 2, 4, 5, 7, 6

        -iterasi pertama
        5, 3, 1, 9, 8, 2, 4, 5, 7, 6
        3 < 5, maka 3, 5, 1, 9, 8, 2, 4, 5, 7, 6

        -iterasi kedua
        3, 5, 1, 9, 8, 2, 4, 5, 7, 6
        5 > 1, maka 3, 1, 5, 9, 8, 2, 4, 5, 7, 6
        3 > 1, maka 1, 3, 5, 9, 8, 2, 4, 5, 7, 6

        -iterasi ketiga
        1, 3, 5, 9, 8, 2, 4, 5, 7, 6
        5 > 9, maka 1, 3, 5, 9, 8, 2, 4, 5, 7, 6
        3 < 9, maka 1, 3, 5, 9, 8, 2, 4, 5, 7, 6

        dan seterusnya sampai terahkir yaitu 1, 2, 3, 4, 5, 5, 6, 7, 8, 9
         */
    } 
}