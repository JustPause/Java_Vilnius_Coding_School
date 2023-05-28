public class BleuRay implements MultiMedia{
    private final String artist;
    public BleuRay(String string) {

        this.artist = string;
    }

    @Override
    public void play(){
        System.out.println("BlueRay player playing " + this.artist + " Movie");

    }

    @Override
    public String toString() {
        return "BleuRay{" +
                "artist='" + artist + '\'' +
                '}';
    }
}
