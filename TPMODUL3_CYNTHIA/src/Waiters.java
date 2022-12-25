public class Waiters implements Runnable {
        private final int orderQty;
        private final int customerID;
        static int foodPrice = 25000;
    
        public Waiters(int customerID, int orderQty) {
            this.customerID = customerID;
            this.orderQty = orderQty;
        }
    
        @Override
        public void run() {
    
            while (true) {
                makeFood();
                try {
                    Thread.sleep(15000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    
        public void orderInfo() {
            System.out.println("==========================================================");
            System.out.println("Customer ID: " + this.customerID);
            System.out.println("Numbeer of food: " + this.orderQty);
            System.out.println("Total Price: " + this.orderQty * foodPrice);
            System.out.println("==========================================================");
        }
    
        public void makeFood() {
            synchronized(Restorant.getLock()) {
    
                System.out.println("Waiter: food is ready to deliver");
                Restorant restorant = new Restorant();
                restorant.setWaitingForPickup(false);
    
    
                if (Restorant.getfoodNumber() == this.orderQty + 1) {
                    orderInfo();
                    System.exit(0);
                }
                Restorant.getLock().notifyAll();
                System.out.println("Waiter: Tell the restorant to make another food\n");
    
            }
        }
    }

