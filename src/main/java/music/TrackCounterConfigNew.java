package music;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

/**
 * @Project : diconf
 * @Package Name : music
 * @Description: TODO
 * @Author : piercetsu@gmail.com
 * @Create Date: 2018-04-09 21:11
 */
@Configuration
@ImportResource("classpath:track-counter.xml")
@EnableAspectJAutoProxy
public class TrackCounterConfigNew {

    @Bean
    public CompactDisc compactDisc() {
        return new BlackDisc();
    }

    @Bean
    public TrackCounterNew trackCounterNew() {
        return new TrackCounterNew();
    }
}
