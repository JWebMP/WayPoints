package com.jwebmp.plugins.waypoints;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;

import java.util.HashSet;
import java.util.Set;

public class WayPointsInclusionModule implements IGuiceScanModuleInclusions<WayPointsInclusionModule>
{
    @Override
    public Set<String> includeModules()
    {
        Set<String> set = new HashSet<>();
        set.add("com.jwebmp.plugins.waypoints");
        return set;
    }
}
