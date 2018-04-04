package music;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Project : diconf
 * @Package Name : music
 * @Description: TODO
 * @Author : piercetsu@gmail.com
 * @Create Date: 2018-04-04 15:58
 */
@Configuration
public class CDConfig {

    @Bean
    public CompactDisc compactDisc() {
        return new BlankDisc();
    }
}
