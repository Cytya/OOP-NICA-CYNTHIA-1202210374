public class Laptop extends Perangkat {
        protected boolean webcam;
    
        public Laptop(String drive, int ram, Double processor, boolean webcam){
            super(drive, ram, processor);
            this.webcam = webcam;
    
            
        }
        public void informasi(){
            if (webcam)  {
                System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + processor + " Ghz. Selain itu Laptop ini juga memiliki webcam");
            }
            else {
                System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + processor + " Ghz. Selain itu Laptop ini TIDAK memiliki webcam");
            }
                
        }
        public void bukaGame(String nama_game){
            System.out.println("Laptop berhasil membuka game " + nama_game);
        }
        public void kirimEmail(String email){
            System.out.println("Laptop berhasil mengirim Email ke " +email);
        }
        public void kirimEmail(String email1, String email2){
            System.out.println("Laptop berhasil mengirim Email ke " + email1 + " dan ke " + email2);
        }
    }

