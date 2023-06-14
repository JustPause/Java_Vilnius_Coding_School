public class MainPlayer
{
    public static void main(String[] arg){
        Player player = new Player();

        MusicCd musicCd01 = new MusicCd("System of the Down");
        MusicCd musicCd02 = new MusicCd("Hyperbole");
        MusicCd musicCd03 = new MusicCd("Metallic");

        player.run(musicCd01);
        player.run(musicCd02);
        player.run(musicCd03);

        VideoDvd videoDvd01 = new VideoDvd("Matrix");
        VideoDvd videoDvd02 = new VideoDvd("Matrix II");
        VideoDvd videoDvd03 = new VideoDvd("Matrix III");

        player.run(videoDvd01);
        player.run(videoDvd02);
        player.run(videoDvd03);

        BleuRay starTrek01 = new BleuRay("StarTrek 1");
        BleuRay starTrek02 = new BleuRay("StarTrek 2");
        BleuRay starTrek03 = new BleuRay("StarTrek 3");

        player.run(starTrek01);
        player.run(starTrek02);
        player.run(starTrek03);

    }
}
