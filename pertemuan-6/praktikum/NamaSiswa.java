import java.util.ArrayList;
import java.util.Scanner;

public class NamaSiswa{
	//
	ArrayList<String> daftarNama = new ArrayList<>();
	Scanner IsiNama = new Scanner (System.in);
	
	//
	String nama;

	//
        public String mintaNama(){
		System.out.print("masukkan nama = ");
		nama=IsiNama.nextLine();
		return nama;

	}

	//
	void pushKeDaftarNama(){
		daftarNama.add(nama);	

	}


	public boolean isEmpty(){
		if(daftarNama.isEmpty()){
			return true;
		}else{
			return false;
		}		

	}


	//
	public int popNama(){
		if(!isEmpty()){
			int popNamaPilihan=daftarNama.get(daftarNama.size()-1);
			String anggotaTerhapus;
			anggotaTerhapus=daftarNama.remove(daftarNama.size()-1);
			System.out.println("anggota dari stack yang terhapus = "+anggotaTerhapus);
			return popNamaPilihan;

		}else{
			System.out.println("Stack sudah kosong");

		}		

	}

	//
	int intipAnggotaPalingAtas(){
		return daftarNama.get(size()-1);

	}



	//
	



}