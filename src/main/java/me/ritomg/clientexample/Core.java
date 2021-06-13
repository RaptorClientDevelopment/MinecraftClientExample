package me.ritomg.clientexample;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixins;

import javax.annotation.Nullable;
import java.util.Map;

/* This is for Sponge for Mixins that will allow us to change minecraft
    You can Add your Client Name Before Core
    if You change modid mixin config file name change to that
    you have to make all of the new mixins in me.ritomg.clientexample.mixin you can change the package name
 */
public class Core implements IFMLLoadingPlugin {

    public Core() {
        MixinBootstrap.init();
        Mixins.addConfiguration("mixins.modid.json");
    }

    @Override
    public String[] getASMTransformerClass() {
        return new String[0];
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Nullable
    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {

    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
