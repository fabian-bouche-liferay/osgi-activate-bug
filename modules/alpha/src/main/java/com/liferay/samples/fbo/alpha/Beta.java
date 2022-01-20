package com.liferay.samples.fbo.alpha;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true, service = Beta.class)
public class Beta {

	@Reference
	private Alpha alpha;
	
	@Activate
	public void activate() {
		LOG.error("Starting Beta");
	}
	
	private final static Logger LOG = LoggerFactory.getLogger(Beta.class);
	
}
