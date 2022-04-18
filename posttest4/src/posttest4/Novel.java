package posttest4;

public class Novel {
    private String Judul;
    private String Penulis;
    private String Penerbit;
    private int Halaman;
    private int Tahun;
    
    public Novel(){
    }

    public Novel(String Judul, String Penulis, String Penerbit, int Halaman, int Tahun) {
        this.Judul = Judul;
        this.Penulis = Penulis;
        this.Penerbit = Penerbit;
        this.Halaman = Halaman;
        this.Tahun = Tahun;
    }
    
    public void showNovel() {
        System.out.println("Novel Masa Kini... ");
        System.out.println("Nama Novel : "+Judul);
        System.out.println("Penulis    : "+Penulis);
        System.out.println("Penerbit   : "+Penerbit);
        System.out.println("Tahun      : "+Tahun);
        System.out.println("Halaman    : "+Halaman);
    }
    
    public void showNovel(String Judul){
        System.out.println(Judul+" Novel Masa Jadul... ");
        System.out.println("Nama Novel : "+Judul);
        System.out.println("Penulis    : "+Penulis);
        System.out.println("Penerbit   : "+Penerbit);
        System.out.println("Tahun      : "+Tahun);
        System.out.println("Halaman    : "+Halaman);
    }
    
   
    public String getJudul() {
        return Judul;
    }

    public void setJudul(String Judul) {
        this.Judul = Judul;
    }

    public String getPenulis() {
        return Penulis;
    }

    public void setPenulis(String Penulis) {
        this.Penulis = Penulis;
    }

    public String getPenerbit() {
        return Penerbit;
    }

    public void setPenerbit(String Penerbit) {
        this.Penerbit = Penerbit;
    }

    public int getHalaman() {
        return Halaman;
    }

    public void setHalaman(int Halaman) {
        this.Halaman = Halaman;
    }

    public int getTahun() {
        return Tahun;
    }

    public void setTahun(int Tahun) {
        this.Tahun = Tahun;
    }
    
    
}
