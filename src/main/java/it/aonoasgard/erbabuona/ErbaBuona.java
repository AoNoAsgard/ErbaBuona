package it.aonoasgard.erbabuona;

import it.aonoasgard.erbabuona.initializers.EventInitializers;
import it.aonoasgard.erbabuona.json.ConfigInterface;
import org.bukkit.plugin.java.JavaPlugin;

public final class ErbaBuona extends JavaPlugin {

    @Override
    public void onEnable() {
        ConfigInterface cif = new ConfigInterface();
        EventInitializers.initialize(this,cif.getConfigs());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
