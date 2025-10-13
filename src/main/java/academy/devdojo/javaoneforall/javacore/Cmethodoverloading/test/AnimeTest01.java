package academy.devdojo.javaoneforall.javacore.Cmethodoverloading.test;

import academy.devdojo.javaoneforall.javacore.Cmethodoverloading.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Drive","TV",57);
//        anime.setType("TV");
//        anime.setEpisodes(57);
//        anime.setName("Drive");

        anime.print();
    }
}
