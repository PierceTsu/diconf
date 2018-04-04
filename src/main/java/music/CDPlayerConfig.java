package music;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Project : mixconf
 * @Package Name : music
 * @Description: TODO
 * @Author : piercetsu@gmail.com
 * @Create Date: 2018-04-04 14:40
 */
@Configuration
public class CDPlayerConfig {

    @Bean
    public CompactDisc compactDisc() {
        return new BlankDisc();
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}
