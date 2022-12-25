public class Waiters implements Runnable {

    private final int orderQty;
    private final int customerID;
    static int foodPrice = 25000;

    public Waiters(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }






























    public void orderInfo() {
        System.out.println("======================================================");
        System.out.println("Customer ID: " + customerID);
        System.out.println("Number of Food: " + orderQty);
        System.out.println("Total Price: " + (orderQty*foodPrice));
        System.out.println("======================================================");
    }

    public void getFood() {
        synchronized(Restaurant.getLock()) {

            System.out.println("Waiter: Food is ready to deliver");
            Restaurant restaurant = new Restaurant();
            restaurant.setWaitingForPickup(false);

 