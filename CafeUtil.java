import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CafeUtil {
    
    public int getStreakGoal(){
        int streak = 0;
        for (int i = 0; i <=10; i++){
            streak += i;
        }
        return streak;
    }

    public void printPriceChart(String name, double number, int maxNum){
        System.out.println(name);
        for(int i = 0; i < maxNum; i++){
            System.out.println(i+1 + " - " + "$" + number + "\n");
        }
    }

    // Iterates over the array to sum each item price and returns total
    public double getOrderTotal(double[] prices){
        double total = 0;
        for(double price: prices){
            total += price;
        }
        return total;
    }

    public void displayMenu(ArrayList<String> names, ArrayList<Double> prices){
        for(int i = 0; i < names.size(); i++){
            System.out.printf("%s %s -- $%.2f \n", i, names.get(i), prices.get(i));
        }
    }

    public void addCustomer(ArrayList<String> names){
        System.out.println("Hello there, what is your name? \n");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s! \n", userName);
        System.out.printf("There is %s people ahead of you. \n", names.size());
        names.add(userName);
    }

}