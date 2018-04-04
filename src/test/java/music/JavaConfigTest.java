package music;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Project : mixconf
 * @Package Name : music
 * @Description: TODO
 * @Author : piercetsu@gmail.com
 * @Create Date: 2018-04-04 14:42
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class JavaConfigTest {

    @Autowired
    private MediaPlayer player;

    @Test
    public void play() {
        player.play();
    }
}
