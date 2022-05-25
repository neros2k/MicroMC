package n2k_.micromc;
public class LaunchData {
    final String[] LIBRARIES_LIST;
    final String MC_DIR;
    final String ASSETS_DIR;
    final String ASSETS_INDEX;
    final String GAME_VERSION;
    final String NATIVES_DIR;
    public LaunchData(String[] LIBRARIES_LIST, String MC_DIR, String ASSETS_DIR, String ASSETS_INDEX, String GAME_VERSION, String NATIVES_DIR) {
        this.LIBRARIES_LIST = LIBRARIES_LIST;
        this.MC_DIR = MC_DIR;
        this.ASSETS_DIR = MC_DIR+ASSETS_DIR;
        this.ASSETS_INDEX = ASSETS_INDEX;
        this.GAME_VERSION = GAME_VERSION;
        this.NATIVES_DIR = MC_DIR+NATIVES_DIR;
    }
}
