package gameTahminFilm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmIsimleri {
	/*
	 * 1. Bir tane film isim listesi olusturun
	 * 2. Kullanicadan liste uzunlugunda bir sayi isteyip, o siradaki filmi cagirin..
	 * 3. filmin ismindeki harfleri "-" olacak sekilde ceviririp kullaniciya gösterin.
	 * 4. Kullanicidan bir harf tahmin etmesini isteyin
	 * 5. Bu harfin isimde olup olmadigini kontrol edin. Varsa göster, yoksa sayaci düs.
	 *
	 *
	 * 6. Girilen harf dogruysa ismin tamaminda bu harfi gösterin.
	 * 7. Toplam kac yanlis harf tahmin edildigini gösterin ve sinir asildiysa kaybettin yazdirin.
	 * 8. Eger hepsi dogru tahmin edildiyse kazandin yazdirin.
	 */
	
	static List<String> filmListe=new ArrayList<>(Arrays.asList("Batman" , "Spiderman" , "Superman", "Yesil Yol" , "Babam ve Oglum", 
																"Hababam Sinifi", "Forrest Gump", "Truman Show", "Esaretin Bedeli", "Joker", 
																"Dunkirk","James Bond" ,"Yildizlararasi", "Fight Club" ,"Matrix", "Iyi Kotu Cirkin",
																"Yuzuklerin Efendisi","Star Wars", "Kuzularin Sessizligi","Terminator"));
	int filmNumara=0;
	static int puan=100;
	static int hak=10;
	
	
	public FilmIsimleri() {
		
	}
	
	public static int hangiNumara(String isim) {
		
		int filmNumarasi=0;
		int arr[]=new int[isim.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=isim.charAt(i);
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			filmNumarasi+=arr[i];
			filmNumarasi%=20;
		}
		return filmNumarasi;
	}
	
	public static String filmIsmi(int filmNumarasi) {
		
		String filmIsmi=filmListe.get(filmNumarasi);
		
		return filmIsmi;
		
	}
	
	public static String filmSifreli(int filmNumara) {
		
		String filmSifreli=filmListe.get(filmNumara).substring(0,2)+filmListe.get(filmNumara).substring(2).replaceAll("\\S", "*");
		
		return filmSifreli;
		
	}
	
	public static <fSifreli> void oyun(int filmNumara) {
		
		FilmIsimleri kullanici=new FilmIsimleri();
		String filmIsim=filmListe.get(filmNumara);
		
		
		Scanner scan=new Scanner(System.in);
		int puan=0;
		
		String filmSifreli=filmIsim.substring(0,2)+filmIsim.substring(2).replaceAll("\\S", "*");
		
			while (kullanici.puan>0&&kullanici.hak>0) {
		
		System.out.println("Toplam puaniniz : " + (kullanici.puan));
		System.out.print("Tahminize kac puan yatirmak istersiniz : " );
		puan=scan.nextInt();
		
			
		while(puan>kullanici.puan) {System.out.println("Lutfen su anki puaninizdan daha dusuk bir puan giriniz ---> " + (kullanici.puan) +" <---");
		System.out.print("Girmek istediginiz puan : ");
		puan=scan.nextInt();
		
		}
		
		System.out.print("Lutfen bir harf giriniz : ");
		
		String harf=scan.next();
		
		if (harf.length()>1) { System.out.print("Lutfen bir harften cok giris yapmayiniz!!! \nBir harf giriniz : ");
		harf=scan.next();}
		else {
		
		
		if (filmIsim.toLowerCase().contains(harf.toLowerCase())) {for (int i = 2; i < filmIsim.length(); i++) {
			
			if (filmIsim.toLowerCase().substring(i, i+1).equals(harf.toLowerCase())) {
				filmSifreli=filmSifreli.substring(0,i)+harf.toLowerCase().charAt(0)+filmSifreli.substring(i+1);
			}
			
		}
		
		kullanici.puan+=puan;
		kullanici.hak--;
		System.out.println("Toplam puaniniz : " + kullanici.puan + " kalan hakkiniz : " + kullanici.hak);
		System.out.println("Tahmin etmeniz gereken film : " + filmSifreli);
		
		if(filmIsim.toLowerCase().equals(filmSifreli.toLowerCase())) {
			System.out.println("Oyunu kazandiniz TEBRIKLER!!!");
			System.out.println("Toplam puaniniz : " + kullanici.puan);
			break;
			
		} } else { 
		
		kullanici.puan-=puan;
		kullanici.hak--;
		
		System.out.println("Girilen harf Film ismi icinde bulunmamaktadir");
		System.out.println("Toplam puaniniz :" + kullanici.puan + " toplam kalan hakkiniz : " + kullanici.hak);
		System.out.println("Tahmin etmeniz gereken film : " + filmSifreli);

		}
		
				}
		
	
					
				}
			
			if (kullanici.puan==0||kullanici.hak==0) { System.out.println("Oyunu kaybettiniz");
			System.out.println("Tahmin etmeniz gereken film ismi :" + filmIsim);
				
			}
			
			
		}
			}
			
		
			
	

	
