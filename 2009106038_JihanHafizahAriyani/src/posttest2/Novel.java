package posttest2;

public class Novel {
    public String Judul;
    public String Penulis;
    public String Penerbit;
    public int Halaman;
    public int Tahun;
    
    public Novel(){
    }

    public Novel(String Judul, String Penulis, String Penerbit, int Halaman, int Tahun) {
        this.Judul = Judul;
        this.Penulis = Penulis;
        this.Penerbit = Penerbit;
        this.Halaman = Halaman;
        this.Tahun = Tahun;
    }
    
    public void showNovel(){
        System.out.println("Nama Novel : "+Judul);
        System.out.println("Penulis    : "+Penulis);
        System.out.println("Penerbit   : "+Penerbit);
        System.out.println("Tahun      : "+Tahun);
        System.out.println("Halaman    : "+Halaman);
    }
}
