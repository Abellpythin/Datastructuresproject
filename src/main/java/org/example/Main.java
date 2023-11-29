package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        MusicPlayer musicPlayer = new MusicPlayer();

        Song song1 = new Song("Song 1", "Artist 1");
        Song song2 = new Song("Song 2", "Artist 2");
        Song song3 = new Song("Song 3", "Artist 3");

        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display Playlist");
            System.out.println("2. Play Song");
            System.out.println("3. Skip Song");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Playlist:");
                    playlist.displayPlaylist();
                    break;
                case 2:
                    System.out.println("Enter song number to play: ");
                    int songNumber = scanner.nextInt();
                    if (songNumber >= 1 && songNumber <= playlist.songs.size()) {
                        musicPlayer.playSong(playlist.songs.get(songNumber - 1));
                    } else {
                        System.out.println("Invalid song number");
                    }
                    break;
                case 3:
                    musicPlayer.skipSong();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}