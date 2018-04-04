package music;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Project : diconf
 * @Package Name : music
 * @Description: TODO
 * @Author : piercetsu@gmail.com
 * @Create Date: 2018-04-04 16:02
 */
@Configuration
@Import({CDConfig.class, CDPlayerConfig.class})
public class MusicConfig {
}
