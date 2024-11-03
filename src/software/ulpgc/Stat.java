package software.ulpgc;

import java.util.HashMap;
import java.util.Map;

public class Stat {
    private final Map<Object, Object> stat;

    public Stat() {
        stat = new HashMap<>();
    }

    public Map<Object, Object> getStat() {
        return stat;
    }

    public Object getOrDefault(Object key, Object defaultValue) {
        return stat.getOrDefault(key, defaultValue);
    }

    public Object put(Object key, Object value) {
        return stat.put(key, value);
    }

    @Override
    public String toString() {
        String result = "YEAR\tFrequency\n";
        for (Object o : stat.keySet()) {
            result+= o.toString() + "\t" + stat.get(o).toString() + "\n";
        }

        return result;
    }
}
