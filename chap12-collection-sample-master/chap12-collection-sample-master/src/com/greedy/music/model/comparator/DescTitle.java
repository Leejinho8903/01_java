package com.greedy.music.model.comparator;

import java.util.Comparator;

import com.greedy.music.model.dto.MusicDTO;

public class DescTitle implements Comparator<MusicDTO> {

	@Override
	public int compare(MusicDTO o1, MusicDTO o2) {
		return -o1.getTitle().compareTo(o2.getTitle());
	}

}
