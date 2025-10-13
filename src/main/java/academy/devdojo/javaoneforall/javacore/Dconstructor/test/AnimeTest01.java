package academy.devdojo.javaoneforall.javacore.Dconstructor.test;


import academy.devdojo.javaoneforall.javacore.Dconstructor.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu","TV",57,"Finished");
        Anime anime2 = new Anime();
        anime.init("Drive","TV",57);
//        anime.setType("TV");
//        anime.setEpisodes(57);
//        anime.setName("Drive");

        anime.print();
    }
}
