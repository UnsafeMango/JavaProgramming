package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team){
        if (league.contains(team)) {
            System.out.println(team.getName() + " is already in the league");
            return false;
        } else {
            league.add(team);
            System.out.println(team.getName() + " picked for " + this.name);
            return true;
        }
    }

    public void showLeagueTable() {
        Collections.sort(league);
        for (T t: league) {
            System.out.println(t.getName()+ ": " + t.ranking());
        }
    }




















}
