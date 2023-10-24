import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> minMax = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input how many integers you want to add: ");
        int amount = scanner.nextInt();

        for (int i = 0; i < amount; i++) {
            System.out.println("Input integer: ");
            minMax.add(scanner.nextInt());
            if (i == amount-1){
                Collections.sort(minMax);
                System.out.println("The biggest integer is: "+minMax.get(amount-1));
                System.out.println("The smallest integer is: "+minMax.get(0));
                int sum = minMax.get(0)+ minMax.get(amount-1);
                System.out.println("The sum of the 2 extremes is: "+sum);
            }
        }


    }
}