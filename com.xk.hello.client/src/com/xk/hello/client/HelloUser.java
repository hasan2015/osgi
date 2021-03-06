package com.xk.hello.client;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.xk.hello.Hello;

public class HelloUser implements BundleActivator {
	public void start(BundleContext ctx) {
		ServiceReference ref = ctx.getServiceReference(Hello.class.getName());
		if (ref != null) {
			Hello hello = null;
			try {
				hello = (Hello) ctx.getService(ref);
				if (hello != null)
					hello.sayHello();
				else
					System.out.println("Service:Hello---object null");
			} catch (RuntimeException e) {
				e.printStackTrace();
			} finally {
				ctx.ungetService(ref);
				hello = null;
			}
		} else {
			System.out.println("Service:Hello---not exists");
		}
	}

	public void stop(BundleContext ctx) throws Exception {

	}
}
