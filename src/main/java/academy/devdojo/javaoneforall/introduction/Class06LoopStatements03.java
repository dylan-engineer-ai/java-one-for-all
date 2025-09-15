package academy.devdojo.javaoneforall.introduction;

public class Class06LoopStatements03 {
    public static void main(String[] args) {
        double totalPrice = 20000;
        for (int monthCount = 0; monthCount <= totalPrice; monthCount++) {
            double monthlyPrice = totalPrice / monthCount;
            if(monthlyPrice < 1000){
                break;
            }
            System.out.println("Months "+monthCount+" Price: " + monthlyPrice);
            System.out.println("Inside for, Outside if"+monthCount);
        }
    }
}
