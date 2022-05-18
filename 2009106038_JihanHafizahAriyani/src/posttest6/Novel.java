package posttest6;

abstract class Novel {
    private String Judul;
    private String Penulis;
    static final String Penerbit = "Gramedia"; //Kita asumsikan semua Penerbit Novel dari Gramedia dan static
    private int Halaman;
    private int Tahun;
    
    public Novel(){}

    public Novel(String Judul, String Penulis, int Halaman, int Tahun) {
        this.Judul = Judul;
        this.Penulis = Penulis;
        this.Halaman = Halaman;
        this.Tahun = Tahun;
    }
    
    public final void showNovel() {
        System.out.println("Novel Masa Kini... ");
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