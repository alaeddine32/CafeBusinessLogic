import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal() {
        int sum = 0;

        for (int i=0; i<=10; i++) {
            sum += i;
        }
        return sum;
    }
    public int getStreakGoal(int numWeeks) {
        int sum = 0;

        for (int i=0; i<=numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double sumPrice = 0;

        for (double price : prices) {
            sumPrice += price;
        }
        return sumPrice;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i=0 ; i<menuItems.size() ; i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
        System.out.println("\n");
    }
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, "+userName);
        System.out.println("There are "+customers.size()+" in front of you" );
        customers.add(userName);
    }

    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for (int i=1 ;i <=maxQuantity; i++) {
            System.out.println(i+" - $"+i*price);
        }
        System.out.println("\n");
    }

    public void printPriceChart(double price, int maxQuantity) {
        System.out.println("1 - $"+price );
        for (int i=2 ;i <=maxQuantity; i++) {
            double totalPrice = (i*price) - ((i-1)*0.5);
            System.out.println(i+" - $"+ totalPrice  );
        }
        System.out.println("\n");
    }
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false;
        }
        else {
            for (int i=0;i< menuItems.size();i++) {
                System.out.println(i+" "+menuItems.get(i)+ " -- $"+prices.get(i));
            }
            return true;
        }
    }
}