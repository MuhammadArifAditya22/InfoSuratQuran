package com.example.tugas4_infosurat.InfoSurah;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("chapters")
	private List<ChaptersItem> chapters;

	public List<ChaptersItem> getChapters(){
		return chapters;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"chapters = '" + chapters + '\'' + 
			"}";
		}
}