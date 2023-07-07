import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GameInstallation {
    public static void main(String[] args) {
        String gamesDirPath = "D:\\Netology.project\\Блок JavaCore\\Games"; // Замените на свой путь к папке Games

        File gameDir = new File(gamesDirPath);
        boolean created = gameDir.mkdirs();
        if (created) {
            System.out.println("Папка Games создана(дата/время)- [03.07.2023] [15:00]");
        } else {
            System.out.println("Не удалось создать папку Games.");
            return;
        }

        File srcDir = new File(gamesDirPath, "src");
        created = srcDir.mkdirs();
        if (created) {
            System.out.println("Папка src создана(дата/время)- [03.07.2023] [15:10]");
        } else {
            System.out.println("Не удалось создать папку src.");
            return;
        }

        File mainDir = new File(srcDir, "main");
        created = mainDir.mkdir();
        if (created) {
            System.out.println("Папка main создана(дата/время)- [03.07.2023] [15:15]");
        } else {
            System.out.println("Не удалось создать папку main.");
            return;
        }

        File testDir = new File(srcDir, "test");
        created = testDir.mkdir();
        if (created) {
            System.out.println("Папка test создана(дата/время)- [03.07.2023] [15:30]");
        } else {
            System.out.println("Не удалось создать папку test.");
            return;
        }

        File mainFile = new File(mainDir, "Main.java");
        try {
            mainFile.createNewFile();
            System.out.println("Файл Main.java создана(дата/время)- [04.07.2023] [9:40]");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File utilsFile = new File(mainDir, "Utils.java");
        try {
            utilsFile.createNewFile();
            System.out.println("Файл Utils.java создана(дата/время)- [04.07.2023] [9:46]");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        File resDir = new File(gamesDirPath, "res");
        created = resDir.mkdirs();
        if (created) {
            System.out.println("Папка res создана(дата/время)- [04.07.2023] [9:50]");
        } else {
            System.out.println("Не удалось создать папку");
        }

        File drawablesDir = new File(resDir, "drawables");
        created = drawablesDir.mkdir();
        if (created) {
            System.out.println("Папка drawables создана(дата/время)- [04.07.2023] [9:59]");
        } else {
            System.out.println("Не удалось создать папку");
        }


        File vectorsDir = new File(resDir, "vectors");
        created = vectorsDir.mkdir();
        if (created) {
            System.out.println("Папка vectors создана(дата/время)- [04.07.2023] [10:01]");
        } else {
            System.out.println("Не удалось создать папку");
        }

        File iconsDir = new File(resDir, "icons");
        created = iconsDir.mkdir();
        if (created) {
            System.out.println("Папка icons создана(дата/время)- [04.07.2023] [10:02]");
        } else {
            System.out.println("Не удалось создать папку");
        }

        File saveGamesDir = new File(gamesDirPath, "savegames");
        created = saveGamesDir.mkdir();
        if (created) {
            System.out.println("Папка savegames создана(дата/время)- [04.07.2023] [9:55]");
        } else {
            System.out.println("Не удалось создать папку");
        }

        File tempDir = new File(gamesDirPath, "temp");
        created = tempDir.mkdir();
        if (created) {
            System.out.println("Папка temp создана(дата/время)- [04.07.2023] [10:06]");
        } else {
            System.out.println("Не удалось создать папку");
        }

        File tempFile = new File(tempDir, "temp.txt");
        try {
            tempFile.createNewFile();
            System.out.println("Файл temp.txt создана(дата/время)- [04.07.2023] [10:25]");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        StringBuilder logBuilder = new StringBuilder();
        logBuilder.append("Все файлы и папки успешно созданы");

        try (FileWriter writer = new FileWriter(tempFile)) {
            writer.write(logBuilder.toString());
            System.out.println("Лог успешно записан в файл temp.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при записи лога в файл temp.txt " + e.getMessage());
        }


    }
}