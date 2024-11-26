package dev.ericds.Muay.model;

public class CombatFighter {
    private Long id;
    private String name;
    private String nickname;
    private String weightClass;
    private String fightingStyle;
    private Integer wins;
    private Integer losses;
    private Integer draws;
    private String biography;

    // Constructor
    public CombatFighter(Long id, String name, String nickname, String weightClass, String fightingStyle, Integer wins, Integer losses, Integer draws, String biography) {
        this.id= id;
        this.name = name;
        this.nickname = nickname;
        this.weightClass = weightClass;
        this.fightingStyle = fightingStyle;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
        this.biography = biography;
    }

    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getNickname() { return nickname; }
    public String getWeightClass() { return weightClass; }
    public String getFightingStyle() { return fightingStyle; }
    public Integer getWins() { return wins; }
    public Integer getLosses() { return losses; }
    public Integer getDraws() { return draws; }
    public String getBiography() { return biography; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setNickname(String nickname) { this.nickname = nickname; }
    public void setWeightClass(String weightClass) { this.weightClass = weightClass; }
    public void setFightingStyle(String fightingStyle) { this.fightingStyle = fightingStyle; }
    public void setWins(Integer wins) { this.wins = wins; }
    public void setLosses(Integer losses) { this.losses = losses; }
    public void setDraws(Integer draws) { this.draws = draws; }
    public void setBiography(String biography) { this.biography = biography; }

    @Override
    public String toString() {
        return "CombatFighter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", weightClass='" + weightClass + '\'' +
                ", fightingStyle='" + fightingStyle + '\'' +
                ", wins=" + wins +
                ", losses=" + losses +
                ", draws=" + draws +
                ", biography='" + biography + '\'' +
                '}';
    }
}
