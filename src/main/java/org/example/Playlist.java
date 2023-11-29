package org.example;

import java.util.LinkedList;

public class Playlist {
    LinkedList<Song> songs;

    public Playlist() {
        songs = new LinkedList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void displayPlaylist() {
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}

