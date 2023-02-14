package raremojo.heatup.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.gui.screen.TitleScreen;
import raremojo.heatup.HeatUp;

@Mixin(TitleScreen.class)
public class HeatUpMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		HeatUp.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
