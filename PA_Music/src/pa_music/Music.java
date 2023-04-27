package pa_music;
public abstract class Music {
    protected final String aplikasi ="spotify";
    private String Genre;
    private String penyanyi;
    
    public Music(String Genre, String penyanyi){
        this.Genre =Genre;
        this.penyanyi =penyanyi;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public String getPenyanyi() {
        return penyanyi;
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
    }
    public String getaplikasi() {
        return aplikasi;
    }

  
     //Overloading
    public void info(String Genre){
        System.out.println("Data Music dengan Nama " + Genre + "  berhasil ditambahkan!" );
    }
    
    //Overloading
//    public void info(String penyanyi){
//        System.out.println("Data Kamar dengan NoHP " + penyanyi + " berhasil diubah !");
//    }
    
    
    // abstract method  
    public abstract void SEE();
  
    }
