package posttest3;
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
        ArrayList<Novel> novel = new ArrayList<Novel>();
        Scanner input = new Scanner(System.in);
        int menu, index;
        String Judul;
        
        do{
            System.out.println("NAMA : Jihan Hafizah Ariyani");
            System.out.println("NIM : 2009106038");
            System.out.println("KELAS : Informatika A 2020");
            System.out.println("");
            System.out.println("");
            System.out.println("== SISTEM MANAJEMEN BUKU NOVEL ==");
            System.out.println("[1] Create Buku Novel");
            System.out.println("[2] Read Buku Novel");
            System.out.println("[3] Update Buku Novel");
            System.out.println("[4] Delete Buku Novel");
            System.out.println("[5] Keluar");
            System.out.println("---------------------");
            do{
                System.out.print("Pilih menu> ");
                menu = Integer.parseInt(input.nextLine());
            }while(menu < 1 || menu > 5);
            
            switch(menu){
                case 1:{
                    Novel baru = new Novel();
                    
                    System.out.println("Input Data Baru");
                    System.out.println("---------------------");
                    System.out.print("Masukkan Nama Novel : ");
                    baru.setJudul(input.nextLine());
                    
                    System.out.print("Masukkan Nama Penulis : ");
                    baru.setPenulis(input.nextLine());
                    
                    System.out.print("Masukkan Nama Penerbit : ");
                    baru.setPenerbit(input.nextLine());
                    
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
                
                case 2:{
                    System.out.println("Lihat List Novel");
                    System.out.println("---------------------");
                    if(novel.size() != 0){
                        for(int i=0; i<novel.size(); i++){
                            System.out.println("[Novel "+(i+1)+"]");
                            novel.get(i).showNovel();
                            
                            if(i < novel.size()-1){
                                System.out.println("");
                            }
                        }
                    }else{
                        System.out.println("Tidak ada List Novel");
                    }
                    break;
                }
                
                case 3:{
                    System.out.println("Edit Data Novel");
                    System.out.println("---------------------");
                    if(novel.size() != 0){
                        System.out.print("Masukkan Novel yang ingin diedit : ");
                        Judul = input.nextLine();
                        
                        index = isJudulExist(novel, Judul);
                        if(index != -1){
                            Novel baru = new Novel();
                            System.out.print("Masukkan Nama Novel Terbaru : ");
                            baru.setJudul(input.nextLine());

                            System.out.print("Masukkan Nama Penulis Terbaru : ");
                            baru.setPenulis(input.nextLine());

                            System.out.print("Masukkan Nama Penerbit Terbaru : ");
                            baru.setPenerbit(input.nextLine());

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
                        System.out.println("Tidak ada List Novel");
                    }
                    break;
                }
                
                case 4:{
                    System.out.println("Hapus Data Novel");
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
                        System.out.println("Tidak ada List Novel");
                    }
                    break;
                }
                
                
                case 5:{
                    System.out.println("Keluar dari Program...");
                    System.out.println("...TERIMA KASIH !...");
                    break;
                }
            }
            
            if(menu != 5){
                System.out.println("");
            }
        }while(menu != 5);
    }
}