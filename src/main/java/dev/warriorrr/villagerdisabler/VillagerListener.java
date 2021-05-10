package dev.warriorrr.villagerdisabler;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.vehicle.VehicleEnterEvent;

public class VillagerListener implements Listener {
    @EventHandler(ignoreCancelled = true)
    public void onEntityInteract(PlayerInteractEntityEvent event) {
        if (event.getRightClicked().getType().equals(EntityType.VILLAGER))
            event.setCancelled(true);
    }

    @EventHandler
    public void onEnterBoat(VehicleEnterEvent event) {
        if (event.getEntered().getType().equals(EntityType.WANDERING_TRADER))
            event.setCancelled(true);
    }
}
