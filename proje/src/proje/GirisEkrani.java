package proje;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GirisEkrani {
    public GirisEkrani(){
        calistir();
    }
    public void calistir(){
        System.out.println("\n\nGiris Ekranina Hosgeldiniz!\n");
        Scanner scan = new Scanner(System.in);
        int secim;
        while (true) {            
            while (true) {
                try {
                    System.out.println("\nAraba ilanlari icin ('1')"
                    + "\nEv ilanlari icin ('2')"
                    + "\nTelefon ilanlari icin ('3')"
                    + "\n\nRakamlarindan birini giriniz.");
                    secim = scan.nextInt();
                    break;
                }
                catch (InputMismatchException e) {
                    System.out.println("\nHatali Giris. Lutfen 1, 2 veya 3 yazin.");
                    scan.nextLine();
                }
            }
            switch (secim) {
                case 1:
                    a1.goster();
                    a2.goster();
                    a3.goster();
                    a4.goster();
                    a5.goster();
                    break;
                case 2:
                    e1.goster();
                    e2.goster();
                    e3.goster();
                    break;
                case 3:
                    t1.goster();
                    t2.goster();
                    t3.goster();
                    t4.goster();
                    t5.goster();
                    break;
                default:
                    break;
        }
        System.out.println("Baska ilanlara bakmak ister misin? (e)");
        Scanner scan2 = new Scanner(System.in);
        String a = scan2.nextLine();
            if (!a.equals("e")&&!a.equals("E")){
                break;
            }
        }
    }
    
    ArabaIlani a1=new ArabaIlani("2015 PASSAT B8 R-LINE 1.6 TDI DSG"
                    , "2015 model passat b8 r-line 98.000 KM"
                    , 550000, "Volkswagen"
                    ,"Passat"
                    ,2015
                    ,"Dizel"
                    ,"Sedan"
                    ,"Otomatik"
                    ,"Ikinci el"
                    ,"Mavi"
                    ,120
                    ,140000);

    ArabaIlani a2=new ArabaIlani("MASERATI QUATTROPORTE 4.7S"
                    , "2009 Model Hatasiz Boyasiz Garaj Arabasi 67.000 KM"
                    , 42500000
                    , "Maserati"
                    , "Quattroporte"
                    , 2009
                    , "Benzin"
                    , "Sedan"
                    , "Yari otomatik"
                    , "Ikinci el"
                    , "Gri"
                    , 430
                    , 74000);

    ArabaIlani a3=new ArabaIlani("BMW 7 Serisi Sifir KM"	
                    , "2022 Model M Sport Exellance Package"
                    , 9400000
                    , "BMW"
                    , "7 Serisi"
                    , 2014
                    , "Benzin"
                    , "Sedan"
                    , "Yari Otomatik"
                    , "Sifir"
                    , "Fume"
                    , 610
                    , 0);

    ArabaIlani a4=new ArabaIlani("Ilk sahibinden servis bakimli Opel Astra"
                    , "Servis bakimli temiz kullanilmis"
                    , 460000
                    , "Opel"
                    , "Astra"
                    , 2014
                    , "Dizel"
                    , "Sedan"
                    , "Manuel"
                    , "Ikinci el"
                    , "Beyaz"
                    , 136
                    , 167000);

    ArabaIlani a5=new ArabaIlani("G63 AMG FISRT EDITION"
                    , "Bayii cikisli"
                    , 8000000
                    , "Mercedes"
                    , "G63 AMG"
                    , 2021
                    , "Benzin"
                    , "SUV"
                    , "Yari Otomatik"
                    , "Sifir"	
                    , "Siyah"
                    , 585
                    , 0);

    TelefonIlani t1=new TelefonIlani("Sifir Iphone Yurt Disi Kayitli"
                    , ""
                    , 35000
                    , "Apple"
                    , "IPHONE 13 PRO MAX"
                    , 512
                    , 6
                    , 6.1);

    TelefonIlani t2=new TelefonIlani("Sifir Iphone Faturali Garantili "
                    , "         "
                    , 65000
                    , "Apple"
                    , "IPHONE 14 PRO MAX"
                    , 512
                    , 8
                    , 6.7);

    TelefonIlani t3=new TelefonIlani("Temiz kullanilmis Xiaomi"
                    , "         "
                    , 3200
                    , "XIAOMI"
                    , "REDMI NOTE 8 PRO"
                    , 256
                    , 8
                    , 6.3);

    TelefonIlani t4=new TelefonIlani("Sifir Samsung Garantili"
                    , "ITHALATcI GARANTILI"
                    , 32000
                    , "SAMSUNG"
                    , "GALAXY S22 ULTRA"
                    , 512
                    , 12
                    , 6.8);

    TelefonIlani t5=new TelefonIlani("Temiz Huawei"
                    , "P20 LITE SORUNSUZ TEMIZ KULLANILMIs"
                    , 2000
                    , "HUAWEI"
                    , "P20 LITE"
                    , 128
                    , 4
                    , 5.3);
    EvIlani e1=new EvIlani("MERKEZI KONUMDA HASTANE KARSISI"
                    , "Yeni daire temiz kullanilmis"
                    , 800000
                    , "3+1"
                    , 160
                    , "Selvitepe mah. 1022 sk. no:44 ");

    EvIlani e2=new EvIlani("TEKNOLOJI FAKULTESI KARSISI"
                    , "Okula yUrUme mesafesinde AVM KARSISI"
                    , 3500
                    , "1+1"
                    , 70
                    , "Selvitepe mahallesi no:32");

    EvIlani e3=new EvIlani("BORNOVA EMLAK SIFIR DAIRE"
                    , "Metro istasyonu yakini yeni daire"
                    , 2500000
                    , "3+1"
                    , 0
                    , "AtatUrk mah. no:10");
}