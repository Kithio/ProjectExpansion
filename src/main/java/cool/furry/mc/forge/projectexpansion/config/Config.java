package cool.furry.mc.forge.projectexpansion.config;

import net.minecraftforge.common.ForgeConfigSpec;

public final class Config {
    public static final ForgeConfigSpec.Builder Builder = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec Spec;
    public static final ForgeConfigSpec.ConfigValue<Integer> tickDelay = Builder.translation("gui.projectexpansion.config.tick_delay.desc").define("tickDelay", 20);
    public static final ForgeConfigSpec.ConfigValue<Boolean> formatEMC = Builder.translation("gui.projectexpansion.config.format_emc.desc").define("formatEMC", true);
    public static final ForgeConfigSpec.ConfigValue<Boolean> fullNumberNames = Builder.translation("gui.projectexpansion.config.full_number_names.desc").define("fullNumberNames", true);
    public static final ForgeConfigSpec.ConfigValue<Boolean> emcDisplay = Builder.translation("gui.projectexpansion.config.emc_display.desc").define("emcDisplay", true);
    public static final ForgeConfigSpec.ConfigValue<Integer> powerflowerMultiplier = Builder.translation("gui.projectexpansion.config.powerflower_multiplier.desc").define("powerflowerMultiplier", 1);
    public static final ForgeConfigSpec.ConfigValue<Boolean> notifyCommandChanges = Builder.translation("gui.projectexpansion.config.notify_command_changes.desc").define("notifyCommandChanges", true);
    public static final ForgeConfigSpec.ConfigValue<Boolean> limitEmcLinkVendor = Builder.translation("gui.projectexpansion.config.limit_emc_link_vendor.desc").define("limitEmcLinkVendor", true);
    static { Spec = Builder.build(); }
}