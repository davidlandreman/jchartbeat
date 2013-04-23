package com.dispatch.chartbeat.responses;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author David Landreman
 *
 */
public class Recent {

	@SerializedName("domain")
	private String domain;

	@SerializedName("uid")
	private String uid;
	
	@SerializedName("time_spent")
	private double timeSpent;
	
	@SerializedName("engaged_sec")
	private long engagedSeconds;
	
	@SerializedName("pagetimer")
	private long timeOnPage;
	
	@SerializedName("title")
	private String title;
	
	@SerializedName("token")
	private String token;
	
	@SerializedName("platform")
	private String platform;
	
	@SerializedName("internal_referrer")
	private String internalReferrer;
	
	@SerializedName("user_agent")
	private String userAgent;
	
	@SerializedName("scroll_top")
	private long scrollTop;
	
	@SerializedName("window_height")
	private String windowHeight;
	
	@SerializedName("ip_address")
	private String ipAddress;
	
	@SerializedName("host")
	private String host;
	
	@SerializedName("path")
	private String path;
	
	@SerializedName("utc")
	private long time;
	
	@SerializedName("country")
	private String country;
	
	@SerializedName("region")
	private String region;
	
	@SerializedName("idle")
	private int idle;
	
	@SerializedName("os")
	private String operatingSystem;
	
	@SerializedName("browser")
	private String browser;
	
	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public double getTimeSpent() {
		return timeSpent;
	}

	public void setTimeSpent(double timeSpent) {
		this.timeSpent = timeSpent;
	}

	public long getEngagedSeconds() {
		return engagedSeconds;
	}

	public void setEngagedSeconds(long engagedSeconds) {
		this.engagedSeconds = engagedSeconds;
	}

	public long getTimeOnPage() {
		return timeOnPage;
	}

	public void setTimeOnPage(long timeOnPage) {
		this.timeOnPage = timeOnPage;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getInternalReferrer() {
		return internalReferrer;
	}

	public void setInternalReferrer(String internalReferrer) {
		this.internalReferrer = internalReferrer;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public long getScrollTop() {
		return scrollTop;
	}

	public void setScrollTop(long scrollTop) {
		this.scrollTop = scrollTop;
	}

	public String getWindowHeight() {
		return windowHeight;
	}

	public void setWindowHeight(String windowHeight) {
		this.windowHeight = windowHeight;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getIdle() {
		return idle;
	}

	public void setIdle(int idle) {
		this.idle = idle;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}
	
}