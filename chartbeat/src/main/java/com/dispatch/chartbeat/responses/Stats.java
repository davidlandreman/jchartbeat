package com.dispatch.chartbeat.responses;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author David Landreman
 *
 */
public class Stats {

	@SerializedName("enaged_visit")
	private Stat engagedVisit;

	@SerializedName("enaged_time")
	private Stat engagedTime;
	
	@SerializedName("writing_visit")
	private Stat writingVisit;
	
	@SerializedName("domload")
	private Stat documentLoad;
	
	@SerializedName("scroll")
	private Stat documentScroll;
	
	@SerializedName("links")
	private int links;
	
	@SerializedName("people")
	private int people;
	
	@SerializedName("read")
	private int read;
	
	@SerializedName("direct")
	private int direct;
	
	@SerializedName("visits")
	private int visits;
	
	@SerializedName("search")
	private int search;
	
	@SerializedName("crowd")
	private int crowd;
	
	@SerializedName("num_refs")
	private int numberOfReferrals;
	
	@SerializedName("idle")
	private int idle;
	
	@SerializedName("internal")
	private int internalReferrals;
	
	@SerializedName("social")
	private int socialReferrals;

	@SerializedName("new")
	private int newReferrals;
	
	public Stat getEngagedVisit() {
		return engagedVisit;
	}

	public void setEngagedVisit(Stat engagedVisit) {
		this.engagedVisit = engagedVisit;
	}

	public Stat getEngagedTime() {
		return engagedTime;
	}

	public void setEngagedTime(Stat engagedTime) {
		this.engagedTime = engagedTime;
	}

	public Stat getWritingVisit() {
		return writingVisit;
	}

	public void setWritingVisit(Stat writingVisit) {
		this.writingVisit = writingVisit;
	}
	
	public Stat getDocumentLoad() {
		return documentLoad;
	}

	public void setDocumentLoad(Stat documentLoad) {
		this.documentLoad = documentLoad;
	}

	public Stat getDocumentScroll() {
		return documentScroll;
	}

	public void setDocumentScroll(Stat documentScroll) {
		this.documentScroll = documentScroll;
	}

	public int getLinks() {
		return links;
	}

	public void setLinks(int links) {
		this.links = links;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	public int getRead() {
		return read;
	}

	public void setRead(int read) {
		this.read = read;
	}

	public int getDirect() {
		return direct;
	}

	public void setDirect(int direct) {
		this.direct = direct;
	}

	public int getVisits() {
		return visits;
	}

	public void setVisits(int visits) {
		this.visits = visits;
	}

	public int getSearch() {
		return search;
	}

	public void setSearch(int search) {
		this.search = search;
	}

	public int getCrowd() {
		return crowd;
	}

	public void setCrowd(int crowd) {
		this.crowd = crowd;
	}

	public int getNumberOfReferrals() {
		return numberOfReferrals;
	}

	public void setNumberOfReferrals(int numberOfReferrals) {
		this.numberOfReferrals = numberOfReferrals;
	}

	public int getIdle() {
		return idle;
	}

	public void setIdle(int idle) {
		this.idle = idle;
	}

	public int getInternalReferrals() {
		return internalReferrals;
	}

	public void setInternalReferrals(int internalReferrals) {
		this.internalReferrals = internalReferrals;
	}

	public int getSocialReferrals() {
		return socialReferrals;
	}

	public void setSocialReferrals(int socialReferrals) {
		this.socialReferrals = socialReferrals;
	}

	public int getNewReferrals() {
		return newReferrals;
	}

	public void setNewReferrals(int newReferrals) {
		this.newReferrals = newReferrals;
	}
	
}
