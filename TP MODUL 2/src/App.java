public class App {
    public static void main(String[] args) throws Exception {
        //class perangkat
       Perangkat  spec1 = new Perangkat("ASUS", 16, 5.8f);
        spec1.informasi();
        System.out.println("");

        //class Laptop
        Laptop laptop1 = new Laptop("ROG", 8, 2.9f, false);
        laptop1.informasi();
        laptop1.bukaGame("CSGO");
        laptop1.kirimEmail("vabrizio.moreno@gmail.com");
        laptop1.kirimEmail("zio.vanviegen@gmail.com", "viegenttv@gmail.com");
        System.out.println("");
        
        //class Handphone
        Handphone handphone1 = new Handphone("iphone", 6, 2.0f, true);
        handphone1.informasi();
        handphone1.telfon(62811310);
        handphone1.kirimSMS(62811103);
        handphone1.kirimSMS(6281772, 628119733);

    }
}
