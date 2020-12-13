package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
// ALBUM CLASS
public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong (String title, double duration) {
        Song newSong = new Song(title, duration);
        Song song = findSong(title);
        if (song == null) {
            songs.add(newSong);
            return true;
        }
        return false;
    }

    private Song findSong (String title) {
        for (int i = 0; i < songs.size(); i++) {
            Song song = songs.get(i);
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList (int trackNumber, LinkedList<Song> playlist) {
        if (trackNumber > 0 && songs.get(trackNumber - 1) != null) {
            playlist.add(songs.get(trackNumber - 1));
            return true;
        }
        return false;
    }

    public boolean addToPlayList (String name, LinkedList<Song> playlist) {
        Song song = findSong(name);
        if (song != null) {
            playlist.add(song);
            return true;
        }
        return false;
    }
}
