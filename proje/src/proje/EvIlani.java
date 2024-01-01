package proje;

public class EvIlani extends Ilan{
    private String odaSayisi;
    private int m2;
    private String adres;
    
    public EvIlani(String baslik, String aciklama, double fiyat, String odaSayisi, int m2, String adres){
        super(baslik, aciklama, fiyat);
        this.odaSayisi = odaSayisi;
        this.m2 = m2;
        this.adres = adres;
    }
    
    @Override
    public void goster(){
        System.out.println("***************************************************************");
        System.out.println("Baslik: "+baslik);
        System.out.println("Aciklama: "+aciklama);
        System.out.println("Fiyat: "+fiyat);
        System.out.println("Oda Sayisi: "+odaSayisi);
        System.out.println("Metrekare: "+m2);
        System.out.println("Adres: "+adres);
        System.out.println("Satin almak icin bu numarayi arayin: 05304546571");
        System.out.println("***************************************************************\n");
    }
}
