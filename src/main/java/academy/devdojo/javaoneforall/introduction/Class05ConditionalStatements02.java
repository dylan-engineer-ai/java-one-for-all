package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalStatements02 {
    public static void main(String[] args) {
        // age < 15 category junior
        // age >= 15 && age < 18 category senior
        // age >= 18 category masters
        int age = 15;
        if(age < 15){
            System.out.println("Category Junior");
        }else if (age >= 15 && age <18){
            System.out.println("Category Senior");
        }else {
            System.out.println("Category Master");
        }
    }
}
