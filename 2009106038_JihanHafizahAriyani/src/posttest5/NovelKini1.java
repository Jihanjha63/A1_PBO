package posttest5;

public class NovelKini1 extends Novel1 {
    public NovelKini1(){}
    
    public NovelKini1(String Judul, String Penulis, int Halaman, int Tahun){
        super(Judul, Penulis, Halaman, Tahun);
    }
    
    public void showNovel(String Judul){
        System.out.println(Judul+" Novel Masa Kini... ");
        showNovel();
    }
}
