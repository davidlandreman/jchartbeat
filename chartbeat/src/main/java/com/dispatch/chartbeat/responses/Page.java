package com.dispatch.chartbeat.responses;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author David Landreman
 *
 */
public class Page {

	@SerializedName("path")
	private String path;
	
	@SerializedName("title")
	private String title;
	
	@SerializedName("stats")
	private Stats stats;
	
	@SerializedName("authors")
	private List<String> authors;
	
	@SerializedName("sections")
	private List<String> sections;
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Stats getStats() {
		return stats;
	}
	public void setStats(Stats stats) {
		this.stats = stats;
	}
	
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public List<String> getSections() {
		return sections;
	}
	public void setSections(List<String> sections) {
		this.sections = sections;
	}
	
}
