package gregicality.science.common.metatileentities;

import gregicality.science.GregicalityScience;
import gregicality.science.api.recipes.GCYSRecipeMaps;
import gregicality.science.client.render.GCYSTextures;
import gregicality.science.common.metatileentities.singleblock.MetaTileEntitySteamEjector;
import gregtech.api.GTValues;
import gregtech.api.metatileentity.SimpleMachineMetaTileEntity;
import gregtech.client.renderer.texture.Textures;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;
import static gregtech.common.metatileentities.MetaTileEntities.registerSimpleMetaTileEntity;

public class GCYSMetaTileEntities {

    public static SimpleMachineMetaTileEntity[] DRYER = new SimpleMachineMetaTileEntity[GTValues.V.length - 1];
    public static MetaTileEntitySteamEjector STEAM_EJECTOR;

    public static void init() {
        registerSimpleMetaTileEntity(DRYER, 2100, "dryer", GCYSRecipeMaps.DRYER_RECIPES, GCYSTextures.DRYER_OVERLAY, true, GCYSMetaTileEntities::gcysId, (tier) -> 16000);




        STEAM_EJECTOR = registerMetaTileEntity(4100, new MetaTileEntitySteamEjector(gcysId("steam_ejector"), GCYSRecipeMaps.STEAM_EJECTOR_RECIPES, Textures.AIR_VENT_OVERLAY, true));
    }

    @Nonnull
    private static ResourceLocation gcysId(String name) {
        return new ResourceLocation(GregicalityScience.MODID, name);
    }
}