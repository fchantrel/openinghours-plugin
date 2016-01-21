/**
 * 
 */
package org.elasticsearch.plugin.rest;

import org.elasticsearch.common.inject.AbstractModule;

/**
 * @author fchantrel
 *
 */
public class ExampleRestModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(HelloRestHandler.class).asEagerSingleton();
	}
}