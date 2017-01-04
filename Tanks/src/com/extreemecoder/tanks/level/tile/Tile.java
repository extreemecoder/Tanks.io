package com.extreemecoder.tanks.level.tile;

import com.extreemecoder.tanks.graphics.Screen;
import com.extreemecoder.tanks.graphics.Sprite;
import com.extreemecoder.tanks.level.tile.spawn_level.SpawnFloorTile;
import com.extreemecoder.tanks.level.tile.spawn_level.SpawnGrassTile;
import com.extreemecoder.tanks.level.tile.spawn_level.SpawnHedgeTile;
import com.extreemecoder.tanks.level.tile.spawn_level.SpawnWallTile;
import com.extreemecoder.tanks.level.tile.spawn_level.SpawnWaterTile;

public class Tile {
	
	public Sprite sprite;
	
	// Level Tiles:
	// Void tile
	public static Tile voidTile = new VoidTile(Sprite.voidSprite);
	
	// Spawn tiles
	public static Tile spawn_grass = new SpawnGrassTile(Sprite.spawn_grass);
	public static Tile spawn_bush = new SpawnHedgeTile(Sprite.spawn_bush);
	public static Tile spawn_water = new SpawnWaterTile(Sprite.spawn_water);
	public static Tile spawn_wall1 = new SpawnWallTile(Sprite.spawn_wall1);
	public static Tile spawn_wall2 = new SpawnWallTile(Sprite.spawn_wall2);
	public static Tile spawn_woodFloor = new SpawnFloorTile(Sprite.spawn_woodFloor);
	public static Tile spawn_frame = new SpawnFloorTile(Sprite.spawn_frame);
	public static Tile spawn_sign = new SpawnFloorTile(Sprite.spawn_sign);
	
	public final static int col_spawn_grass = 0xFF00FF00;
	public final static int col_spawn_bush = 0; //unused
	public final static int col_spawn_water = 0; //unused
	public final static int col_spawn_wall1 = 0xFF808080;
	public final static int col_spawn_wall2 = 0xFF303030;
	public final static int col_spawn_woodFloor = 0xFF724715;
	public final static int col_spawn_frame = 0xFF0000FF;
	public final static int col_spawn_sign = 0xFFFF0000;
	
	public Tile(Sprite sprite) {
		this.sprite = sprite;
	}
	
	public void render(int x, int y, Screen screen) {
	}
	
	public boolean solid() {
		return false;
	}

}
