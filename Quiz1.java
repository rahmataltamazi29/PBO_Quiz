import java.util.Scanner;

class Quiz1{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
	String nama;
	int tiperumah,pemakaian,bayar,totalharga,kembalian;
	int biaya=0;
	boolean loop=true;
	
	System.out.print("masukkan nama anda : ");
    nama = input.nextLine();
	System.out.print("Jumlah pemakaian meteran :");
	pemakaian = input.nextInt();
	
	while(loop){
	
	System.out.print("Tipe Rumah(31/32/33/34/35/40) : ");
	tiperumah = input.nextInt();
	
	switch(tiperumah){
            case 31 :
                biaya = 100000;
                System.out.println("Biaya : "+biaya);
                
                loop = false;
                break;
            case 32 :
                 biaya = 125000;
                 System.out.println("Biaya : "+biaya);
                 
                 loop= false;
                break;
                case 33 :
               biaya =  450000;
                 System.out.println("Biaya : "+biaya);
                   loop= false;
                break;
                case 34 :
               biaya =  480000;
                 System.out.println("Biaya : "+biaya);
                   loop= false;
                break;
                  case 35 :
               biaya =  500000;
                 System.out.println("Biaya : "+biaya);
                   loop= false;
                break;
                  case 40 :
               biaya =  550000;
                 System.out.println("Biaya : "+biaya);
                   loop= false;
                break;
                
                
            default :
                System.out.println();
                System.out.println("Tipe rumah anda tidak ada coba lagi");
                break;
        }
	}
	
    
	 
	totalharga =pemakaian*biaya;
	
	System.out.println("Total Harga    : "+totalharga);
	System.out.println();
	 System.out.println("masukkan Jumlah uang anda : ");
	 bayar = input.nextInt();
	 
	kembalian  =bayar-totalharga;
	
	System.out.println("==============================");
	System.out.println("Nama pelanggan : "+ nama);
	System.out.println("Total Harga    : "+totalharga);
	System.out.println("Bayar          : "+ bayar);
	System.out.println("Kembaliaan     : "+kembalian);
	
	
	}
}