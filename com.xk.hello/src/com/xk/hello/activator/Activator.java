/**
 * 
 */
package com.xk.hello.activator;

import java.util.ArrayList;
import java.util.List;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.xk.hello.Hello;
import com.xk.hello.impl.HelloImpl;

/**
 * @author Hasan
 * @date 2016Äê5ÔÂ4ÈÕ
 */
public class Activator implements BundleActivator {
	private List<ServiceRegistration> registrations = new ArrayList<ServiceRegistration>();

	public void start(BundleContext ctx) {
		registrations.add(ctx.registerService(Hello.class.getName(), new HelloImpl("Hello, OSGi"), null));
	}

	public void stop(BundleContext ctx) {
		for (ServiceRegistration registration : registrations) {
			System.out.println("unregistering: " + registration);
			registration.unregister();
		}
	}
}