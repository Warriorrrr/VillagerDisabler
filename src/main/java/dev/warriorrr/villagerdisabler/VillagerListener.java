package dev.warriorrr.villagerdisabler;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityInteractEvent;

public class VillagerListener implements Listener {
    @EventHandler(ignoreCancelled = true)
    public void onEntityInteract(EntityInteractEvent event) {
        if (event.getEntityType().equals(EntityType.VILLAGER))
            event.setCancelled(true);
    }
}
