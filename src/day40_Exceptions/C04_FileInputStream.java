package day40_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_FileInputStream {

	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws FileNotFoundException {
		// javada bir dosyaya ulasmak istedigimizde FileInputStream class'indan yardim aliriz
		
		@SuppressWarnings("resource")
		FileInputStream fis=new FileInputStream("src\\day40\\yazi.txt");
		
		// java bu kodda olasi bir problem ongoruyor ve bu probleme karsi ne yapmasi gerektigini bize soruyor
		// yani alti cizilen her kod CTE degildir. bunun icin iki durum soz konusu
		// 1-try catch kullanarak bu problemi HANDLE edip java'nin yoluna devam etmesini saglayabiliriz
		// 2-eger dosya okunamiyorsa kod calismasin istiyorsak olayin farkinda oldugumuzu ve sorumlulugun bzde oldugunu javaya soyleyebiliriz

		System.out.println("gorev tamamlandi");
	}

}
