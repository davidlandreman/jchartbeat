package com.dispatch.chartbeat;


/**
 * Class representing a request to make off to ChartBeat
 * 
 * @author David Landreman
 * 
 */
public class ChartBeatRequest {

	/** The Relative URL endpoint for the API call on ChartBeat */
	private String m_url;
	
	/** The version of the API being accessed */
	private int m_version;
	
	/** The host domain to get information for */
	private String m_host;
	
	/** The ChartBeat API key */
	private String m_apiKey;

	/** The path to get information about */
	private String m_path;
	
	public String getUrl() {
		return m_url;
	}
	public void setUrl(String m_url) {
		this.m_url = m_url;
	}
	public int getVersion() {
		return m_version;
	}
	public void setVersion(int m_version) {
		this.m_version = m_version;
	}
	public String getHost() {
		return m_host;
	}
	public void setHost(String m_host) {
		this.m_host = m_host;
	}
	public String getApiKey() {
		return m_apiKey;
	}
	public void setApiKey(String m_apiKey) {
		this.m_apiKey = m_apiKey;
	}
	
	public ChartBeatRequest() {
		this.setUrl("");
		this.setHost("");
		this.setApiKey("");
		this.setVersion(1);
		this.setPath("");
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ChartBeatRequest [m_url=");
		builder.append(m_url);
		builder.append(", m_version=");
		builder.append(m_version);
		builder.append(", m_host=");
		builder.append(m_host);
		builder.append(", m_apiKey=");
		builder.append(m_apiKey);
		builder.append("]");
		return builder.toString();
	}
	public String getPath() {
		return m_path;
	}
	public void setPath(String m_path) {
		this.m_path = m_path;
	}

}
