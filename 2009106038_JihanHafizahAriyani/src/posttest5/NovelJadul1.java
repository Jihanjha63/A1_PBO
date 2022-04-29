package posttest5;

public class NovelJadul1 extends Novel1 {
    public NovelJadul1(){}
    
    public NovelJadul1(String Judul, String Penulis, int Halaman, int Tahun){
        super(Judul, Penulis, Halaman, Tahun);
    }
    
     public void showNovel(String Judul){
        System.out.println(Judul+ " Novel Masa Jadul... ");
        showNovel();
    }

}
