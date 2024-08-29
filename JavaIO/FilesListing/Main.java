package JavaIO.FilesListing;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Path path = Path.of("");

        System.out.println("CWD = " + path.toAbsolutePath() );

        try (Stream<Path> paths = Files.walk(path, 2)) {
            paths
                    .map(Main::listDir)
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String listDir(Path path) {

        try {

            boolean isDir = Files.isDirectory(path);
            FileTime dateFiled = Files.getLastModifiedTime(path);
            LocalDateTime modTime = LocalDateTime.ofInstant(dateFiled.toInstant(), ZoneId.systemDefault());
            return "%tD %tT %-5s  %12s %s"
                    .formatted(modTime, modTime, (isDir ? "<DIR>" : "") , (isDir ? "" : Files.size(path)) + " KB", path);

        } catch (IOException e) {
            System.out.println("Something is wrong...");
            return path.toString();
        }
    }

}
