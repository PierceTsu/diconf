package music;

/**
 * @Project : diconf
 * @Package Name : music
 * @Description: TODO
 * @Author : piercetsu@gmail.com
 * @Create Date: 2018-04-04 16:47
 */
public class BlackDisc implements CompactDisc {

    @Override
    public void play() {
        System.out.println("play black disc");
    }

    public void playTrack(int track) {
        System.out.println("playing track: " + track);
    }
}
