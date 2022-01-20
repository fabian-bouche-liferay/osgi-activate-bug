package com.liferay.samples.fbo.alpha;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		service = Counter.class
		)
public class Counter {

	private long count;
	
	@Activate
	public void activate() {
		this.count = 0;
	}
	
	public long increment() {
		count++;
		return count;
	}
	
}
