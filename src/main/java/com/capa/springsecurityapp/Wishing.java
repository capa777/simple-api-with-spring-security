package com.capa.springsecurityapp;

import org.springframework.beans.factory.annotation.Autowired;

public class Wishing {
    public Wishing(String text, Season season) {
        this.text = text;
        this.season = season;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Wishing() {
    }

    private String text;

    private Season season;

}
