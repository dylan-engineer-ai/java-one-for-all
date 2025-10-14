package academy.devdojo.javaoneforall.javacore.Einitializationblock.domain;

public class Anime {
    {
        System.out.println("Inside init block");
    }
    private String name;

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i+1;
        }
        for (int episode : episodes) {
            System.out.print(episode+" ");
        }

    }

    private int[] episodes;

}
