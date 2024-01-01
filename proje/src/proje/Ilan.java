package proje;

abstract class Ilan {
    protected String baslik;
    protected String aciklama;
    protected double fiyat;
    
    public Ilan(String baslik, String aciklama, double fiyat) {
        this.baslik = baslik;
        this.aciklama = aciklama;
        this.fiyat = fiyat;
    }
    public abstract void goster();
    
    //overload
    public void bilgileriGüncelle(String yeniBaslik) {
        this.baslik = yeniBaslik;
    }
    //overload
    public void bilgileriGüncelle(String yeniBaslik, String yeniAciklama) {
    this.baslik = yeniBaslik;
    this.aciklama = yeniAciklama;
    }
    //overload 
    public void bilgileriGüncelle(String yeniBaslik, String yeniAciklama,double yeniFiyat) {
    this.baslik = yeniBaslik;
    this.aciklama = yeniAciklama;
    this.fiyat = yeniFiyat;
    }
}