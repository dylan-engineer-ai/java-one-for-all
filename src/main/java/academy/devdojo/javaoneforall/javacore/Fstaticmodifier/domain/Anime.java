package academy.devdojo.javaoneforall.javacore.Fstaticmodifier.domain;

public class Anime {

    private String name;

    public String getName() {
        return name;
    }

    private static int[] episodes;

    static {
        System.out.println("Inside init block");
        episodes = new int[100];
        for (int i = 0; i < Anime.episodes.length; i++) {
            Anime.episodes[i] = i+1;
        }
        for (int episode : Anime.episodes) {
            System.out.print(episode+" ");
        }
    }

    public static int[] getEpisodes() {
        return episodes;
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {

    }



}
