package dev.warriorrr.villagerdisabler;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class VillagerListener implements Listener {
    @EventHandler(ignoreCancelled = true)
    public void onEntityInteract(PlayerInteractEntityEvent event) {
        if (event.getRightClicked().getType().equals(EntityType.VILLAGER))
            event.setCancelled(true);
    }
}
