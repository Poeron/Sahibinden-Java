package proje;

public class ArabaIlani extends Ilan {
    private String marka;
    private String model;
    private int yil;
    private String yakitTipi;
    private String kasaTipi;
    private String vitesTuru;
    private String durum;
    private String renk;
    private int motorGucu;
    private int kilometre;
    

    public ArabaIlani(String baslik, String aciklama, double fiyat, String marka, String model, int yil,
			String yakitTipi, String kasaTipi, String vitesTuru, String durum, String renk, int motorGucu,
			int kilometre) {
		super(baslik, aciklama, fiyat);
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.yakitTipi = yakitTipi;
		this.kasaTipi = kasaTipi;
		this.vitesTuru = vitesTuru;
		this.durum = durum;
		this.renk = renk;
		this.motorGucu = motorGucu;
		this.kilometre = kilometre;
	}

	@Override
    public void goster(){
		
		
        System.out.println("***************************************************************");
        System.out.println("Baslik: "+baslik);
        System.out.println("Aciklama: "+aciklama);
        System.out.println("Fiyat: "+fiyat);
        System.out.println("Marka: "+marka);
        System.out.println("Model: "+model);
        System.out.println("Motor Gucu: "+motorGucu);
        System.out.println("Yil: "+yil);
        System.out.println("Kilometre: "+kilometre);
        System.out.println("Yakit Tipi: "+yakitTipi);
        System.out.println("Kasa Tipi: "+kasaTipi);
        System.out.println("Vites Turu: "+vitesTuru);
        System.out.println("Durum: "+durum);
        System.out.println("Renk: "+renk);
        System.out.println("Satin almak icin bu numarayi arayin: 05304546571");
        System.out.println("***************************************************************\n");
    }
}
