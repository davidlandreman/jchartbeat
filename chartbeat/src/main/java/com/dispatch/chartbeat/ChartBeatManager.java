package com.dispatch.chartbeat;

import java.lang.reflect.Type;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dispatch.chartbeat.exceptions.ChartBeatBadStatusException;
import com.dispatch.chartbeat.exceptions.ChartBeatException;
import com.dispatch.chartbeat.responses.Pages;
import com.dispatch.chartbeat.responses.Recent;
import com.dispatch.chartbeat.responses.Stats;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * Singleton class to access the ChartBeat API
 * 
 * @author David Landreman
 * 
 */
public class ChartBeatManager {

	/** Logging for this class */
	private static final Log LOG = LogFactory.getLog(ChartBeatManager.class);

	/** Singleton instance for this class */
	private static ChartBeatManager INSTANCE = null;

	/** The Endpoint for the Top Pages API Call */
	protected static final String TOP_PAGES_ENDPOINT = "/live/toppages";

	/** The Endpoint for the Quick Stats API Call */
	protected static final String QUICK_STATS_ENDPOINT = "/live/quickstats";

	/** The Endpoint for the Recent Visitors API Call */
	protected static final String RECENT_VISITORS_ENDPOINT = "/live/recent";

	public static ChartBeatManager getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ChartBeatManager();
		}
		return INSTANCE;
	}

	/** The Chartbeat API Key to use */
	private String m_apiKey;

	/** The Chartbeat API Connector to use */
	private ChartBeatApiConnector m_apiConnector;

	/** The Json to POJO Serializer to user */
	private Gson m_gson;

	protected ChartBeatApiConnector getApiConnector() {
		return m_apiConnector;
	}

	protected void setApiConnector(ChartBeatApiConnector m_apiConnector) {
		this.m_apiConnector = m_apiConnector;
	}

	public String getApiKey() {
		return m_apiKey;
	}

	public void setApiKey(String m_apiKey) {
		this.m_apiKey = m_apiKey;
	}

	public Gson getGson() {
		return m_gson;
	}

	public void setGson(Gson m_gson) {
		this.m_gson = m_gson;
	}

	/**
	 * Private Constructor
	 */
	private ChartBeatManager() {
		if (LOG.isDebugEnabled()) {
			LOG.debug("Starting ChartBeat Manager");
		}
		this.setGson(new Gson());
		this.setApiConnector(new ChartBeatApiConnector());
		this.setApiKey("");
	}

	/**
	 * Get the top pages for a given host nameS
	 * 
	 * @param hostName
	 *            The hostname to get the TopPages listings for
	 * @throws ChartBeatException
	 */
	public Pages getTopPages(String hostName) throws ChartBeatException {

		// Create Chartbeat Request
		ChartBeatRequest request = new ChartBeatRequest();
		request.setApiKey(this.getApiKey());
		request.setHost(hostName);
		request.setVersion(3);
		request.setUrl(TOP_PAGES_ENDPOINT);

		// Make Request to ChartBeat
		String result = this.getApiConnector().sendGetRequest(request);

		// Process and return JSON pages object
		Gson gson = new Gson();
		Pages pages = gson.fromJson(result, Pages.class);
		return pages;
	}

	/**
	 * Get quick stats for a single path on the given site
	 * 
	 * @param hostName
	 *            The site to get stats for
	 * @param path
	 *            The path to get stats for
	 * @return A stats object for the path
	 * @throws ChartBeatBadStatusException
	 */
	public Stats getQuickStats(String hostName, String path)
			throws ChartBeatBadStatusException {

		// Create Chartbeat Request
		ChartBeatRequest request = new ChartBeatRequest();
		request.setApiKey(this.getApiKey());
		request.setHost(hostName);
		request.setVersion(3);
		request.setPath(path);
		request.setUrl(QUICK_STATS_ENDPOINT);

		// Make Request to ChartBeat
		String result = this.getApiConnector().sendGetRequest(request);

		// Process and return JSON pages object
		Gson gson = new Gson();
		Stats stats = gson.fromJson(result, Stats.class);
		return stats;
	}

	/**
	 * Get recent visitors
	 * 
	 * @param hostName
	 *            The site to get recent visitors for
	 * @param path
	 *            The path to get recent visitors for
	 * @return List of recent visitors
	 * @throws ChartBeatBadStatusException
	 */
	public List<Recent> getRecentVisitors(String hostName, String path)
			throws ChartBeatBadStatusException {

		// Create Chartbeat Request
		ChartBeatRequest request = new ChartBeatRequest();
		request.setApiKey(this.getApiKey());
		request.setHost(hostName);
		request.setVersion(3);
		request.setPath(path);
		request.setUrl(RECENT_VISITORS_ENDPOINT);

		// Make Request to ChartBeat
		String result = this.getApiConnector().sendGetRequest(request);

		// Process and return JSON pages object
		Gson gson = new Gson();
		Type listOfRecentVisits = new TypeToken<List<Recent>>() {
		}.getType();
		List<Recent> recentVisits = gson.fromJson(result, listOfRecentVisits);
		return recentVisits;
	}

}
