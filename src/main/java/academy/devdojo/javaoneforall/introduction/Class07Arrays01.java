package academy.devdojo.javaoneforall.introduction;

public class Class07Arrays01 {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Goku";
        names[1] = "Hinata";
        names[2] = "Luffy";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
