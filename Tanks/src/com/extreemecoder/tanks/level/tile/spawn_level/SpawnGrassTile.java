package com.extreemecoder.tanks.level.tile.spawn_level;

import com.extreemecoder.tanks.graphics.Screen;
import com.extreemecoder.tanks.graphics.Sprite;
import com.extreemecoder.tanks.level.tile.Tile;

public class SpawnGrassTile extends Tile {

	public SpawnGrassTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}

}
