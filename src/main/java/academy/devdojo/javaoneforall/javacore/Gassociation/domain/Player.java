package academy.devdojo.javaoneforall.javacore.Gassociation.domain;

public class Player {
    private String name;

    private Team team;

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void print(){
        System.out.println(this.name);
        if(this.team != null) {
            System.out.println(this.team.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player(String name) {
        this.name = name;
    }
}
