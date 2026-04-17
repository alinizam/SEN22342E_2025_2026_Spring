package Week10Theory.VisitorPatternJava;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Client {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("c:\\files");
        Path stream =Files.walkFileTree(path,new MyFileVisitorForDelete());

    }
}
