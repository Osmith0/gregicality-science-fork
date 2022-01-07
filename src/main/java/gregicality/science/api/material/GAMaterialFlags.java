package gregicality.science.api.material;

import gregtech.api.unification.material.info.MaterialFlag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static gregtech.api.unification.material.info.MaterialFlags.*;

public class GAMaterialFlags {

    public static final List<MaterialFlag> GA_STD_METAL = new ArrayList<>();
    public static final List<MaterialFlag> GA_EXT2_METAL = new ArrayList<>();
    public static final List<MaterialFlag> GA_CORE_METAL = new ArrayList<>();

    static {
        GA_STD_METAL.add(GENERATE_PLATE);

        GA_EXT2_METAL.addAll(GA_STD_METAL);
        GA_EXT2_METAL.addAll(Arrays.asList(GENERATE_DENSE, GENERATE_ROD, GENERATE_BOLT_SCREW, GENERATE_GEAR, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_LONG_ROD));

        GA_CORE_METAL.addAll(GA_EXT2_METAL);
        GA_CORE_METAL.addAll(Arrays.asList(GENERATE_RING, GENERATE_FRAME, GENERATE_ROTOR, GENERATE_SMALL_GEAR));
    }
}