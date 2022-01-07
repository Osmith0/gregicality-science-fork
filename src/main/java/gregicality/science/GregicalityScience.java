package gregicality.science;

import gregicality.science.api.GCYSLog;
import gregicality.science.common.CommonProxy;
import gregicality.science.common.GCYSciConfig;
import gregicality.science.common.block.GCYSMetaBlocks;
import gregicality.science.common.machine.GCYSMetaTileEntities;
import gregtech.api.GTValues;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.IOException;

@Mod(   modid        = GregicalityScience.MODID,
        name         = GregicalityScience.NAME,
        version      = GregicalityScience.VERSION,
        dependencies = GTValues.MOD_VERSION_DEP + "required-after:gcym")
public class GregicalityScience {

    public static final String MODID = "gcys";
    public static final String NAME = "Gregicality Science";
    public static final String VERSION = "@VERSION@";

    @SidedProxy(modId = MODID, clientSide = "gregicality.science.common.ClientProxy", serverSide = "gregicality.science.common.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void onConstruction(FMLConstructionEvent event) {
        GCYSciConfig.syncMachineConfigs();
        GTValues.HT = true; // force GTCEu to register UHV+ Hulls, Casings, Basic Electric Pieces like Transformers, Bat Buffers, etc.
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        GCYSLog.init(event.getModLog());
        proxy.preLoad();

        GCYSMetaBlocks.init();
        GCYSMetaTileEntities.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) throws IOException {
        proxy.onLoad();
    }
}
