package com.greedy.music.model.dto;

public class MusicDTO {
	
	private String artist;
	private String title;

	public MusicDTO() {}

	public MusicDTO(String artist, String title) {
		this.artist = artist;
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "MusicDTO [artist=" + artist + ", title=" + title + "]";
	}

}
