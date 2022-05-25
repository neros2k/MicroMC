package n2k_.testlauncher;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
public class Launcher {
    final String JAVA_PATH;
    final String PLAYER_NAME;
    final String JVM_RAM;
    final String JVM_ARGS;
    final int WIDTH;
    final int HEIGHT;
    final LaunchData DATA;
    public Launcher(String JAVA_PATH, String PLAYER_NAME, String JVM_RAM, String JVM_ARGS, int WIDTH, int HEIGHT, LaunchData DATA) {
        this.JAVA_PATH = JAVA_PATH;
        this.PLAYER_NAME = PLAYER_NAME;
        this.JVM_RAM = JVM_RAM;
        this.JVM_ARGS = JVM_ARGS;
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
        this.DATA = DATA;
    }
    void launch() throws IOException, InterruptedException {
        StringBuilder LIBRARIES_LIST_BUILDER = new StringBuilder();
        StringBuilder COMMAND_BUILDER = new StringBuilder();
        AtomicInteger I = new AtomicInteger(1);
        Arrays.stream(DATA.LIBRARIES_LIST).toList().forEach(LIB -> {
            LIBRARIES_LIST_BUILDER.append(DATA.MC_DIR).append(LIB);
            if(I.get()<DATA.LIBRARIES_LIST.length) LIBRARIES_LIST_BUILDER.append(":");
            I.getAndIncrement();
        });
        String[] COMMANDS = new String[]{
                JAVA_PATH, JVM_RAM, JVM_ARGS, "-Djava.library.path="+DATA.NATIVES_DIR, "-cp", LIBRARIES_LIST_BUILDER.toString(), "net.minecraft.client.main.Main",
                "--username", PLAYER_NAME, "--version", DATA.GAME_VERSION, "--accessToken 0", "--userProperties {}", "--gameDir", DATA.MC_DIR, "--assetsDir", DATA.ASSETS_DIR,
                "--assetIndex", DATA.ASSETS_INDEX, "--width"+WIDTH, "--height"+HEIGHT
        };
        Arrays.stream(COMMANDS).toList().forEach(CMD -> COMMAND_BUILDER.append(CMD).append(" "));
        Process PROCESS = Runtime.getRuntime().exec(COMMAND_BUILDER.toString());
        PROCESS.waitFor();
    }
}
