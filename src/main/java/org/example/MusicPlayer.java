package org.example;
import java.util.Stack;
public class MusicPlayer {
    Stack<Song> songStack;

    public MusicPlayer() {
        songStack = new Stack<>();
    }

    public void playSong(Song song) {
        System.out.println("Now playing: " + song);
        songStack.push(song);
    }

    public void skipSong() {
        if (!songStack.isEmpty()) {
            Song skippedSong = songStack.pop();
            System.out.println("Skipped: " + skippedSong);
        } else {
            System.out.println("Playlist is empty");
        }
    }
}

