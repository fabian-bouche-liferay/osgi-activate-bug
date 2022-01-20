package com.liferay.samples.fbo.alpha;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Fabian-Liferay
 */
@Component(immediate = true, service = Alpha.class)
public class Alpha {
	
	@Activate
	public void activate() {

		LOG.error("Starting Alpha");

		long count = counter.increment();
		
		LOG.error("Count {}", count);
		
		if(count == 1) {
			throw new RuntimeException("Not yet!");
		}
	}

	@Deactivate
	public void deactivate() {
		LOG.error("Stopping Alpha");
	}
	
	@Reference
	private Counter counter;
	
	private final static Logger LOG = LoggerFactory.getLogger(Alpha.class);
	
}