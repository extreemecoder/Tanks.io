package com.extreemecoder.tanks.level.tile;

import com.extreemecoder.tanks.graphics.Screen;
import com.extreemecoder.tanks.graphics.Sprite;

public class GrassTile extends Tile {

	public GrassTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}

}
