package posttest6;

public class NovelJadul extends Novel implements Information{
    public NovelJadul(){}
    
    public NovelJadul(String Judul, String Penulis, int Halaman, int Tahun){
        super(Judul, Penulis, Halaman, Tahun);
    }
    
    //Implements dari class interface
    @Override
    public void showNovel(String Judul){
        System.out.println(Judul+ " Novel Masa Jadul... ");
        showNovel();
    }

    @Override
    public void showInformation() {
        System.out.println("Novel yang termasuk dalam masa jadul dimulai sebelum zaman reformasi.\n");
    }
}