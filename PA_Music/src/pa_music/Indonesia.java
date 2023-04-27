
package pa_music;

public class Indonesia extends Music{
    private String judul;
    private int tahun_rilis;
 
    public Indonesia(String judul, int tahun_rilis, String Genre, String penyanyi) {
        super(Genre, penyanyi);
        this.judul =judul;
        this.tahun_rilis =tahun_rilis;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getTahun_rilis() {
        return tahun_rilis;
    }

    public void setTahun_rilis(int tahun_rilis) {
        this.tahun_rilis = tahun_rilis;
    }
    
    
    @Override
    public void SEE(){
//        super.SEE();
        System.out.println("Aplikasi        :"+getaplikasi());
        System.out.println("Genre           :" +getGenre());
        System.out.println("Judul           :"+getJudul());
        System.out.println("Tahun_rilis     :"+getTahun_rilis());
        System.out.println("Penyanyi        :"+getPenyanyi());
        
    }
}


    

