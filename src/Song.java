import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Song {
    /*
    Problem Description:
    Your job is to create a class called Song.
     A new Song will take two parameters, title and artist.
     You will also have to create an instance method named howMany() (or how_many()).
     You will also have to create an instance method named howMany() (or how_many()).
    The method takes an array of people who have listened to the song that day.
    The output should be how many new listeners the song gained on that day out of all listeners.
    Names should be treated in a case-insensitive manner, i.e. "John" is the same as "john".
    Also if the same person listened to it more than once a day it should only count them once.
     */

    private String title;
    private String artist;
    private Set<String> result;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.result = new HashSet<>();
    }



    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int howMany(List<String> people) {
        List<String> temp = people.stream().map(String::toLowerCase).toList();
        int counter = 0;
        for (String person : temp) {
            if(!result.contains(person)) {
                counter++;
                result.add(person);
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        Song song = new Song("Rade","Radmark");
        System.out.println(song.howMany(new ArrayList<>(List.of("John", "Fred", "Bob", "Carl", "RyAn"))));
        System.out.println(song.howMany(new ArrayList<>(List.of("JoHn", "Luke", "AmAndA"))));
        System.out.println(song.howMany(new ArrayList<>(List.of("Amanda", "CalEb", "CarL", "Furgus"))));
        System.out.println(song.howMany(new ArrayList<>(List.of("JOHN", "FRED", "BOB", "CARL", "RYAN", "KATE"))));
        System.out.println(song.howMany(new ArrayList<>(List.of("Jack", "jacK"))));
    }
}
