package com.dispatch.chartbeat.responses;

import java.util.List;

import com.google.gson.annotations.SerializedName;


/**
 * 
 * @author David Landreman
 *
 */
public class Pages {

	@SerializedName("pages")
	List<Page> pages;

	public List<Page> getPages() {
		return pages;
	}

	public void setPages(List<Page> pages) {
		this.pages = pages;
	}
	
}
