package com.example.michael.agris_clanky_semestralka;

/**
 * Created by Michael on 8.11.2014.
 * tato třída představuje objekt článku
 * článek by měl obsahovat id, nadpis, text
 */
public class Article {
    int id;
    String title;
    String text;

    public Article(int id, String title, String text) {
        this.id = id;
        this.title = title;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
