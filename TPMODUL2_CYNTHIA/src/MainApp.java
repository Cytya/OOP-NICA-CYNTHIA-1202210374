public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat = new Perangkat("Adata", 2, 1.80);
        perangkat.informasi();
        System.out.println("");

        Laptop laptop = new Laptop("Seagate", 8, 2.40, true);
        laptop.informasi();
        laptop.bukaGame("MiniCraft");
        laptop.kirimEmail("Cayupra@gmail.com");
        laptop.kirimEmail("Cprayuning@gmail.com", "lelegoreng@gmail.com");
        System.out.println("");

        Handphone handphone = new Handphone("sandisk", 3, 2.20, false);
        handphone.informasi();
        handphone.telfon(628239162);
        handphone.kirimSMS(628239162);
        handphone.kirimSMS(628332677, 6281980);


        }
}

