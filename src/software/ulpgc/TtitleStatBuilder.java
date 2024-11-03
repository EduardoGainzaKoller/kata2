package software.ulpgc;

import java.util.List;

public class TtitleStatBuilder implements StatBuilder{
    private final List<Title> titles;

    public TtitleStatBuilder(List<Title> titles) {
        this.titles = titles;
    }

    @Override
    public Stat build() {
        Stat stat = new Stat();
        for (Title title : titles) {
            stat.put(title.getYear(), (int)stat.getOrDefault(title.getYear(), 0)+1);
        }
        return stat;
    }
}
