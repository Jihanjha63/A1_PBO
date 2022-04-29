package posttest5;

public class NovelKini extends Novel {
    public NovelKini(){}
    
    public NovelKini(String Judul, String Penulis, int Halaman, int Tahun){
        super(Judul, Penulis, Halaman, Tahun);
    }
    
    public void showNovel(String Judul){
        System.out.println(Judul+" Novel Masa Kini... ");
        showNovel();
    }
}
