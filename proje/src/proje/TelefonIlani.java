package proje;

public class TelefonIlani extends Ilan{
    private String marka;
    private String model;
    private int hafiza;
    private int ram;
    private double boyut;
    
    public TelefonIlani(String baslik, String aciklama, double fiyat, String marka, String model,int hafiza,int ram,double boyut){
        super(baslik, aciklama, fiyat);
        this.marka = marka;
        this.model = model;
        this.hafiza = hafiza;
        this.ram = ram;
        this.boyut = boyut;
    }
    @Override
    public void goster(){
        System.out.println("***************************************************************");
        System.out.println("Baslik: "+baslik);
        System.out.println("Aciklama: "+aciklama);
        System.out.println("Fiyat: "+fiyat);
        System.out.println("Marka: "+marka);
        System.out.println("Model: "+model);
        System.out.println("Hafiza: "+hafiza+" GB");
        System.out.println("Ram: "+ram+" GB");
        System.out.println("Boyut: "+boyut+" Inch");
        System.out.println("Satin almak icin bu numarayi arayin: 05304546571");
        System.out.println("***************************************************************\n");
    }
    
}
