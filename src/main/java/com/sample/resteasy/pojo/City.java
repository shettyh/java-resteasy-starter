package com.sample.resteasy.pojo;

/**
 * Simple JAVA Pojo
 * @author manjunathshetty
 *
 */
public class City {

	private String name;
	private String knownFor;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKnownFor() {
		return knownFor;
	}

	public void setKnownFor(String knownFor) {
		this.knownFor = knownFor;
	}

	@Override
	public String toString() {
		return this.getName() + ":" + this.getKnownFor();
	}

}
