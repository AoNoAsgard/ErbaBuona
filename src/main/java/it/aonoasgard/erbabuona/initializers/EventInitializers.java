package it.aonoasgard.erbabuona.initializers;

import it.aonoasgard.erbabuona.ErbaBuona;
import it.aonoasgard.erbabuona.listeners.EatGrassListener;
import it.aonoasgard.erbabuona.model.ConfigItemJson;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class EventInitializers {
    public static void initialize(ErbaBuona plugin, List<ConfigItemJson> items){
        plugin.getServer().getPluginManager().registerEvents(new EatGrassListener(items),plugin);
    }

}
