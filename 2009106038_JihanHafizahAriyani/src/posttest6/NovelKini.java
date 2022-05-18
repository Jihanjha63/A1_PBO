package posttest6;

public class NovelKini extends Novel implements Information{
    public NovelKini(){}
    
    public NovelKini(String Judul, String Penulis, int Halaman, int Tahun){
        super(Judul, Penulis, Halaman, Tahun);
    }
    
    //Implements dari class interface
    @Override
    public void showNovel(String Judul){
        System.out.println(Judul+" Novel Masa Kini... ");
        showNovel();
    }

    @Override
    public void showInformation() {
        System.out.println("Novel yang termasuk dalam masa kini dimulai saat zaman reformasi.\n");
    }
}
