import java.util.HashMap;

public class Class5_HashMap_Q2 {
    public static void main(String[] args) {
        HashMap<String, String> myFavSongs = new HashMap<String, String>();
        myFavSongs.put("The 1975", "Robbers");
        myFavSongs.put("Joji", "Feeling Like The End");
        myFavSongs.put("Roar", "I Can't Handle Change");
        myFavSongs.put("Suicideboys", "And to Those I Love, Thanks for Sticking Around");
        myFavSongs.put("Michl", "Die Trying");

        System.out.print("{");
        for (String key : myFavSongs.keySet()) {
            // System.out.print(i.trim());
            System.out.print(" " + key + ":" + myFavSongs.get(key) + ",");
        }
        System.out.print("}");
        System.out.println();
    }
}
