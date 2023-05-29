public class VideoDvd implements MultiMedia{
    private final String movieName;
    public VideoDvd(String name) {
        this.movieName = name;
    }

    @Override
    public void play(){

        System.out.println("DiV player playing artst" + movieName + " Movie");
    }
}
