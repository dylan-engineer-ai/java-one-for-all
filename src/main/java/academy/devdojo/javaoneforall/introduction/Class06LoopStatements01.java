package academy.devdojo.javaoneforall.introduction;

public class Class06LoopStatements01 {
    public static void main(String[] args) {
        // while, do-while, for
        int counter = 0;
        while (counter < 2){
            System.out.println(counter);
            counter++;
        }
        counter = 0;
        do{
            System.out.println(counter);
            counter++;
        }while (counter < 2);
        for (int i=0;i<2;i++){
            System.out.println("Inside for");
        }
    }
}
