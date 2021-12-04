package gameTahminFilm;

import java.util.Scanner;

public class FilmisimleriRunner {
	
	static {
		System.out.println("******* Oyuna Hosgeldiniz*******");
		System.out.println("-------->  Basarilar <----------");
		System.out.println("");
	}

	public static void main(String[] args) {
	
		System.out.print("Lutfen kullanici adinizi giriniz : ");
		Scanner scan=new Scanner(System.in);
		String isim=scan.nextLine();
		
		if (isim.contains(" ")) { System.out.println("Lutfen kullanici adiniz icinde bosluk olmasin!!!");
		System.out.println(" ");
		System.out.println("Lutfen kullanici adinizi tekrar giriniz : ");
		isim=scan.nextLine();
			
		} 
		
		System.out.println("");
		System.out.println("!!!!      Oyun Basliyor       !!!!");
		System.out.println("");
		
		FilmIsimleri kullanici=new FilmIsimleri();
		kullanici.filmNumara=FilmIsimleri.hangiNumara(isim);
		System.out.println("Tahmin etmeniz gereken Filmin Numarasi : --> " + kullanici.filmNumara +" <--");
		
		String filmSifreli=FilmIsimleri.filmSifreli(kullanici.filmNumara);
		System.out.println("");
		System.out.println("------Filmin sadece ilk iki harfi aciktir------");
		System.out.println("");
		System.out.println("Tahmin edeceginiz Film -----> "+filmSifreli);
		
		
		
		
		
	}

	

}
