package raremojo.heatup.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import raremojo.heatup.HeatUp;



public class HeatUpItems {
    public static final Item TINDERBOX = registerItem("tinderbox",
            new Item(new FabricItemSettings()));

    public static final Item HEATUPITEMS = registerItem("heatupitems",
    new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(HeatUp.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.TOOLS, TINDERBOX);
        addToItemGroup(HeatUpItemGroup.HEATUPITEMS, TINDERBOX);

        addToItemGroup(ItemGroups.SEARCH, HEATUPITEMS);
        addToItemGroup(HeatUpItemGroup.HEATUPITEMS, HEATUPITEMS);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerHeatUpItems() {
        HeatUp.LOGGER.info("Registering Heat Up! Items for " + HeatUp.MOD_ID);

        addItemsToItemGroup();
    }
}