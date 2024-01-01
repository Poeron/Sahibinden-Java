package proje;
import java.util.Scanner;
import java.util.InputMismatchException;

public class UyeGirisi {
    //Constructor
    
    public UyeGirisi(){
         calistir();
    }
    public void calistir(){
        Scanner sc = new Scanner(System.in);
        int secim;
        while (true) {
            try {
                System.out.println("Uye Girisi icin '1' yazin.\nKaydolmak icin '2' yazin.");
                secim = sc.nextInt();
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Hatali Giris. Lutfen 1 ya da 2 yazin.\n");
                sc.nextLine();
            }
        }
        switch (secim) {
            case 1:
                girisYap();
                break;
            case 2:
                uyelikOlustur uo = new uyelikOlustur();
                uo.uyeOlustur();
                System.out.println("Giris yapmak icin uyelik bilgilerinizi girin.");
                girisYap();
                break;
            default:
                break;
        } 
    }
     
    //Constructor
    //Üyeler ve üye oluşturma
    
    public static String[] kullanici = new String[16];
    public static String[] sifre = new String[16];
    public static int uyeSayisi = 3;
    
    public class uyelikOlustur{
        public void uyeOlustur(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Kullanici adi girin: ");
            String klavye = sc.nextLine();
            kullanici[uyeSayisi] = klavye;
            System.out.println("Sifrenizi girin: ");
            klavye = sc.nextLine();
            sifre[uyeSayisi] = klavye;
            uyeSayisi++;
            System.out.println("\nUyelik Basariyla Olusturuldu.\n");
        }
    }
    
    //Üyeler ve üye oluşturma
    //Üye Girişi
    
    public static void girisYap(){
        kullanici[0]="ronay";
        sifre[0]="asd";
        kullanici[1]="ahmet";
        sifre[1]="123";
        kullanici[2]="yusuf";
        sifre[2]="yusuf";
        
        Scanner sc = new Scanner(System.in);
        while (true) {            
            System.out.println("\nLutfen kullanici adinizi girin: ");
            String kc = sc.nextLine();
            System.out.println("Lutfen sifrenizi girin: ");
            String sf = sc.nextLine();
            if (kontrol(kc,sf)) {
                GirisEkrani ge = new GirisEkrani();
                break;
            }
        }

    }
    public static boolean kontrol(String kc,String sf){
        for (int i = 0; i < 10; i++) {
            if (kc.equals(kullanici[i]) && sf.equals(sifre[i])) {
                System.out.println("\nGiris basarili.");
                return true;
            }
        }
        System.out.println("Kullanici adi veya sifre hatali.");
        return false;
    }
    
    //Üye Girişi
}