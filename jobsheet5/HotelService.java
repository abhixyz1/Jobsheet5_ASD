package jobsheet5;
/**
 * @author Abhinaya
 */
public class HotelService {
    Hotel rooms[] = new Hotel[5];
    int index;

    void tambah(Hotel h){
        if(index < rooms.length){
            rooms[index] = h;
            index++;
        }
    }

    void tampil(){
        for(Hotel h : rooms){
            h.tampilAll();
            System.out.println("============================================");
        }
    }

    // method sorting berdasarkan harga
    void bubbleSort(){
        for(int i = 0; i < rooms.length-1; i++){
            for(int j = 1; j < rooms.length-i; j++){
                if(rooms[j].harga < rooms[j-1].harga){
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = temp;
                }
            }
        }
    }

    void selectionSort(){
        for(int i = 0; i < rooms.length-1; i++){
            int min = i;
            for(int j = i+1; j < rooms.length; j++){
                if(rooms[j].harga < rooms[min].harga){
                    min = j;
                }
            }
            Hotel temp = rooms[min];
            rooms[min] = rooms[i];
            rooms[i] = temp;
        }
    }

    // method sorting berdasarkan bintang
    void bubbleSortBintang(){
        for(int i = 0; i < rooms.length-1; i++){
            for(int j = 1; j < rooms.length-i; j++){
                if(rooms[j].bintang > rooms[j-1].bintang){
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = temp;
                }
            }
        }
    }

    void selectionSortBintang(){
        for(int i = 0; i < rooms.length-1; i++){
            int min = i;
            for(int j = i+1; j < rooms.length; j++){
                if(rooms[j].bintang > rooms[min].bintang){
                    min = j;
                }
            }
            Hotel temp = rooms[min];
            rooms[min] = rooms[i];
            rooms[i] = temp;
        }
    }
}
