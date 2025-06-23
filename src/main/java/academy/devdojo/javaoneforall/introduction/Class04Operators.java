package academy.devdojo.javaoneforall.introduction;

public class Class04Operators {
    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 20;
        int result = number02 - number01;

        System.out.println(result);

        // %
        int modulo = 20 % 2;
        System.out.println(modulo);

        // < > <= >= != ==
        boolean isTenLowerThanTwenty = 10 < 20;
        boolean isTenLowerOrEqualsThanTwenty = 10 <= 20;
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenGreaterOrEqualsThanTwenty = 10 >= 20;
        boolean isTenDifferentThanTwenty = 10 != 20;
        boolean isTenEqualsTwenty = 10 == 20;
        System.out.println("isTenLowerThanTwenty " + isTenLowerThanTwenty);
        System.out.println("isTenLowerOrEqualsThanTwenty " + isTenLowerOrEqualsThanTwenty);
        System.out.println("isTenGreaterThanTwenty " + isTenGreaterThanTwenty);
        System.out.println("isTenGreaterOrEqualsThanTwenty " + isTenGreaterOrEqualsThanTwenty);
        System.out.println("isTenDifferentThanTwenty " + isTenDifferentThanTwenty);
        System.out.println("isTenEqualsTwenty " + isTenEqualsTwenty);
    }
}
