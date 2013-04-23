package com.dispatch.chartbeat;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dispatch.chartbeat.exceptions.ChartBeatBadStatusException;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * 
 * @author David Landreman
 * 
 */
public class ChartBeatApiConnector {

	/** Logging for this class */
	private static final Log LOG = LogFactory
			.getLog(ChartBeatApiConnector.class);

	/** Host Name Parameter */
	protected static final String HOST_NAME_PARAM = "host";

	/** API Key Parameter */
	protected static final String API_KEY_PARAM = "apikey";

	/** Path Parameter */
	protected static final String PATH_PARAM = "path";

	/** The Hostname for the ChartBeat API */
	private static final String CHART_BEAT_HOSTNAME = "http://api.chartbeat.com";

	/**
	 * 
	 * @param url
	 * @return
	 * @throws ChartBeatBadStatusException
	 */
	protected String sendGetRequest(ChartBeatRequest request)
			throws ChartBeatBadStatusException {

		// TODO Validate Request Object

		// Create a web resource from a ChartBeat request Object
		WebResource webResource = this.createWebResource(request);

		// Make a get call to the web resource
		ClientResponse response = webResource.accept("application/json").get(
				ClientResponse.class);

		// Check for return status on the web resource
		if (response.getStatus() != 200) {
			throw new ChartBeatBadStatusException(
					"Failiure status code returned: " + response.getStatus());
		}

		// Return the result of the request
		String output = response.getEntity(String.class);
		return output;

	}

	/**
	 * Build a Web Resource from a ChartBeat request object
	 * 
	 * @param request
	 *            The request to use to build the URL
	 * @return A Web Resource object equivalent to the chartbeat request
	 */
	protected WebResource createWebResource(ChartBeatRequest request) {

		// Build ChartBeat URL accounting for version number
		String url = CHART_BEAT_HOSTNAME + request.getUrl();
		if (!url.endsWith("/")) {
			url = url + "/";
		}
		if (request.getVersion() > 1) {
			url = url + "v" + request.getVersion() + "/";
		}

		// Create Web Resource for URL
		Client client = Client.create();
		WebResource webResource = client.resource(url);

		// Set Host and ApiKey Query Params
		webResource = webResource
				.queryParam(HOST_NAME_PARAM, request.getHost()).queryParam(
						API_KEY_PARAM, request.getApiKey());

		// Add Path param if set
		if (!"".equals(request.getPath())) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("Adding Path Parameter: " + request.getPath());
			}
			webResource.queryParam(PATH_PARAM, request.getPath());
		}

		// Returning the constructed web resource
		return webResource;
	}
}
