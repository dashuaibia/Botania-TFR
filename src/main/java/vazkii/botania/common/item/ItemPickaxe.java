package vazkii.botania.common.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemPickaxe extends Item {

	public ItemPickaxe(String pickaxe) {
        super();
        this.setUnlocalizedName(pickaxe);
        GameRegistry.registerItem(this, pickaxe);
	}
}