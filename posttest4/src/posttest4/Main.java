package posttest4;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static int isJudulExist(ArrayList<Novel> novel, String Judul){
        for(int i=0; i<novel.size(); i++){
            if(novel.get(i).getJudul().equalsIgnoreCase(Judul)){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args){
        ArrayList<Novel> novel = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int menu, index;
        String Judul = null;
        
        do{
            System.out.println("NAMA : Jihan Hafizah Ariyani");
            System.out.println("NIM : 2009106038");
            System.out.println("KELAS : Informatika A 2020");
            System.out.println("");
            System.out.println("");
            System.out.println("== SISTEM MANAJEMEN BUKU NOVEL ==");
            System.out.println("[1] Create Buku Novel Jadul");
            System.out.println("[2] Read Buku Novel Jadul");
            System.out.println("[3] Update Buku Novel Jadu;");
            System.out.println("[4] Delete Buku Novel Jadul");
            System.out.println("[5] Create Buku Novel Kini");
            System.out.println("[6] Read Buku Novel Kini");
            System.out.println("[7] Update Buku Novel Kini");
            System.out.println("[8] Delete Buku Novel Kini");
            System.out.println("[9] Keluar");
            System.out.println("---------------------");
            do{
                System.out.print("Pilih menu> ");
                menu = Integer.parseInt(input.nextLine());
            }while(menu < 1 || menu > 9);
            
            switch(menu){
                case 1:{
                    NovelJadul terbaru = new NovelJadul();
                    
                    System.out.println("Input Data Baru Novel Jadul");
                    System.out.println("---------------------");
                    System.out.print("Masukkan Nama Novel : ");
                    terbaru.setJudul(input.nextLine());
                    
                    System.out.print("Masukkan Nama Penulis : ");
                    terbaru.setPenulis(input.nextLine());
                    
                    System.out.print("Masukkan Jumlah Halaman : ");
                    terbaru.setHalaman(Integer.parseInt(input.nextLine()));
                    
                    System.out.print("Masukkan Tahun Terbit : ");
                    terbaru.setTahun(Integer.parseInt(input.nextLine()));
                    
                    if(isJudulExist(novel, terbaru.getJudul()) == -1){
                        novel.add(terbaru);
                        System.out.println("Novel "+terbaru.getJudul()+" Berhasil ditambahkan!");
                    }else{
                        System.out.println("Novel "+terbaru.getJudul()+" Gagal ditambahkan!");
                    }
                    
                    break;
                }
                
                case 2: {
                    System.out.println("Lihat List Novel Jadul");
                    System.out.println("---------------------");
                    boolean flag = false;
                    if(novel.size() != 0){
                        for(int i=0; i<novel.size(); i++){
                            if(novel.get(i).getClass() == NovelJadul.class){
                                System.out.println("[Novel "+(i+1)+"]");                        
                                NovelJadul jadul = (NovelJadul) novel.get(i);
                                jadul.showNovel(Judul);
                                if(i < novel.size()-1){
                                    System.out.println("");
                                }
                                flag = true;
                            }
                        }
                        
                        if(!flag){
                            System.out.println("Tidak ada List Novel di Novel Jadul");
                        }
                    }else{
                        System.out.println("Tidak ada List Novel di Novel Jadul");
                    }
                    break;
                }
                
                case 3:{
                    System.out.println("Edit Data Novel Jadul");
                    System.out.println("---------------------");
                    if(novel.size() != 0){
                        System.out.print("Masukkan Novel yang ingin diedit : ");
                        Judul = input.nextLine();
                        
                        index = isJudulExist(novel, Judul);
                        if(index != -1){
                            NovelJadul terbaru = new NovelJadul();
                            System.out.print("Masukkan Nama Novel Terbaru : ");
                            terbaru.setJudul(input.nextLine());

                            System.out.print("Masukkan Nama Penulis Terbaru : ");
                            terbaru.setPenulis(input.nextLine());

                            System.out.print("Masukkan Jumlah Halaman Terbaru : ");
                            terbaru.setHalaman(Integer.parseInt(input.nextLine()));

                            System.out.print("Masukkan Tahun Terbit Terbaru : ");
                            terbaru.setTahun(Integer.parseInt(input.nextLine()));
                            
                            novel.set(index, terbaru);
                            System.out.println("Novel berhasil diedit!");
                        }else{
                            System.out.println("Novel "+Judul+" tidak ditemukan!");
                        }
                    }else{
                        System.out.println("Tidak ada List Novel di Novel Jadul");
                    }
                    break;
                }
                
                case 4:{
                    System.out.println("Hapus Data Novel Jadul");
                    System.out.println("---------------------");
                    if(novel.size() != 0){
                        System.out.print("Masukkan Novel yang ingin dihapus : ");
                        Judul = input.nextLine();
                        
                        index = isJudulExist(novel, Judul);
                        if(index != -1){
                            novel.remove(index);
                            System.out.println("Novel "+Judul+" berhasil dihapus!");
                        }else{
                            System.out.println("Novel "+Judul+" tidak ditemukan!");
                        }
                    }else{
                        System.out.println("Tidak ada List Novel di Novel Jadul");
                    }
                    break;
                }
                
                case 5:{
                    NovelKini baru = new NovelKini();
                    
                    System.out.println("Input Data Baru Novel Kini");
                    System.out.println("---------------------");
                    System.out.print("Masukkan Nama Novel : ");
                    baru.setJudul(input.nextLine());
                    
                    System.out.print("Masukkan Nama Penulis : ");
                    baru.setPenulis(input.nextLine());
                    
                    System.out.print("Masukkan Jumlah Halaman : ");
                    baru.setHalaman(Integer.parseInt(input.nextLine()));
                    
                    System.out.print("Masukkan Tahun Terbit : ");
                    baru.setTahun(Integer.parseInt(input.nextLine()));
                    
                    if(isJudulExist(novel, baru.getJudul()) == -1){
                        novel.add(baru);
                        System.out.println("Novel "+baru.getJudul()+" Berhasil ditambahkan!");
                    }else{
                        System.out.println("Novel "+baru.getJudul()+" Gagal ditambahkan!");
                    }
                    
                    break;
                }
                
                case 6:{
                    System.out.println("Lihat List Novel Kini");
                    System.out.println("---------------------");
                    boolean flag = false;
                    if(novel.size() != 0){
                        for(int i=0; i<novel.size(); i++){
                            if(novel.get(i).getClass() == NovelKini.class){
                                System.out.println("[Novel "+(i+1)+"]");
                                NovelKini kini = (NovelKini) novel.get(i);
                                kini.showNovel();
                                
                                if(i < novel.size()-1){
                                    System.out.println("");
                                }
                                
                                flag = true;
                            }
                        }
                        
                        if(!flag){
                            System.out.println("Tidak ada List Novel di Novel Kini");
                        }
                    }else{
                        System.out.println("Tidak ada List Novel di Novel Kini");
                    }
                    break;
                }
                
                case 7:{
                    System.out.println("Edit Data Novel Kini");
                    System.out.println("---------------------");
                    if(novel.size() != 0){
                        System.out.print("Masukkan Novel yang ingin diedit : ");
                        Judul = input.nextLine();
                        
                        index = isJudulExist(novel, Judul);
                        if(index != -1){
                            NovelKini baru = new NovelKini();
                            System.out.print("Masukkan Nama Novel Terbaru : ");
                            baru.setJudul(input.nextLine());

                            System.out.print("Masukkan Nama Penulis Terbaru : ");
                            baru.setPenulis(input.nextLine());

                            System.out.print("Masukkan Jumlah Halaman Terbaru : ");
                            baru.setHalaman(Integer.parseInt(input.nextLine()));

                            System.out.print("Masukkan Tahun Terbit Terbaru : ");
                            baru.setTahun(Integer.parseInt(input.nextLine()));
                            
                            novel.set(index, baru);
                            System.out.println("Novel berhasil diedit!");
                        }else{
                            System.out.println("Novel "+Judul+" tidak ditemukan!");
                        }
                    }else{
                        System.out.println("Tidak ada List Novel di Novel Kini");
                    }
                    break;
                }
                
                case 8:{
                    System.out.println("Hapus Data Novel Kini");
                    System.out.println("---------------------");
                    if(novel.size() != 0){
                        System.out.print("Masukkan Novel yang ingin dihapus : ");
                        Judul = input.nextLine();
                        
                        index = isJudulExist(novel, Judul);
                        if(index != -1){
                            novel.remove(index);
                            System.out.println("Novel "+Judul+" berhasil dihapus!");
                        }else{
                            System.out.println("Novel "+Judul+" tidak ditemukan!");
                        }
                    }else{
                        System.out.println("Tidak ada List Novel di Novel Kini");
                    }
                    break;
                }
                
                
                case 9:{
                    System.out.println("Keluar dari Program...");
                    System.out.println("...TERIMA KASIH !...");
                    break;
                }
            }
            
            if(menu != 9){
                System.out.println("");
            }
        }while(menu != 9);
    }
}