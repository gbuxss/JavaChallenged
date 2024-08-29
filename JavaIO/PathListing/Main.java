package JavaIO.PathListing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.Instant;

public class Main {

    public static void main(String[] args) {

//        Path path = Path.of("files/testing.txt");
//        printPathInfo(path);
        createFilesAndFolder(Path.of("gbuxss/files/folder/test.txt"));
        getExtraInfo(Path.of("gbuxss/files/folder/test.txt"));
    }

    private static void printPathInfo(Path path) {

        System.out.println("Path: " + path);
        System.out.println("fileName: " + path.getFileName());
        System.out.println("parent: " + path.getParent());
        Path absolutePath = path.toAbsolutePath();
        System.out.println("Absolute path :" + absolutePath);
        System.out.println("Absolute root path: " + absolutePath.getRoot());
        System.out.println("Root: " + path.getRoot());
        System.out.println("isAbsolute: " + path.isAbsolute());
        System.out.println("-".repeat(50));
    }

    private static void createFilesAndFolder(Path path) {

        try {
            Path parent = path.getParent();
            if (!Files.exists(parent)) {
                Files.createDirectories(parent);
            }
            Files.writeString(path, Instant.now() + ": Hello file world\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void getExtraInfo(Path path) {

        try {
            var atts = Files.readAttributes(path, "*");
            atts.entrySet().forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Something wrong!!!");
        }
    }
}

