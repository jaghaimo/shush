package shush;

import com.fs.starfarer.api.BaseModPlugin;
import com.fs.starfarer.api.Global;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class ShushMod extends BaseModPlugin {

    @Override
    public void onApplicationLoad() throws Exception {
        Level rootLevel = getLevel("rootLogLevel");
        Level comFsLevel = getLevel("vanillaLogLevel");
        Logger.getRootLogger().setLevel(rootLevel);
        Logger.getLogger("com.fs").setLevel(comFsLevel);
    }

    private Level getLevel(String key) {
        return Level.toLevel(Global.getSettings().getString(key));
    }
}
