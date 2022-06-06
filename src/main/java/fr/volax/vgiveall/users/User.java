package fr.volax.vgiveall.users;

import lombok.Data;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;

@Data
public class User {
    private final FileConfiguration fileConfiguration;
    private final File file;
    private final Player player;
    private final String id;

    public User(File file, Player player, String id) {
        this.fileConfiguration = YamlConfiguration.loadConfiguration(file);
        this.file = file;
        this.player = player;
        this.id = id;
    }
}
