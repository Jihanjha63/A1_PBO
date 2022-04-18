package posttest4;

public class NovelKini extends Novel {
    public NovelKini(String Judul, String Penulis, String Penerbit, int Halaman, int Tahun){
        super(Judul, Penulis, Penerbit, Halaman, Tahun);
    }
    
    
    @Override
    public void showNovel(){
        System.out.println("Novel Masa Kini... ");
    }
}
