
package pa_music;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public final class main {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<internasional> listinter = new ArrayList<>();
    static ArrayList<Indonesia> listindo = new ArrayList<>();
    
    public static void froze() throws IOException {
        System.out.print("Tekan Enter Untuk Melanjutkan... ");
        input.readLine();
        System.out.println("");
    }
    
    static final void SEE() { // final method
       System.out.println("\n\t\tPROGRAM MUSIC");
       System.out.println("===================================================");
    }
    
    public static void insert() throws IOException {
        SEE();
        System.out.println("Pilih Jenis Music: ");
        System.out.println("1. Internasional");
        System.out.println("2. Indonesia");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("========== DATA MUSIC ==========");
            System.out.print("Masukkan Genre               : ");
            String Genre = input.readLine();
            System.out.print("Masukkan Judul               : ");
            String judul = input.readLine();
            System.out.print("Masukkan Penyanyi            : ");
            String penyanyi = input.readLine();
            System.out.print("Masukkan Tahun rilis         : ");
            int tahun_rilis = Integer.parseInt(input.readLine());
            System.out.println("==================================");
            internasional inter= new internasional(judul, tahun_rilis, Genre, penyanyi);
            listinter.add(inter);
            
        }else if(pil == 2){
           System.out.println("========== DATA MUSIC ==========");
            System.out.print("Masukkan Genre               : ");
            String Genre = input.readLine();
            System.out.print("Masukkan Judul               : ");
            String judul = input.readLine();
            System.out.print("Masukkan Penyanyi            : ");
            String penyanyi = input.readLine();
            System.out.print("Masukkan Tahun rilis         : ");
            int tahun_rilis = Integer.parseInt(input.readLine());
            System.out.println("================================");
            Indonesia indo= new Indonesia(judul, tahun_rilis, Genre, penyanyi);
            listindo.add(indo);
        }else{
            System.out.println("Pilihan Salah");

        }
    }

    public static void display() throws IOException{
        SEE();
        System.out.println("Pilih Jenis Music: ");
        System.out.println("1. Internasional");
        System.out.println("2. Indonesia");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("\n============= LIHAT DATA MUSIC =============");
            if (listinter.isEmpty()){
                System.out.println("\ndata kosong!");
            }else{
                for(int i = 0; i < listinter.size();i++){
                    listinter.get(i).SEE();
                    }
                }
                System.out.println("==========================================");
        }else if(pil == 2){
            System.out.println("\n============ LIHAT DATA MUSIC ==============");
            if (listindo.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listindo.size();i++){
                    listindo.get(i).SEE();
                }
            }
                System.out.println("==========================================");
        }else{
            System.out.println("Pilihan salah");

        }
    }
    
    public static void update() throws IOException{
        SEE();
        System.out.println("Pilih Jenis Music: ");
        System.out.println("1. Internasional");
        System.out.println("2. Indonesia");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listinter.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                for(int i = 0; i < listinter.size();i++){
                    System.out.println("\n\tData ke-" + (i+1));
                    System.out.println("======================================");
                    listinter.get(i).SEE();
                     }
                    System.out.println("======================================");
                    System.out.print("Masukkan indeks data Music yang diubah: ");
                    int index = Integer.parseInt(input.readLine());
                    
                if (index <= listinter.size() || index > 0){
                     System.out.println("======= Data Music Yang Baru ========");
                     System.out.print("Genre                   :");
                     String genre = input.readLine();
                     listinter.get(index-1).setGenre(genre);
                     
                     System.out.print("Masukkan Judul          :");
                     String judul = input.readLine();
                     listinter.get(index-1).setJudul(judul);
                     
                     System.out.print("Masukkan Penyanyi       :");
                     String penyanyi = input.readLine();
                     listinter.get(index-1).setPenyanyi(penyanyi);
                     
                     System.out.print("Masukkan Tahun Rilis    :");
                     int tahun_rilis = Integer.parseInt(input.readLine());
                     listinter.get(index-1).setTahun_rilis(tahun_rilis);
                    
//                     listinter.get(index-1).info(penyanyi);
                     System.out.println("=====================================");
                        
                }else{
                    System.out.println("Indeks Kosong");
                    
                }
              }
        }else if(pil == 2){
            if (listindo.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                for(int i = 0; i < listindo.size();i++){
                    System.out.println("\n\tData ke-" + (i+1));
                    System.out.println("======================================");
                    listindo.get(i).SEE();
                     }
                    System.out.println("======================================");
                    System.out.print("Masukkan indeks data Music yang diubah: ");
                    int index = Integer.parseInt(input.readLine());
                    
                if (index <= listindo.size() || index > 0){
                     System.out.println("======= Data Music Yang Baru ========");
                     System.out.print("Genre                   :");
                     String genre = input.readLine();
                     listindo.get(index-1).setGenre(genre);
                     
                     System.out.print("Masukkan Judul          :");
                     String judul = input.readLine();
                     listindo.get(index-1).setJudul(judul);
                     
                     System.out.print("Masukkan Penyanyi       :");
                     String penyanyi = input.readLine();
                     listindo.get(index-1).setPenyanyi(penyanyi);
                     
                     System.out.print("Masukkan Tahun Rilis    :");
                     int tahun_rilis = Integer.parseInt(input.readLine());
                     listindo.get(index-1).setTahun_rilis(tahun_rilis);
                    
//                     listindo.get(index-1).info(penyanyi);
                     System.out.println("=====================================");
                }
            }
        }else{
            System.out.println("Input Salah");
        }
    }
    
    public static void delete() throws IOException{
        SEE();
        System.out.println("Pilih Jenis Music: ");
        System.out.println("1. Internasional");
        System.out.println("2. Indonesia");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
        for(int i = 0; i < listinter.size();i++){
                System.out.println("\nData ke-" + (i+1));
                System.out.println("==================================");
                listinter.get(i).SEE();
                }
                System.out.println("==================================");
                System.out.print("Hapus pada data ke : ");
                int index = Integer.parseInt(input.readLine());
                if(index <= listinter.size() || index > 0) 
                {
                    listinter.remove(index-1);
                    System.out.println("Data Kamar dengan indeks " + index + " berhasil dihapus:");
                }
                else
                {
                    System.out.println("Indeks tidak ditemukan!");
                }
        }else if(pil == 2){
            if (listindo.isEmpty()) {
                System.out.println("\nData Kosong!");
            } else {
            for(int i = 0; i < listindo.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    System.out.println("==================================");
                    listindo.get(i).SEE();
                    }
                    System.out.println("==================================");
                    System.out.print("Hapus pada data ke : ");
                    int index = Integer.parseInt(input.readLine());
                    if(index <= listindo.size() || index > 0) 
                    {
                        listindo.remove(index-1);
                        System.out.println("Data Kamar dengan indeks " + index + " berhasil dihapus:");
                    }
                    else
                    {
                        System.out.println("Indeks tidak ditemukan!");
                    }
                }
        }else{
            System.out.println("Input Salah");
        }
}
    
    public static int search(String judul, int pil) {
        if(pil == 1){
            for (int i = 0; i < listinter.size(); i++) {
               if (listinter.get(i).getJudul().equals(judul)) {
                  return i;
               }
            }
        }else if(pil == 2){
            for (int i = 0; i < listindo.size(); i++) {
               if (listindo.get(i).getJudul().equals(judul)) {
                  return i;
               }
            }
        }
        return -1;
     }
    
    public static void searchSong() throws IOException {
         SEE();
         
        System.out.println("Pilih Jenis Music: ");
        System.out.println("1. Internasional");
        System.out.println("2. Indonesia");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
        System.out.print("Masukkan judul lagu yang ingin dicari: ");
        String keyword = input.readLine();
        int index = search(keyword, 1);
        if (index == -1) {
            System.out.println("Lagu tidak ditemukan.");
        } else {
            System.out.println("Hasil pencarian:");
            System.out.println("\n============= LIHAT DATA MUSIC =============");
            if (listinter.isEmpty()){
                System.out.println("\ndata kosong!");
            }else{
                    listinter.get(index).SEE();
                }
                System.out.println("==========================================");
            }
        }
        else if(pil == 2){
        System.out.print("Masukkan nama lagu yang ingin dicari: ");
        String keyword = input.readLine();
        int index = search(keyword, 2);
        if (index == -1) {
            System.out.println("Lagu tidak ditemukan.");
        } else {
            System.out.println("Hasil pencarian:");
            System.out.println("\n============= LIHAT DATA MUSIC =============");
            if (listinter.isEmpty()){
                System.out.println("\ndata kosong!");
            }else{
                    listinter.get(index).SEE();
                }
                System.out.println("==========================================");
            }
        }
    }
    
     public static void PlayMusik()throws IOException{
          SEE();
         
        System.out.println("Pilih Jenis Music: ");
        System.out.println("1. Internasional");
        System.out.println("2. Indonesia");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
        System.out.println("=============================================");
        System.out.println("|                 Play Musik                 |");
        System.out.println("=============================================");
        System.out.println("Anda sedang Mendengarkan musik internasionaal");
        System.out.println("=============================================");
        }
        else if(pil == 2){
        System.out.println("=============================================");
        System.out.println("|                 Play Musik                  |");
        System.out.println("=============================================");
        System.out.println("Anda sedang Mendengarkan musik indonesia");
        System.out.println("=============================================");
     }
     }
    public static void main(String[] args) throws IOException  {
        Notif ntf = new Notif();
        boolean menu = true;
        while(menu == true){
            System.out.println("\n\t\tMENU AWAL");
            System.out.println("===================================================");
            System.out.println("1. Login");
            System.out.println("2. Pendengar");
            System.out.println("3. Exit");
            System.out.println("===================================================");
            System.out.print("| Masukkan pilihan (1~3): ");
            try {
                int pilihan = Integer.parseInt(input.readLine());
                switch (pilihan) {
                    case 1:
                        System.out.println("=============================================");
                        System.out.println("|              Input Login                  |");
                        System.out.println("=============================================");
                        System.out.print("| Masukkan username: ");
                        String username = input.readLine();
                        System.out.print("| Masukkan password: ");
                        int password = Integer.parseInt (input.readLine());
                        System.out.println("=============================================\n");
                        if (password == 12345 && username.equals("admin") ){
                            ntf.loginBenar();
                            froze();
                            System.out.println("\n\t\tPROGRAM MUSIC");
                            System.out.println("===================================================");
                            System.out.println("1. Masukan Data Music  ");
                            System.out.println("2. Melihat Data Music  ");
                            System.out.println("3. Mengubah Data Music ");
                            System.out.println("4. Menghapus Data Music");
                            System.out.println("5. Kembali ke Menu Utama");
                            System.out.println("6. Exit");
                            System.out.println("==================================================");
                            System.out.print("Masukkan Pilihan: ");
                            int pilih = Integer.parseInt(input.readLine());
                            switch(pilih){
                                case 1:
                                    insert();
                                    froze();
                                    break;
                                case 2:
                                    display();
                                    froze();
                                    break;
                                case 3:
                                    update();
                                    froze();
                                    break;
                                case 4:
                                    delete();
                                    froze();
                                    break;
                                case 5:
                                    froze();
                                    break;
                                case 6:
                                    System.out.println(" \n           PROGRAM SELESAI       ");
                                    System.exit(0);
                                default:
                                    System.out.println("Masukkan angka 1-6 saja!");
                                    froze();
                                    break;
                                }
                            }else{
                                ntf.loginSalah();
                            }
                            break;
                        case 2:
                            System.out.print("| Masukkan nama: ");
                            String nama = input.readLine();
                            System.out.println("\n=============================================");
                            System.out.println("|                Halooo " + nama);
                            System.out.println("=============================================");
                            System.out.println("| Anda masuk sebagai pendengar               |");
                            System.out.println("| 1. Menu                                    |");
                            System.out.println("| 2. Exit                                    |");
                            System.out.println("=============================================");
                            System.out.print("| Masukkan pilihan (1-2): ");
                            pilihan = Integer.parseInt(input.readLine());
                            System.out.println("=============================================\n");
                            switch(pilihan){
                                case 1:
                                    System.out.println("=============================================");
                                    System.out.println("|                Semua Menu                  |");
                                    System.out.println("=============================================");
                                    System.out.println("| 1. Melihat Music                           |");
                                    System.out.println("| 2. Play Music                              |");
                                    System.out.println("| 3. Serching                                |");
                                    System.out.println("| 4. Exit                                    |");
                                    System.out.println("=============================================");
                                    System.out.print("Masukan pilihan (1-4) : ");
                                    pilihan = Integer.parseInt(input.readLine());
                                    System.out.println("=============================================");

                                    if (pilihan == 1) {
                                        display();
                                        froze();
                                        break;
                                    } 
                                    if (pilihan == 2) {
                                        PlayMusik();
                                        froze();
                                        break;
                                    }
                                    } 
                                    if (pilihan == 3) {
                                        
                                      searchSong();
                                        froze();
                                        break;
                                    } 
                                    if (pilihan == 4) {
                                       System.out.println(" \n           PROGRAM SELESAI       ");
                                       System.exit(0);
                                        break;
                                    } 
                                    else {
                                        System.out.println(" Pilihan 1-4 !!!");
                                        froze();
                                    }
                                    break;
                        case 3:
                            System.out.println(" \n           PROGRAM SELESAI       ");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Masukkan angka 1-5 saja!");
                            froze();
                            break;
                    }
                }
                catch(NumberFormatException e){
                    System.out.println(" Harus Angka!!!!");
                    froze();
                }
            }
        }
}


           


