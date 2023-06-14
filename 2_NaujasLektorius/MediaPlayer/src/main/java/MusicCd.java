public class MusicCd implements MultiMedia{
    private final String artist;

    public MusicCd(String sting) {

        this.artist = sting;
    }

    @Override
    public void play() {

        System.out.println("Music CD is playing " + this.artist);
    }

    @Override
    public String toString() {

        return "MusicCd " + " artist='" + artist + '\'';
    }
}
