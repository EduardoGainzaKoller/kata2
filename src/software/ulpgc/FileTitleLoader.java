package software.ulpgc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class FileTitleLoader implements TitleLoader{
    private final File file;
    private Titledeserializer deserializer;

    public FileTitleLoader(File file, Titledeserializer deserializer) {
        this.file = file;
        this.deserializer = deserializer;
    }

    @Override
    public List<Title> load() throws IOException {
        List<Title> titles = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            reader.readLine();
            while (true) {
                String line = reader.readLine();
                if(line == null) break;
                titles.add(deserializer.deserialize(line));
            }
            return titles;
        }
    }
}
