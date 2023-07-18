import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class GameInstallation {
    private static StringBuilder logBuilder = new StringBuilder();

    public static void main(String[] args) {
        List<String> directories = List.of(
                "D:\\Netology.project\\Блок JavaCore\\Games\\src",
                "D:\\Netology.project\\Блок JavaCore\\Games\\src\\main",
                "D:\\Netology.project\\Блок JavaCore\\Games\\src\\test",
                "D:\\Netology.project\\Блок JavaCore\\Games\\res",
                "D:\\Netology.project\\Блок JavaCore\\Games\\res\\drawables",
                "D:\\Netology.project\\Блок JavaCore\\Games\\res\\vectors",
                "D:\\Netology.project\\Блок JavaCore\\Games\\res\\icons",
                "D:\\Netology.project\\Блок JavaCore\\Games\\savegames",
                "D:\\Netology.project\\Блок JavaCore\\Games\\temp"
        );

        for (String directory : directories) {
            createDirectory(directory);
        }

        createFile("D:\\Netology.project\\Блок JavaCore\\Games\\src\\main\\Main.java");
        createFile("D:\\Netology.project\\Блок JavaCore\\Games\\src\\main\\Utils.java");

        createFileLog("D:\\Netology.project\\Блок JavaCore\\Games\\temp\\temp.txt");
    }

    public static void createDirectory(String path) {
        File directory = new File(path);
        boolean created = directory.mkdirs();
        String status = created ? "успешно" : "не удалось";
        logBuilder.append("Папка ").append(path).append(" создана (дата/время) - ")
                .append(LocalDateTime.now()).append(", ").append(status).append("\n");
    }

    public static void createFile(String filePath) {
        File file = new File(filePath);
        try {
            boolean created = file.createNewFile();
            String status = created ? "успешно" : "не удалось";
            logBuilder.append("Файл ").append(filePath).append(" создан (дата/время) - ")
                    .append(LocalDateTime.now()).append(", ").append(status).append("\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createFileLog(String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(logBuilder.toString());
            System.out.println("Лог успешно записан в файл temp.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при записи лога в файл temp.txt: " + e.getMessage());
        }
    }
}