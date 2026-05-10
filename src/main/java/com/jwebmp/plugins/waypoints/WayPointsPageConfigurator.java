package com.jwebmp.plugins.waypoints;

import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgScript;
import com.jwebmp.core.base.angular.client.annotations.typescript.TsDependency;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;

/**
 * Waypoints is a library that makes it easy to execute a function whenever you scroll to an element.
 */
@PluginInformation(pluginName = "JQuery WayPoints",
                   pluginDescription = "Waypoints is a library that makes it easy to execute a function whenever you scroll to an element.",
                   pluginUniqueName = "waypoints",
                   pluginVersion = "4.0.1",
                   pluginCategories = "waypoints,ui,web ui, framework",
                   pluginSubtitle = "Waypoints is a library that makes it easy to execute a function whenever you scroll to an element.",
                   pluginSourceUrl = "https://github.com/imakewebthings/waypoints",
                   pluginWikiUrl = "https://github.com/JWebMP/WayPoints/wiki",
                   pluginGitUrl = "https://github.com/JWebMP/WayPoints",
                   pluginIconUrl = "",
                   pluginIconImageUrl = "",
                   pluginOriginalHomepage = "https://github.com/imakewebthings/waypoints",
                   pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins/waypoints",
                   pluginGroupId = "com.jwebmp.plugins",
                   pluginArtifactId = "waypoints",
                   pluginModuleName = "com.jwebmp.plugins.waypoints",
                   pluginStatus = PluginStatus.Released
)
@TsDependency(value = "waypoints", version = "^4.0.1")
@NgScript("node_modules/waypoints/lib/jquery.waypoints.js")
public class WayPointsPageConfigurator
        implements IPageConfigurator<WayPointsPageConfigurator>
{
    @Override
    public IPage<?> configure(IPage<?> page)
    {
        return page;
    }

    @Override
    public boolean enabled()
    {
        return true;
    }
}
