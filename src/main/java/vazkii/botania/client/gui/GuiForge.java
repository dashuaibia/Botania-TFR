package vazkii.botania.client.gui;

import com.bioxx.tfc.Reference;
import com.bioxx.tfc.GUI.GuiContainerTFC;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import vazkii.botania.common.block.tile.TEForge;



public class GuiForge extends GuiContainerTFC
{
	public static ResourceLocation texture = new ResourceLocation("botania", Reference.ASSET_PATH_GUI + "gui_forge.png");

	private TEForge forgeTE;

	public GuiForge(InventoryPlayer inventoryplayer, TEForge te, World world, int x, int y, int z)
	{
		super(new ContainerForge(inventoryplayer, te, world, x, y, z), 176, 85);
		forgeTE = te;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{
		this.drawGui(texture);
	}

	@Override
	protected void drawForeground(int guiLeft, int guiTop)
	{
		if (forgeTE != null)
		{
			int scale = forgeTE.getTemperatureScaled(49);
			drawTexturedModalRect(guiLeft + 8, guiTop + 65 - scale, 185, 31, 15, 6);
		}
	}

	@Override
	protected boolean checkHotbarKeys(int keycode)
	{
		//Disabled to prevent players placing stacks into the forge
		// return super.checkHotbarKeys(keycode);
		return false;
	}
}
