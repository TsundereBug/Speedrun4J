package com.tsunderebug.speedrun4j.game;

import com.google.gson.annotations.SerializedName;
import com.tsunderebug.speedrun4j.data.Asset;

public class GameAssets {

	private Asset logo;
	@SerializedName("cover-tiny") private Asset coverTiny;
	@SerializedName("cover-small") private Asset coverSmall;
	@SerializedName("cover-medium") private Asset coverMedium;
	@SerializedName("cover-large") private Asset coverLarge;
	private Asset icon;
	@SerializedName("trophy-1st") private Asset trophyFirst;
	@SerializedName("trophy-2nd") private Asset trophySecond;
	@SerializedName("trophy-3rd") private Asset trophyThird;
	@SerializedName("trophy-4th") private Asset trophyFourth;
	private Asset background;
	private Asset foreground;

}
