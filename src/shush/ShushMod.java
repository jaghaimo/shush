package shush;

import com.fs.starfarer.api.BaseModPlugin;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class ShushMod extends BaseModPlugin {

    @Override
    public void onApplicationLoad() throws Exception {
        Logger.getRootLogger().setLevel(Level.WARN);
    }
}
