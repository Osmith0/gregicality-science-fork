package gregicality.science.loaders.recipes.chain;

public class FusionComponents {
    public static void init() { //todo
//
//        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().duration(1000).EUt(500000)
//                .inputs(GCYSMetaBlocks.FUSION_CASING.getItemVariant(GAFusionCasing.CasingType.ADV_FUSION_COIL_1))
//                .inputs(OreDictUnifier.get(plate, TantalumHafniumSeaborgiumCarbide, 8))
//                .inputs(OreDictUnifier.get(plate, Einsteinium, 8))
//                .inputs(FIELD_GENERATOR_UV.getStackForm(2))
//                .inputs(HIGH_POWER_INTEGRATED_CIRCUIT.getStackForm(64))
//                .inputs(HIGH_POWER_INTEGRATED_CIRCUIT.getStackForm(64))
//                .inputs(OreDictUnifier.get(wireGtQuadruple, EnrichedNaquadahTriniumEuropiumDuranide, 64))
//                .input(circuit, MarkerMaterials.Tier.Infinite, 4)
//                .fluidInputs(SolderingAlloy.getFluid(2880 * 2))
//                .outputs(GCYSMetaTileEntities.ADVANCED_FUSION_REACTOR.getStackForm())
//                .buildAndRegister();
//
//        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().duration(100).EUt(500000)
//                .input(wireGtOctal, EnrichedNaquadahTriniumEuropiumDuranide, 4)
//                .input(plate, TantalumHafniumSeaborgiumCarbide, 2)
//                .input(plate, Einsteinium, 4)
//                .inputs(NEUTRON_REFLECTOR.getStackForm(4))
//                .input(circuit, MarkerMaterials.Tier.Infinite)
//                .inputs(FIELD_GENERATOR_UV.getStackForm())
//                .fluidInputs(SolderingAlloy.getFluid(1440))
//                .outputs(GCYSMetaBlocks.FUSION_CASING.getItemVariant(GAFusionCasing.CasingType.ADV_FUSION_COIL_1, 4))
//                .buildAndRegister();
//
//        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().duration(100).EUt(2000000)
//                .input(wireGtOctal, GCYSciMaterials.StrontiumTaraniumTBCCO, 4)
//                .input(plate, Bohrium, 2)
//                .input(plate, Fermium, 4)
//                .inputs(NEUTRON_REFLECTOR.getStackForm(16))
//                .input(circuit, MarkerMaterials.Tier.Ultra)
//                .inputs(FIELD_GENERATOR_UHV.getStackForm())
//                .fluidInputs(SolderingAlloy.getFluid(2880))
//                .outputs(GCYSMetaBlocks.FUSION_CASING.getItemVariant(GAFusionCasing.CasingType.ADV_FUSION_COIL_2, 4))
//                .buildAndRegister();
//
//        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().duration(100).EUt(8000000)
//                .input(wireGtOctal, ActiniumVibraniumBETSSuperhydride, 4)
//                .input(plate, Vibranium, 2)
//                .input(plate, Mendelevium, 4)
//                .inputs(NEUTRON_REFLECTOR.getStackForm(64))
//                .input(circuit, MarkerMaterials.Tier.Insane)
//                .inputs(FIELD_GENERATOR_UEV.getStackForm())
//                .fluidInputs(SolderingAlloy.getFluid(5660))
//                .outputs(GCYSMetaBlocks.FUSION_CASING.getItemVariant(GAFusionCasing.CasingType.ADV_FUSION_COIL_3, 4))
//                .buildAndRegister();
//
//        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().duration(100).EUt(500000)
//                .input(frameGt, TungstenSteel, 4)
//                .input(plate, TungstenSteel, 16)
//                .input(plate, Tungsten, 32)
//                .input(screw, LithiumTitanate, 16)
//                .inputs(ELECTRIC_PUMP_UHV.getStackForm())
//                .inputs(SENSOR_UHV.getStackForm())
//                .inputs(GCYSMetaBlocks.FUSION_CASING.getItemVariant(GAFusionCasing.CasingType.ADV_FUSION_CASING))
//                .fluidInputs(SolderingAlloy.getFluid(1440))
//                .outputs(GCYSMetaBlocks.DIVERTOR_CASING.getItemVariant(GADivertorCasing.CasingType.DIVERTOR_1, 4))
//                .buildAndRegister();
//
//        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().duration(100).EUt(2000000)
//                .input(frameGt, TungstenSteel, 8)
//                .input(plate, TungstenSteel, 32)
//                .input(plate, TungstenTitaniumCarbide, 32)
//                .input(screw, LithiumTitanate, 32)
//                .inputs(ELECTRIC_PUMP_UEV.getStackForm())
//                .inputs(SENSOR_UEV.getStackForm())
//                .inputs(GCYSMetaBlocks.FUSION_CASING.getItemVariant(GAFusionCasing.CasingType.ADV_FUSION_CASING, 4))
//                .fluidInputs(SolderingAlloy.getFluid(2880))
//                .outputs(GCYSMetaBlocks.DIVERTOR_CASING.getItemVariant(GADivertorCasing.CasingType.DIVERTOR_2, 4))
//                .buildAndRegister();
//
//        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().duration(100).EUt(8000000)
//                .input(frameGt, TungstenSteel, 16)
//                .input(plate, TungstenSteel, 64)
//                .input(plate, TitanSteel, 32)
//                .input(screw, LithiumTitanate, 64)
//                .inputs(ELECTRIC_PUMP_UIV.getStackForm())
//                .inputs(SENSOR_UIV.getStackForm())
//                .inputs(GCYSMetaBlocks.FUSION_CASING.getItemVariant(GAFusionCasing.CasingType.ADV_FUSION_CASING, 8))
//                .fluidInputs(SolderingAlloy.getFluid(5660))
//                .outputs(GCYSMetaBlocks.DIVERTOR_CASING.getItemVariant(GADivertorCasing.CasingType.DIVERTOR_3, 4))
//                .buildAndRegister();
//
//        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().duration(100).EUt(500000)
//                .input(frameGt, StainlessSteel, 8)
//                .input(plate, StainlessSteel, 32)
//                .input(pipeTinyFluid, Copper, 64)
//                .input(screw, LithiumTitanate, 16)
//                .inputs(ELECTRIC_PUMP_UHV.getStackForm())
//                .inputs(SENSOR_UHV.getStackForm())
//                .inputs(GCYSMetaBlocks.FUSION_CASING.getItemVariant(GAFusionCasing.CasingType.ADV_FUSION_CASING))
//                .fluidInputs(SolderingAlloy.getFluid(1440))
//                .outputs(GCYSMetaBlocks.VACUUM_CASING.getItemVariant(GAVacuumCasing.CasingType.VACUUM_1, 4))
//                .buildAndRegister();
//
//        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().duration(100).EUt(2000000)
//                .input(frameGt, StainlessSteel, 16)
//                .input(plate, StainlessSteel, 64)
//                .input(pipeTinyFluid, Copper, 64)
//                .input(pipeTinyFluid, Copper, 64)
//                .input(screw, LithiumTitanate, 32)
//                .inputs(ELECTRIC_PUMP_UEV.getStackForm())
//                .inputs(SENSOR_UEV.getStackForm())
//                .inputs(GCYSMetaBlocks.FUSION_CASING.getItemVariant(GAFusionCasing.CasingType.ADV_FUSION_CASING, 4))
//                .fluidInputs(SolderingAlloy.getFluid(2880))
//                .outputs(GCYSMetaBlocks.VACUUM_CASING.getItemVariant(GAVacuumCasing.CasingType.VACUUM_2, 4))
//                .buildAndRegister();
//
//        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().duration(100).EUt(8000000)
//                .input(frameGt, StainlessSteel, 32)
//                .input(plate, StainlessSteel, 64)
//                .input(plate, StainlessSteel, 64)
//                .input(pipeTinyFluid, Copper, 64)
//                .input(pipeTinyFluid, Copper, 64)
//                .input(pipeTinyFluid, Copper, 64)
//                .input(pipeTinyFluid, Copper, 64)
//                .input(screw, LithiumTitanate, 64)
//                .inputs(ELECTRIC_PUMP_UIV.getStackForm())
//                .inputs(SENSOR_UIV.getStackForm())
//                .inputs(GCYSMetaBlocks.FUSION_CASING.getItemVariant(GAFusionCasing.CasingType.ADV_FUSION_CASING, 8))
//                .fluidInputs(SolderingAlloy.getFluid(5660))
//                .outputs(GCYSMetaBlocks.VACUUM_CASING.getItemVariant(GAVacuumCasing.CasingType.VACUUM_3, 4))
//                .buildAndRegister();
//
//        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().duration(100).EUt(500000)
//                .input(frameGt, StainlessSteel, 8)
//                .input(plate, Titanium, 32)
//                .input(pipeTinyFluid, Copper, 64)
//                .input(screw, LithiumTitanate, 16)
//                .inputs(ELECTRIC_PUMP_UHV.getStackForm())
//                .inputs(SENSOR_UHV.getStackForm())
//                .inputs(GCYSMetaBlocks.FUSION_CASING.getItemVariant(GAFusionCasing.CasingType.ADV_FUSION_CASING))
//                .fluidInputs(SolderingAlloy.getFluid(1440))
//                .outputs(GCYSMetaBlocks.CRYOSTAT_CASING.getItemVariant(GACryostatCasing.CasingType.CRYOSTAT_1, 4))
//                .buildAndRegister();
//
//        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().duration(100).EUt(2000000)
//                .input(frameGt, StainlessSteel, 16)
//                .input(plate, Nitinol60, 32)
//                .input(pipeTinyFluid, Copper, 64)
//                .input(pipeTinyFluid, Copper, 64)
//                .input(screw, LithiumTitanate, 32)
//                .inputs(ELECTRIC_PUMP_UEV.getStackForm())
//                .inputs(SENSOR_UEV.getStackForm())
//                .inputs(GCYSMetaBlocks.FUSION_CASING.getItemVariant(GAFusionCasing.CasingType.ADV_FUSION_CASING, 4))
//                .fluidInputs(SolderingAlloy.getFluid(2880))
//                .outputs(GCYSMetaBlocks.CRYOSTAT_CASING.getItemVariant(GACryostatCasing.CasingType.CRYOSTAT_2, 4))
//                .buildAndRegister();
//
//        RecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().duration(100).EUt(8000000)
//                .input(frameGt, StainlessSteel, 32)
//                .input(plate, TungstenTitaniumCarbide, 32)
//                .input(plate, TungstenTitaniumCarbide, 32)
//                .input(pipeTinyFluid, Copper, 64)
//                .input(pipeTinyFluid, Copper, 64)
//                .input(pipeTinyFluid, Copper, 64)
//                .input(pipeTinyFluid, Copper, 64)
//                .input(screw, LithiumTitanate, 64)
//                .inputs(ELECTRIC_PUMP_UIV.getStackForm())
//                .inputs(SENSOR_UIV.getStackForm())
//                .inputs(GCYSMetaBlocks.FUSION_CASING.getItemVariant(GAFusionCasing.CasingType.ADV_FUSION_CASING, 8))
//                .fluidInputs(SolderingAlloy.getFluid(5760))
//                .outputs(GCYSMetaBlocks.CRYOSTAT_CASING.getItemVariant(GACryostatCasing.CasingType.CRYOSTAT_3, 4))
//                .buildAndRegister();
//
//        ASSEMBLER_RECIPES.recipeBuilder().EUt(500000)
//                .inputs(GCYSMetaBlocks.FUSION_CASING.getItemVariant(GAFusionCasing.CasingType.FUSION_3))
//                .input(plate, TantalumHafniumSeaborgiumCarbide, 6)
//                .outputs(GCYSMetaBlocks.FUSION_CASING.getItemVariant(GAFusionCasing.CasingType.ADV_FUSION_CASING))
//                .duration(50)
//                .buildAndRegister();
//
//        ASSEMBLER_RECIPES.recipeBuilder().EUt(500000).duration(50)
//                .fluidInputs(SolderingAlloy.getFluid(576))
//                .input(plate, TungstenTitaniumCarbide, 4)
//                .input(frameGt, TungstenTitaniumCarbide)
//                .input(pipeSmallFluid, Zeron100, 4)
//                .outputs(GCYSMetaBlocks.FUSION_CASING.getItemVariant(GAFusionCasing.CasingType.BLANKET_BASE))
//                .buildAndRegister();
//
//        ASSEMBLER_RECIPES.recipeBuilder().EUt(500000).duration(50)
//                .fluidInputs(SolderingAlloy.getFluid(288))
//                .input(plate, Beryllium, 16)
//                .input(plateDense, Copper, 2)
//                .input(plateDense, StainlessSteel, 2)
//                .inputs(GCYSMetaBlocks.FUSION_CASING.getItemVariant(GAFusionCasing.CasingType.BLANKET_BASE))
//                .outputs(GCYSMetaBlocks.FUSION_CASING.getItemVariant(GAFusionCasing.CasingType.FUSION_BLANKET))
//                .buildAndRegister();
//
//        ASSEMBLER_RECIPES.recipeBuilder().EUt(500000).duration(50)
//                .fluidInputs(SolderingAlloy.getFluid(288))
//                .input(plate, LithiumTitanate, 4)
//                .input(plateDense, Copper, 2)
//                .input(plateDense, StainlessSteel, 2)
//                .inputs(GCYSMetaBlocks.FUSION_CASING.getItemVariant(GAFusionCasing.CasingType.BLANKET_BASE))
//                .outputs(GCYSMetaBlocks.FUSION_CASING.getItemVariant(GAFusionCasing.CasingType.BREEDING_BLANKET))
//                .buildAndRegister();
    }
}
