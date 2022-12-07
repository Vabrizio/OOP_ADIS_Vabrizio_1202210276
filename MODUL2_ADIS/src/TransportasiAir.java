public class TransportasiAir {
    protected int jumlahkursi;
    protected int biaya;
    public TransportasiAir(int jumlahkursi , int biaya) {
        this.jumlahkursi;
        this.biaya;
    }
    public void informasi(){
        System.out.println("Transportasi air tidak diketahui berlayar dengan jumlah kursi "+jumlahkursi+" dan biaya RP."+biaya);
    }
    public void berlayar(){
        System.out.println("Berlayar dengan kecepatan tidak diketahui");
    }
    public void berlabuh(){
        System.out.println("transportasi ini sedang berlabuh");
    }
}
