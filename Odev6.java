
package odev.pkg6;

import java.util.Scanner;

public class Odev6 
{
    public static void main(String[] args) 
    {
        String ogrenci;
        
        Scanner girdi =new Scanner(System.in);
        System.out.println("Sınıftaki Öğrenciler:\n Yunus,\n Emre,\n Metin,\n Furkan,\n Ahmet,\n Mehmet\n");
        System.out.println("Notu Öğrenmek İstediğiniz Öğrencinin Adını Giriniz..:");
        ogrenci =girdi.nextLine();
        ogrenciler(ogrenci);
        
        
    }
    static String ogrenciler(String ogrenci)
    {
    int Yunus=50,Emre=90,Metin=75,Furkan=80,Ahmet=77,Mehmet=40;    
        
    switch(ogrenci)
    {
        case "Yunus":
            System.out.println("Yunus'un Notu..:"+Yunus);
        break;
        
        case "Emre":
            System.out.println("Emre'nin Notu..:"+Emre);
        break;
        
        case "Metin":
            System.out.println("Metin'in Notu..:"+Metin);
        break;
        
        case "Furkan":
            System.out.println("Furkan'nın Notu..:"+Furkan);
        break;
        
        case "Ahmet":
            System.out.println("Ahmet'in Notu..:"+Ahmet);
        break;
        
        case "Mehmet":
            System.out.println("Mehmet'in Notu..:"+Mehmet);
        break;
        
        default: 
                System.out.println("Listedeli Öğrencilerden Birini Giriniz");
    }   
     return ogrenci;   
    }
}
