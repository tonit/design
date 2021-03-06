package org.osgi.cdi.examples.component;

import java.util.Optional;

import javax.inject.Inject;

import org.osgi.cdi.examples.Foo;
import org.osgi.service.cdi.annotations.Component;
import org.osgi.service.cdi.annotations.Greedy;
import org.osgi.service.cdi.annotations.Reference;

/*
 * A component with optional, static, greedy reference.
 */

@Component
public class CR6 {

	@Inject
	public CR6(@Greedy @Reference Optional<Foo> foo) {
		// stub
	}

	@Inject
	void foo(@Greedy @Reference Optional<Foo> foo) {
		// stub
	}

	@Inject
	@Reference
	@Greedy
	Optional<Foo> foo;

}
