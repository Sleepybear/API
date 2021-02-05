package org.cloudburstmc.api.event.player;

import org.cloudburstmc.api.event.Cancellable;
import org.cloudburstmc.api.player.Player;

public class PlayerCommandPreprocessEvent extends PlayerMessageEvent implements Cancellable {

    public PlayerCommandPreprocessEvent(Player player, String message) {
        super(player, message);
    }
}