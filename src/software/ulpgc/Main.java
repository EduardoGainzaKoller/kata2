package software.ulpgc;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/edani/title.basics.tsv");
        List<Title> titles = new FileTitleLoader(file, new TsvTitleDeserializer()).load();
        Stat stat = new TtitleStatBuilder(titles).build();
        System.out.println(stat.toString());
    }
}
