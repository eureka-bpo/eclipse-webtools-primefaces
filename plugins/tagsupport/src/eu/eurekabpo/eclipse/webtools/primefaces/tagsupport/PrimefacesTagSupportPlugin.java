package eu.eurekabpo.eclipse.webtools.primefaces.tagsupport;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class PrimefacesTagSupportPlugin extends AbstractUIPlugin {

	/**
	 * the plugin id
	 */
	public static final String PLUGIN_ID = "eu.eureka-bpo.eclipse.webtools.primefaces.tagsupport"; //$NON-NLS-1$

	// The shared instance
	private static PrimefacesTagSupportPlugin plugin;
	
	/**
	 * The constructor
	 */
	public PrimefacesTagSupportPlugin() {
        // do nothing
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static PrimefacesTagSupportPlugin getDefault() {
		return plugin;
	}

}
