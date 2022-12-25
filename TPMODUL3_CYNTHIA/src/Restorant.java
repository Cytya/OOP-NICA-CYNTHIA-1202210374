class Restorant implements Runnable {

    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int restNumber = 1;

    @Override
    public void run() {
        while (true) {
            makeFood();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }

    public static int getfoodNumber() {
        return restNumber;
    }

    public void makeFood() {
        synchronized(Restorant.lock) {

            if (this.waitingForPickup) {
                try {
                    System.out.println("Restorant: Waiting for the Waiter to deliver the food");
                    Restorant.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

            waitingForPickup = true;
            System.out.println("Restorant:  Making food Number " + restNumber++);
            Restorant.lock.notifyAll();
            System.out.println("Restorant: Telling the waiter to get the food\n");
        }
    }

    public static Object getLock() {
        return lock;
    }
}
    
