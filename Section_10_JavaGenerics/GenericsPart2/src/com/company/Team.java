package com.company;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{
    /**
     * T is a bounded type parameter
     * <T extends Player> is a way of restricting the type of class we can use for team
     * <T extends Player> basically means that the type parameter we will accept when using generics is going to be any type
     * that extends from player or a sub-class of player.
     * Player is said to be the upper bound of T.
     * If we attempt to use any class not derived from player we will get an error
     */


    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)){
            System.out.println(player.getName() + " is already on the team");
            return false;
        } else{
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore){
            won++;
            message = " beat ";
        } else if (ourScore == theirScore){
            tied++;
            message = " drew with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if (opponent != null){
            System.out.println(this.getName()+ message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }


    @Override
    public int compareTo(Team<T> team) {
        if (ranking() > team.ranking()) {
            return -1;
        } else if (ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
