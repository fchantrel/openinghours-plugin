/**
 * 
 */
package org.elasticsearch.plugin.openinghours;

import org.elasticsearch.plugins.Plugin;

/**
 * @author fchantrel
 *
 */
public class OpeninghoursPlugin extends Plugin {

	/* (non-Javadoc)
	 * @see org.elasticsearch.plugins.Plugin#description()
	 */
	@Override
	public String description() {
		return "Openinghours Plugin for Elasticsearch.";
	}

	/* (non-Javadoc)
	 * @see org.elasticsearch.plugins.Plugin#name()
	 */
	@Override
	public String name() {
		return "openinghours-plugin";
	}

}
