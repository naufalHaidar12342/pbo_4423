import java.util.ArrayList;
import java.util.Scanner;

public class NilaiSiswa{
	//
	ArrayList<String> daftarNilai = new ArrayList<>();
	Scanner IsiNilai = new Scanner (System.in);
	
	//
	Double nilai;

	//
        public Double mintaNilai(){
		System.out.print("masukkan Nilai = ");
		Nilai=IsiNilai.nextLine();
		return nilai;

	}

	//
	void pushKeDaftarNilai(){
		daftarNilai.add(nilai);	

	}


	public boolean isEmpty(){
		if(daftarNilai.isEmpty()){
			return true;
		}else{
			return false;
		}		

	}


	//
	public int popNilai(){
		if(!isEmpty()){
			int popNilaiPilihan=daftarNilai.get(daftarNilai.size()-1);
			String anggotaTerhapus;
			anggotaTerhapus=daftarNilai.remove(daftarNilai.size()-1);
			System.out.println("anggota dari stack yang terhapus = "+anggotaTerhapus);
			return popNilaiPilihan;

		}else{
			System.out.println("Stack sudah kosong");
			return -1;

		}		

	}

	//
	int intipAnggotaPalingAtas(){
		return daftarNilai.get(size()-1);

	}



	//
	



}