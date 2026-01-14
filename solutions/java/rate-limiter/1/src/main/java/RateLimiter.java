import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class RateLimiter<K> {
    TimeSource source;
    Duration windowSize;
    int limit;
    Map<K, Integer> counter;
    private final Map<K, Instant> windowStart = new HashMap<>();

    public RateLimiter(int limit, Duration windowSize, TimeSource timeSource) {
        source = timeSource;
        this.windowSize = windowSize;
        counter = new HashMap<>();
        this.limit = limit;
    }

    public boolean allow(K clientId) {

        Instant currentStart = windowStart.getOrDefault(clientId, source.now());

        boolean withinTimeLimit = source.now().isBefore(currentStart.plus(windowSize));
        boolean withinLimit = counter.getOrDefault(clientId, 0) < limit;
        if (withinLimit && withinTimeLimit) {
            counter.put(clientId, counter.getOrDefault(clientId, 0) + 1);
            windowStart.put(clientId, source.now());
            return true;
        }

        if (!withinTimeLimit) {
            counter.put(clientId, 1);
            windowStart.put(clientId, source.now());
            return true;
        }

        return false;

    }
}

