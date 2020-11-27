import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.waypoints.WayPointsPageConfigurator;

module com.jwebmp.plugins.waypoints {
	requires transitive com.jwebmp.core;

	exports com.jwebmp.plugins.waypoints;

	provides IPageConfigurator with WayPointsPageConfigurator;

	opens com.jwebmp.plugins.waypoints to com.google.guice;
}
