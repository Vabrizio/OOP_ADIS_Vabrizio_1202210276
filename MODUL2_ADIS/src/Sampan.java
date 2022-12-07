public class Sampan extends TransportasiAir {
    protected int layar;

    public Sampan(int jumlahkursi, int biaya, int layar) {
        super(jumlahkursi, biaya);
        this.layar = layar;
    }

    public void infomasi(){
        System.out.println("sampan dengan jumlah kursi "+jumlahkursi+" dengan biaya"+biaya);

    }

    public void berlayar(){
        System.out.println("");
        
    }
    public void berlayar(int layar){
        System.out.println("");
        
    }
    public void berlabuh(int jangkar){
        System.out.println("");
    }
}
