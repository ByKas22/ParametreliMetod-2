/* Daha önceden notları belirli olan öğrencileri parametreli metod kullanarak notu öğrenmek istediğimiz öğrencinin ismini
girdiğimizde ekranda o öğrencinin notunu ekrana yazdıran program */

package odev.pkg6;
import java.util.Scanner; //scanner sınıfını kütüphaneye ekledik.
public class Odev6 
{
    public static void main(String[] args) 
    {
        String öğrenci; //String türünde değişken oluşturduk.
        Scanner girdi =new Scanner(System.in); //değer girmemizi sağlayan scanner sınıfını çağırdık.
System.out.println("Sınıftaki Öğrenciler:\n Yunus,\n Emre,\n Metin,\n Furkan,\n Ahmet,\n    Mehmet\n"); ekranda görmemizi sağladık.
        	System.out.println("Notu Öğrenmek İstediğiniz Öğrencinin Adını Giriniz..:"); ekranda metni.
        ogrenci =girdi.nextLine(); //klavyeden değer girdik.
        ogrenciler(ogrenci); //öğrenciler metodunu çağırdık.
    }
    static String ogrenciler(String ogrenci) //öğrenciler adında metod oluşturduk.(parametreli)
    {
    int Yunus=50,Emre=90,Metin=75,Furkan=80,Ahmet=77,Mehmet=40;  //değişkenleri oluşturduk.  
        
    switch(ogrenci) //koşul ifadesi oluşturduk.
    {
        case "Yunus": //eğer ki Yunus yazar ise;
            System.out.println("Yunus'un Notu..:"+Yunus); //ekranda yazacak olan metin.
        break; //işlemi bitirdik.
        case "Emre": //eğer ki Yunus yazar ise;
            System.out.println("Emre'nin Notu..:"+Emre); //ekranda yazacak olan metin.
        break; //işlemi bitirdik.
        case "Metin": //eğer ki Metin yazar ise;
            System.out.println("Metin'in Notu..:"+Metin); //ekranda yazacak olan metin.
        break; //işlemi bitirdik.
        
        case "Furkan": //eğer ki Furkan yazar ise;
            System.out.println("Furkan'nın Notu..:"+Furkan); //ekranda yazacak olan metin.
        break; //işlemi bitirdik.
        case "Ahmet": //eğer ki Ahmet yazar ise;
            System.out.println("Ahmet'in Notu..:"+Ahmet); //ekranda yazacak olan metin.
        break; //işlemi bitirdik.
        
        case "Mehmet": //eğer ki Mehmet yazar ise;
            System.out.println("Mehmet'in Notu..:"+Mehmet); //ekranda yazacak olan metin.
        break; //işlemi bitirdik.
        
        default: //eğer ki hiçbir koşul sağlanmaz ise;  
                System.out.println("Listedeli Öğrencilerden Birini Giriniz"); //ekranda yazar.
    }   
     return ogrenci; //geri değer döndürdük.  
    }
}
