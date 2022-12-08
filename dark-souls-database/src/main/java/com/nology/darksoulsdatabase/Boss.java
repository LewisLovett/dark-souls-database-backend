package com.nology.darksoulsdatabase;

import javax.persistence.*;

@Entity
public class Boss {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String bossName;
    private int bossHealth;
    private int bossSouls;
    private String bossImage;

    private String bossMusic;
    private String bossDesc;

    private int gameAppearance;

    public Boss(){

    }


    public Boss(long id, String bossName, int bossHealth, int bossSouls, String bossImage, String bossMusic, String bossDesc, int gameAppearance) {
        this.id = id;
        this.bossName = bossName;
        this.bossHealth = bossHealth;
        this.bossSouls = bossSouls;
        this.bossImage = bossImage;
        this.bossMusic = bossMusic;
        this.bossDesc = bossDesc;
        this.gameAppearance = gameAppearance;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBossName() {
        return bossName;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossSouls() {
        return bossSouls;
    }

    public void setBossSouls(int bossSouls) {
        this.bossSouls = bossSouls;
    }

    public String getBossImage() {
        return bossImage;
    }

    public void setBossImage(String bossImage) {
        this.bossImage = bossImage;
    }

    public String getBossMusic() {
        return bossMusic;
    }

    public void setBossMusic(String bossMusic) {
        this.bossMusic = bossMusic;
    }


    public String getBossDesc() {
        return bossDesc;
    }

    public void setBossDesc(String bossDesc) {
        this.bossDesc = bossDesc;
    }

    public int getGameAppearance() {
        return gameAppearance;
    }

    public void setGameAppearance(int gameAppearance) {
        this.gameAppearance = gameAppearance;
    }
}
