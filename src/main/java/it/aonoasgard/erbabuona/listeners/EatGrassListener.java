package it.aonoasgard.erbabuona.listeners;

import it.aonoasgard.erbabuona.model.ConfigItemJson;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class EatGrassListener implements Listener {

    private List<ConfigItemJson> items;

    public EatGrassListener(List<ConfigItemJson> items){
        this.items = items;
    }


    @EventHandler
    public void onRightClick(PlayerItemConsumeEvent event){
        ItemStack itemEvent = event.getItem();
        for (ConfigItemJson item : items){
            if(item.getItemID().equalsIgnoreCase(itemEvent.getType().toString())){
                Player player = event.getPlayer();
                player.setHealth(player.getHealth()+item.getHealQuantity());
            }
        }

    }
}

