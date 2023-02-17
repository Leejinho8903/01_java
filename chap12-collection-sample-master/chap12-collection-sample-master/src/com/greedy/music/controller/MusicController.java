package com.greedy.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.greedy.music.model.dto.MusicDTO;

public class MusicController {
	
	/* 음악 목록이 저장 되는 리스트 (아직은 DB에 저장할 수 없으므로 메모리 상에 저장) */
	private List<MusicDTO> musicList = new ArrayList<>();

	/* 곡 추가 */
	public void addList(MusicDTO music) {
		musicList.add(music);
	}

	/* 곡 전체 조회 */
	public List<MusicDTO> selectList() {
		return musicList;
	}

	/* 가수명 조회 */
	public List<MusicDTO> searchArtist(String artist) {
		/* 가수명을 검색해서 해당 키워드가 포함 되는 곡들을 리턴 받기 위한 리스트 */
		List<MusicDTO> searchList = new ArrayList<>();
		
		for(MusicDTO music : musicList) {
			/* String 클래스의 contains()는 equals()-일치여부 리턴-와 달리 해당 문자 포함 여부를 boolean 타입으로 리턴한다. */
			if(music.getArtist().contains(artist)) {
				searchList.add(music);
			}
		}
		return searchList;
	}
	
	/* 제목 조회 */
	public List<MusicDTO> searchTitle(String title) {
		/* 제목을 검색해서 해당 키워드가 포함 되는 곡들을 리턴 받기 위한 리스트 */
		List<MusicDTO> searchList = new ArrayList<>();
		
		for(MusicDTO music : musicList) {
			/* String 클래스의 contains()는 equals()-일치여부 리턴-와 달리 해당 문자 포함 여부를 boolean 타입으로 리턴한다. */
			if(music.getTitle().contains(title)) { 
				searchList.add(music);
			}
		}
		return searchList;
	}
	
	/* 곡 수정 - title 기준으로 조회해서 수정 */
	public int updateMusic(String title, MusicDTO updateMusic){
		MusicDTO old = null;
		for(int i = 0; i < musicList.size(); i++) {
			/* 곡명이 완벽하게 일치하는 객체를 대상으로 변경한다. */
			if(musicList.get(i).getTitle().equals(title)) {
				/* set() 메소드는 수정 전 oldValue를 반환한다. */
				old = musicList.set(i, updateMusic);
			}
		}
		/* oldValue가 반환 된 경우 result는 1, oldValue가 반환 되지 않은 경우 result는 0이다. */
		return old != null ? 1 : 0; 
	}

	/* 곡 삭제 - title 기준으로 조회해서 수정 */
	public int removeMusic(String title) {
		MusicDTO old = null;
		for(int i = 0; i < musicList.size(); i++) {
			/* 곡명이 완벽하게 일치하는 객체를 대상으로 삭제한다. */
			if(musicList.get(i).getTitle().equals(title)) {
				/* remove() 메소드는 삭제 전 oldValue를 반환한다. */
				old = musicList.remove(i);
			}
		}
		/* oldValue가 반환 된 경우 result는 1, oldValue가 반환 되지 않은 경우 result는 0이다. */
		return old != null ? 1 : 0; 
	}

	
}
