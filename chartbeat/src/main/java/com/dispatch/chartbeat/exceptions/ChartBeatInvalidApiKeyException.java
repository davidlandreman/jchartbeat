package com.dispatch.chartbeat.exceptions;

/**
 * Exception thrown when no API key or an invalid API key is specified
 * 
 * @author David Landreman
 * 
 */
public class ChartBeatInvalidApiKeyException extends ChartBeatException {

	private static final long serialVersionUID = 4501774333932405222L;
	
	public ChartBeatInvalidApiKeyException(String string) {
		super(string);
	}

}
