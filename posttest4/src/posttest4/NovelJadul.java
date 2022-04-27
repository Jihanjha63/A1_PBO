package posttest4;

public class NovelJadul extends Novel {
    public NovelJadul(){}
    
    public NovelJadul(String Judul, String Penulis, int Halaman, int Tahun){
        super(Judul, Penulis, Halaman, Tahun);
    }
    
     public void showNovel(String Judul){
        System.out.println(Judul+ " Novel Masa Jadul... ");
        showNovel();
    }

}
