import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.waypoints.WayPointsInclusionModule;
import com.jwebmp.plugins.waypoints.WayPointsPageConfigurator;

module com.jwebmp.plugins.waypoints {
    requires transitive com.jwebmp.core.base.angular.client;
    requires com.jwebmp.client;
    requires com.jwebmp.plugins.jquery;

    exports com.jwebmp.plugins.waypoints;

    provides IPageConfigurator with WayPointsPageConfigurator;
    provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with WayPointsInclusionModule;

    opens com.jwebmp.plugins.waypoints to com.google.guice;
}
