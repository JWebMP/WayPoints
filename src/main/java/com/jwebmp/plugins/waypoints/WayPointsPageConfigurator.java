/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.waypoints;

import com.jwebmp.core.*;
import com.jwebmp.core.base.angular.client.annotations.angularconfig.*;
import com.jwebmp.core.base.angular.client.annotations.typescript.*;
import com.jwebmp.core.plugins.*;
import com.jwebmp.core.services.*;
import jakarta.validation.constraints.*;

/**
 * The 3 meta tags *must* come first in the head; any other head content must come *after* these tags
 * <p>
 * HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries WARNING: Respond.js doesn't work if you view the page via
 * file://
 */
@PluginInformation(pluginName = "JQuery WayPoints",
		pluginDescription = "Waypoints is a library that makes it easy to execute a function whenever you scroll to an element.",
		pluginUniqueName = "waypoints",
		pluginVersion = "4.0.1",
		pluginCategories = "waypoints,ui,web ui, framework",
		pluginSubtitle = "Waypoints is a library that makes it easy to execute a function whenever you scroll to an element.",
		pluginSourceUrl = "https://github.com/imakewebthings/waypoints.git",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-JQueryWayPoints/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-JQueryWayPoints",
		pluginIconUrl = "bower_components/waypoints/waypointsicon.jpg",
		pluginIconImageUrl = "bower_components/waypoints/waypointslogo.jpg",
		pluginOriginalHomepage = "https://github.com/imakewebthings/waypoints.git",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.jquery/jwebmp-jquery-waypoints",
		pluginGroupId = "com.jwebmp.plugins.jquery",
		pluginArtifactId = "jwebmp-jquery-waypoints",
		pluginModuleName = "com.jwebmp.plugins.waypoints",
		pluginStatus = PluginStatus.Released
)
@TsDependency(value = "waypoints", version = "^4.0.1")
@NgScript("node_modules/waypoints/lib/jquery.waypoints.js")
public class WayPointsPageConfigurator
		implements IPageConfigurator<WayPointsPageConfigurator>
{
	
	/**
	 * The 3 meta tags *must* come first in the head; any other head content must come *after* these tags
	 * <p>
	 * HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries WARNING: Respond.js doesn't work if you view the page
	 * via file://
	 *
	 * @return
	 */
	@NotNull
	@Override
	public Page<?> configure(Page<?> page)
	{

		return page;
	}
	
	@Override
	public boolean enabled()
	{
		return true;
	}
	
}
