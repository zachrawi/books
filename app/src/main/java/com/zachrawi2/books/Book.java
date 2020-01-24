package com.zachrawi2.books;

public class Book {
    private int cover;
    private String title;
    private String synopsis;

    public Book(int cover, String title, String synopsis) {
        this.cover = cover;
        this.title = title;
        this.synopsis = synopsis;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
}
