package gregicality.science.loaders.recipes.chain;

import net.minecraftforge.fluids.FluidStack;

import static gregicality.science.api.GCYSMaterials.*;
import static gregtech.api.recipes.RecipeMaps.CENTRIFUGE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.dust;

public class QuantumDotsChain {
    public static void init() { //todo

        FluidStack[] Oils = {SeedOil.getFluid(1000), FishOil.getFluid(1000)};
        for (FluidStack Oil : Oils) {
            CHEMICAL_RECIPES.recipeBuilder().duration(160).EUt(2000)
                    .fluidInputs(Oil)
                    .fluidInputs(Steam.getFluid(200))
                    .fluidInputs(PotassiumHydroxide.getFluid(1000))
                    .fluidOutputs(Soap.getFluid(1000))
                    .buildAndRegister();
        }

        CHEMICAL_RECIPES.recipeBuilder().duration(160).EUt(2000)
                .fluidInputs(Soap.getFluid(1000))
                .input(dust, Salt, 1)
                .fluidOutputs(Glycerol.getFluid(200))
                .fluidOutputs(DeglyceratedSoap.getFluid(800))
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder().duration(160).EUt(2000)
                .fluidInputs(DeglyceratedSoap.getFluid(1000))
                .output(dust, Salt, 1)
                .fluidOutputs(StearicAcid.getFluid(800))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().duration(160).EUt(2000) //3C8H18 + P -> 3H + C24H51P
                .fluidInputs(Octane.getFluid(3000))
                .input(dust, Phosphorus, 1)
                .fluidOutputs(Hydrogen.getFluid(3000))
                .fluidOutputs(Trioctylphosphine.getFluid(1000))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().duration(160).EUt(500000)
                .fluidInputs(Trioctylphosphine.getFluid(1000))
                .fluidInputs(StearicAcid.getFluid(1000))
                .input(dust, Selenium, 1)
                .input(dust, Cadmium, 1)
                .fluidOutputs(QuantumDots.getFluid(1000))
                .buildAndRegister();
    }
}