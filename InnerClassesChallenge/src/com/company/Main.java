package com.company;
// Create a program that implements a playlist for songs
// Create a song class having title and duration for a song
// the albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order they are
// added
// Once the songs have been added to the playlist ,create a menu of options to:-
// Quit, skip forward to a next song, skip backwards to a previous song. Replay the current song.
// List the songs in the playlist
// A song must exist in the album before it can be added to the playlist(so you can only play songs that you own)
// Hint: To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist


import java.util.*;

public class Main {

    private static ArrayList<Albums> albums_ = new ArrayList<Albums>();
    public static void main(String[] args) {
        Albums albums = new Albums("StormBringer", "Deep Purple");
        albums.addSong("StormBringer", 4.20);
        albums.addSong("Love don't mean a thing", 5.16);
        albums.addSong("Holy man", 3.66);
        albums.addSong("Hold on", 3.66);
        albums.addSong("Lady double dealer", 3.66);
        albums.addSong("You can't do it right", 6.13);
        albums.addSong("High all shooter", 3.21);
        albums.addSong("The gypsy", 5.58);
        albums.addSong("Soldier of fortune", 4.56);
        albums_.add(albums);

        albums = new Albums("What have we done","Omah Lay");
        albums.addSong("My bebe", 3.25);
        albums.addSong("Can't relate", 3.95);
        albums.addSong("Godly", 3.33);
        albums.addSong("Confession", 4.21);
        albums.addSong("Damn", 2.22);
        albums.addSong("Lo Lo", 4.31);
        albums.addSong("Bad Influence", 3.45);
        albums_.add(albums);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums_.get(0).addToPlaylist("You can't do it right", playlist);
        albums_.get(0).addToPlaylist("Love don't mean a thing", playlist);
        albums_.get(0).addToPlaylist("The goat", playlist); //doesn't exist
        albums_.get(0).addToPlaylist(9, playlist);
        albums_.get(1).addToPlaylist(1, playlist);
        albums_.get(1).addToPlaylist(2, playlist);
        albums_.get(1).addToPlaylist(3, playlist);
        albums_.get(1).addToPlaylist(12, playlist); // no track 24

        play(playlist);




    }
    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> iterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No song in playlist");
            return;
        } else {
            System.out.println("Now playing " + iterator.next().toString()); //.toString from the object class
            // overrode in the song class
            printMenu();
        }
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (iterator.hasNext()){
                            iterator.next();
                        }
                        forward = true;
                    }
                    if (iterator.hasNext()){
                        System.out.println("Now playing " + iterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the list");
                        forward = true;
                    }
                    break;
                case 2:
                    if (forward){
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        forward = false;
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println("Now playing " + iterator.previous().toString());
                    } else {
                        System.out.println("We have reached the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (iterator.hasPrevious()){
                            System.out.println("Replaying " + iterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (iterator.hasNext()) {
                            System.out.println("Replaying " + iterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playlist.size() > 0) {
                        iterator.remove();
                        if (iterator.hasNext()) {
                            System.out.println("Now playing "+ iterator.next());
                        } else if (iterator.hasPrevious()) {
                            System.out.println("Now playing " + iterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions: \npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions\n" +
                "6 - delete current song from playlist");
    }

    private static  void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("**************************************");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("**************************************");
    }


    /** Modify the playlist challenge so that the album class uses an inner class.
     * Instead of using an arrayList to hold its tracks, it would use an inner class called SongList
     * It will also provide findSong() methods which will be used by the containing Album class to add
     * songs to the playlist
     * Neither the song class or the main class should be changed.
     */












}
