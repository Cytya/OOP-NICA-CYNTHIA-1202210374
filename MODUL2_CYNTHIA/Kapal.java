public class Kapal {
    protected String mesin;

    public Kapal (int JumlahKursi, int biaya, String mesin) {
        this.mesin = mesin;
        this.JumlahKursi=JumlahKursi;
        this.biaya = biaya;
    }
    @Override
    public void detail() {
        System.outPrintln("Transportasi Air Jenis Kapal dengan kursi Berjumlah", + JumlahKursi + "dengan biaya Sebesar rp." + biaya + ) ;
        System.outPrintln("Transportasi Air Jenis Kapal Berlayar menggunakan ", +)
    }
    
}   
