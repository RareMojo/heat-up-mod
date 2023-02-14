package raremojo.heatup.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import raremojo.heatup.HeatUp;

public class HeatUpItemGroup {
    public static ItemGroup HEATUPITEMS;

    public static void registerItemGroups() {
        HEATUPITEMS = FabricItemGroup.builder(new Identifier(HeatUp.MOD_ID, "heatupitems"))
                .displayName(Text.translatable("heatup.heatupitems"))
                .icon(() -> new ItemStack(HeatUpItems.HEATUPITEMS)).build();
    }
}