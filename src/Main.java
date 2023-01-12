public class Main {
    public static void main(String[] args) {

        MusicStyles [] groups = { new PopMusic(),new RockMusic(),  new  ClassicMusic ()  };
        for (MusicStyles musicStyles : groups) {

            musicStyles.playMusic();
        }

    }
}