package posttest5;

abstract class Novel {
    private String Judul;
    private String Penulis;
    private final String Penerbit = "Gramedia"; //asumsikan semua Penerbit Novel dari Gramedia
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

    public String getPenerbit() {
        return Penerbit;
    }

//    public void setPenerbit(String Penerbit) {
//        this.Penerbit = Penerbit;
//    }

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
