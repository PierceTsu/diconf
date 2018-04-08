package music;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * @Project : diconf
 * @Package Name : music
 * @Description: TODO
 * @Author : piercetsu@gmail.com
 * @Create Date: 2018-04-08 22:36
 */
@Aspect
public class TrackCounter {

    private Map<Integer, Integer> trackCounts = new HashMap<Integer, Integer>();

    @Pointcut("execution(* music.BlankDisc.playTrack(int)) && args(trackNumber)")
    public void trackPlayed(int trackNumber) {}

    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber) {
        int currentCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber, currentCount + 1);
    }

    private int getPlayCount(int trackNumber) {
        return trackCounts.getOrDefault(trackNumber, 0);
    }
}
