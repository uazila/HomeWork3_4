package com.example.homework3_4;

public class Model {
    String nameMusic;
    String timeMusic;
    String nameAuthor;

    public Model(String nameMusic, String timeMusic, String nameAuthor) {
        this.nameMusic = nameMusic;
        this.timeMusic = timeMusic;
        this.nameAuthor = nameAuthor;
    }

    public String getNameMusic() {
        return nameMusic;
    }

    public void setNameMusic(String nameMusic) {
        this.nameMusic = nameMusic;
    }

    public String getTimeMusic() {
        return timeMusic;
    }

    public void setTimeMusic(String timeMusic) {
        this.timeMusic = timeMusic;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }
}
