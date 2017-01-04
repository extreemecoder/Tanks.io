package com.extreemecoder.tanks.entity;

import java.util.Random;

import com.extreemecoder.tanks.graphics.Screen;
import com.extreemecoder.tanks.graphics.Sprite;
import com.extreemecoder.tanks.level.Level;

public class Entity {
	
	protected int x, y;
	protected Sprite sprite;
	private boolean removed = false;
	protected Level level;
	protected final Random random = new Random();
	
	public Entity() {
	}
	
	public Entity(int x, int y, Sprite sprite) {
		this.x = x;
		this.y = y;
		this.sprite = sprite;
	}
	
	public void update() {
	}
	
	public void render(Screen screen) {
		if (sprite != null) screen.renderSprite((int) x, (int) y, sprite, true);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void remove() {
		//Remove from level
		removed = true;
	}
	
	public Sprite getSprite() {
		return sprite;
	}
	
	public boolean isRemoved() {
		return removed;
	}
	
	public void init(Level level) {
		this.level = level;
	}
	
}
