import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.waypoints.WayPointsInclusionModule;
import com.jwebmp.plugins.waypoints.WayPointsPageConfigurator;

module com.jwebmp.plugins.waypoints {
    requires transitive com.jwebmp.core.base.angular.client;
    requires com.jwebmp.client;
    requires com.jwebmp.core;

    exports com.jwebmp.plugins.waypoints;

    provides IPageConfigurator with WayPointsPageConfigurator;
    provides com.guicedee.client.services.config.IGuiceScanModuleInclusions with WayPointsInclusionModule;

    opens com.jwebmp.plugins.waypoints to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
}
