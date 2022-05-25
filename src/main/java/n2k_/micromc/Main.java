package n2k_.micromc;
import java.io.IOException;
public class Main {
    public static void main(String[] ARGS) throws IOException, InterruptedException {
        System.out.println("Starting Minecraft 1.17");
        String GAME_VERSION = "1.17";
        String[] LIBRARIES_LIST = new String[] {
                "/libraries/com/mojang/blocklist/1.0.5/blocklist-1.0.5.jar",
                "/libraries/com/mojang/patchy/2.1.6/patchy-2.1.6.jar",
                "/libraries/com/github/oshi/oshi-core/5.7.5/oshi-core-5.7.5.jar",
                "/libraries/net/java/dev/jna/jna/5.8.0/jna-5.8.0.jar",
                "/libraries/net/java/dev/jna/jna-platform/5.8.0/jna-platform-5.8.0.jar",
                "/libraries/org/slf4j/slf4j-api/1.8.0-beta4/slf4j-api-1.8.0-beta4.jar",
                "/libraries/org/apache/logging/log4j/log4j-slf4j18-impl/2.14.1/log4j-slf4j18-impl-2.14.1.jar",
                "/libraries/com/ibm/icu/icu4j/66.1/icu4j-66.1.jar",
                "/libraries/com/mojang/javabridge/1.1.23/javabridge-1.1.23.jar",
                "/libraries/net/sf/jopt-simple/jopt-simple/5.0.3/jopt-simple-5.0.3.jar",
                "/libraries/io/netty/netty-all/4.1.25.Final/netty-all-4.1.25.Final.jar",
                "/libraries/com/google/guava/guava/21.0/guava-21.0.jar",
                "/libraries/org/apache/commons/commons-lang3/3.5/commons-lang3-3.5.jar",
                "/libraries/commons-io/commons-io/2.5/commons-io-2.5.jar",
                "/libraries/commons-codec/commons-codec/1.10/commons-codec-1.10.jar",
                "/libraries/net/java/jinput/jinput/2.0.5/jinput-2.0.5.jar",
                "/libraries/net/java/jutils/jutils/1.0.0/jutils-1.0.0.jar",
                "/libraries/com/mojang/brigadier/1.0.18/brigadier-1.0.18.jar",
                "/libraries/com/mojang/datafixerupper/4.0.26/datafixerupper-4.0.26.jar",
                "/libraries/com/google/code/gson/gson/2.8.0/gson-2.8.0.jar",
                "/libraries/com/mojang/authlib/2.3.31/authlib-2.3.31.jar",
                "/libraries/org/apache/commons/commons-compress/1.8.1/commons-compress-1.8.1.jar",
                "/libraries/org/apache/httpcomponents/httpclient/4.3.3/httpclient-4.3.3.jar",
                "/libraries/commons-logging/commons-logging/1.1.3/commons-logging-1.1.3.jar",
                "/libraries/org/apache/httpcomponents/httpcore/4.3.2/httpcore-4.3.2.jar",
                "/libraries/it/unimi/dsi/fastutil/8.2.1/fastutil-8.2.1.jar",
                "/libraries/org/apache/logging/log4j/log4j-api/2.14.1/log4j-api-2.14.1.jar",
                "/libraries/org/apache/logging/log4j/log4j-core/2.14.1/log4j-core-2.14.1.jar",
                "/libraries/org/lwjgl/lwjgl/3.2.1/lwjgl-3.2.1.jar",
                "/libraries/org/lwjgl/lwjgl/3.2.2/lwjgl-3.2.2.jar",
                "/libraries/org/lwjgl/lwjgl-jemalloc/3.2.1/lwjgl-jemalloc-3.2.1.jar",
                "/libraries/org/lwjgl/lwjgl-jemalloc/3.2.2/lwjgl-jemalloc-3.2.2.jar",
                "/libraries/org/lwjgl/lwjgl-openal/3.2.1/lwjgl-openal-3.2.1.jar",
                "/libraries/org/lwjgl/lwjgl-openal/3.2.2/lwjgl-openal-3.2.2.jar",
                "/libraries/org/lwjgl/lwjgl-opengl/3.2.1/lwjgl-opengl-3.2.1.jar",
                "/libraries/org/lwjgl/lwjgl-opengl/3.2.2/lwjgl-opengl-3.2.2.jar",
                "/libraries/org/lwjgl/lwjgl-glfw/3.2.1/lwjgl-glfw-3.2.1.jar",
                "/libraries/org/lwjgl/lwjgl-glfw/3.2.2/lwjgl-glfw-3.2.2.jar",
                "/libraries/org/lwjgl/lwjgl-stb/3.2.1/lwjgl-stb-3.2.1.jar",
                "/libraries/org/lwjgl/lwjgl-stb/3.2.2/lwjgl-stb-3.2.2.jar",
                "/libraries/org/lwjgl/lwjgl-tinyfd/3.2.1/lwjgl-tinyfd-3.2.1.jar",
                "/libraries/org/lwjgl/lwjgl-tinyfd/3.2.2/lwjgl-tinyfd-3.2.2.jar",
                "/libraries/org/lwjgl/lwjgl/3.2.1/lwjgl-3.2.1.jar",
                "/libraries/org/lwjgl/lwjgl/3.2.2/lwjgl-3.2.2.jar",
                "/libraries/org/lwjgl/lwjgl-jemalloc/3.2.1/lwjgl-jemalloc-3.2.1.jar",
                "/libraries/org/lwjgl/lwjgl-jemalloc/3.2.2/lwjgl-jemalloc-3.2.2.jar",
                "/libraries/org/lwjgl/lwjgl-openal/3.2.1/lwjgl-openal-3.2.1.jar",
                "/libraries/org/lwjgl/lwjgl-openal/3.2.2/lwjgl-openal-3.2.2.jar",
                "/libraries/org/lwjgl/lwjgl-opengl/3.2.1/lwjgl-opengl-3.2.1.jar",
                "/libraries/org/lwjgl/lwjgl-opengl/3.2.2/lwjgl-opengl-3.2.2.jar",
                "/libraries/org/lwjgl/lwjgl-glfw/3.2.1/lwjgl-glfw-3.2.1.jar",
                "/libraries/org/lwjgl/lwjgl-glfw/3.2.2/lwjgl-glfw-3.2.2.jar",
                "/libraries/org/lwjgl/lwjgl-stb/3.2.1/lwjgl-stb-3.2.1.jar",
                "/libraries/org/lwjgl/lwjgl-tinyfd/3.2.2/lwjgl-tinyfd-3.2.2.jar",
                "/libraries/org/lwjgl/lwjgl-tinyfd/3.2.1/lwjgl-tinyfd-3.2.1.jar",
                "/libraries/org/lwjgl/lwjgl-stb/3.2.2/lwjgl-stb-3.2.2.jar",
                "/libraries/com/mojang/text2speech/1.11.3/text2speech-1.11.3.jar",
                "/libraries/com/mojang/text2speech/1.11.3/text2speech-1.11.3.jar",
                "/libraries/ca/weblite/java-objc-bridge/1.0.0/java-objc-bridge-1.0.0.jar",
                "/libraries/ca/weblite/java-objc-bridge/1.0.0/java-objc-bridge-1.0.0.jar",
                "/versions/" + GAME_VERSION + "/" + GAME_VERSION + ".jar"
        };
        String JVM_ARGS = "-XX:+UnlockExperimentalVMOptions -XX:+UseG1GC -XX:G1NewSizePercent=20 -XX:G1ReservePercent=20 -XX:MaxGCPauseMillis=50 -XX:G1HeapRegionSize=32M";
        LaunchData DATA = new LaunchData(LIBRARIES_LIST, "/home/ner/Minecraft", "/assets", "1.17", GAME_VERSION, "/versions/1.17/natives/");
        Launcher LAUNCHER = new Launcher("java", "n2k_", "-Xmx2G", JVM_ARGS, 800, 640, DATA);
        LAUNCHER.launch();
        System.out.println("Minecraft 1.17 started");
    }
}