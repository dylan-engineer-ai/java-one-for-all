package academy.devdojo.javaoneforall.introduction;

public class Class07Arrays03 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int[] numbers2 = {1,2,3};
        int[] numbers3 = new int[]{1,2,3};

        for (int i = 0; i < numbers3.length; i++) {
            System.out.println(numbers3[i]);
        }

        for (int num: numbers2) {
            System.out.println(num);
        }
    }
}
