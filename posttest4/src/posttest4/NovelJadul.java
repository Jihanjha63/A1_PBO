package posttest4;

public class NovelJadul extends Novel {
    public NovelJadul(String Judul, String Penulis, String Penerbit, int Halaman, int Tahun){
        super(Judul, Penulis, Penerbit, Halaman, Tahun);
    }
    
    @Override
     public void showNovel(String Judul){
        System.out.println(Judul+ " Novel Masa Jadul... ");
    }

}
