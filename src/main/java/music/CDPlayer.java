package music;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Project : mixconf
 * @Package Name : music
 * @Description: TODO
 * @Author : piercetsu@gmail.com
 * @Create Date: 2018-04-04 13:46
 */
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
