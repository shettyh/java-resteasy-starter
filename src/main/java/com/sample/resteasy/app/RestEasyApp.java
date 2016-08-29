package com.sample.resteasy.app;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.sample.resteasy.rest.TestResource;

/**
 * 
 * JAX-RS Application class
 * 
 * @author manjunathshetty
 *
 */
@ApplicationPath("ws")
public class RestEasyApp extends Application {

	/**
	 * Add the resources and return or you can add rest easy auto scan in web.xml to scan
	 * all the file for automatic resource discovery
	 */
	@Override
	public Set<Class<?>> getClasses() {
		return new HashSet<>(Arrays.asList(TestResource.class));
	}

}
