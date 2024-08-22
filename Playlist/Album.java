package Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name, artist;
    ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public boolean addSong(String songTitle, double songDuration) {
        if (findSong(songTitle) == null) {
            songs.add(new Song(songTitle, songDuration));
            return true;
        }

        return false;
    }

    public Song findSong(String songTitle) {
        for (Song song : songs) {
            if (song.getTitle().equals(songTitle))
                return song;
        }
        return null;
    }


    //this method looks for a trackNumber in a songs album and add that song to the playlist with the track number
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {

        //check if trackNumber exist in the songs
        if (trackNumber < 1 || trackNumber > songs.size()) {
            return false;
        }
        Song song = songs.get(trackNumber - 1);
        playlist.add(song);
        return true;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist) {
        Song song = findSong(songTitle);
        if (song != null) {
            playlist.add(song);
            return true;
        }
        return false;
    }
}

