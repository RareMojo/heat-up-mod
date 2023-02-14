package raremojo.heatup;

import net.fabricmc.api.ModInitializer;
import raremojo.heatup.item.HeatUpItemGroup;
import raremojo.heatup.item.HeatUpItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HeatUp implements ModInitializer {
	public static final String MOD_ID = "heatup";
	public static final Logger LOGGER = LoggerFactory.getLogger("heatup");

	@Override
	public void onInitialize() {
		LOGGER.info("RareMojo is ready to Heat Up!");
		HeatUpItemGroup.registerItemGroups();
		HeatUpItems.registerHeatUpItems();
	}
}
