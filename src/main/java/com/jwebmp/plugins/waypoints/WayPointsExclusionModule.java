package com.jwebmp.plugins.waypoints;

import com.guicedee.client.services.config.IGuiceScanModuleExclusions;
import com.guicedee.client.services.config.IGuiceScanJarExclusions;
import java.util.LinkedHashSet;
import java.util.Set;

/** SPI services and direct resource access do not require scanning this library. */
public class WayPointsExclusionModule implements IGuiceScanModuleExclusions<WayPointsExclusionModule>, IGuiceScanJarExclusions<WayPointsExclusionModule> {
    @Override public Set<String> excludeModules() { return Set.of("com.jwebmp.plugins.waypoints"); }
    @Override public Set<String> excludeJars() {
        Set<String> jars = new LinkedHashSet<>();
        jars.add("waypoints.jar");
        for (int digit = 0; digit <= 9; digit++) jars.add("waypoints-" + digit + "*.jar");
        return jars;
    }
}
