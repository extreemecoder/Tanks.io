package com.extreemecoder.tanks.entity.mob;

import java.util.List;

import com.extreemecoder.tanks.graphics.AnimatedSprite;
import com.extreemecoder.tanks.graphics.Screen;
import com.extreemecoder.tanks.graphics.Sprite;
import com.extreemecoder.tanks.graphics.SpriteSheet;
import com.extreemecoder.tanks.level.Node;
import com.extreemecoder.tanks.util.Vector2i;

public class Star extends Mob {
	private AnimatedSprite down = new AnimatedSprite(SpriteSheet.chaserEnemy_down, 32, 32, 3);
	private AnimatedSprite up = new AnimatedSprite(SpriteSheet.chaserEnemy_up, 32, 32, 3);
	private AnimatedSprite left = new AnimatedSprite(SpriteSheet.chaserEnemy_left, 32, 32, 3);
	private AnimatedSprite right = new AnimatedSprite(SpriteSheet.chaserEnemy_right, 32, 32, 3);
	
	private AnimatedSprite animSprite = down;
	
	private double xa = 0;
	private double ya = 0;
	private List<Node> path = null;
	private int time = 0;
	
	public Star(int x, int y) {
		this.x = x << 4;
		this.y = y << 4;
		sprite = Sprite.chaserEnemy_up;
	}
	
	private void move() {
		xa = 0;
		ya = 0;
		int px = (int) level.getPlayerAt(0).getX();
		int py = (int) level.getPlayerAt(0).getY();
		Vector2i start = new Vector2i((int) getX() >> 4, (int) getY() >> 4);
		Vector2i destination = new Vector2i(px >> 4, py >> 4);
		if (time % 3 == 0) path = level.findPath(start, destination);
		if (path != null) {
			if (path.size() > 0) {
				Vector2i vec = path.get(path.size() - 1).tile;
				if (x < (int) vec.getX() << 4) xa++;
				if (x > (int) vec.getX() << 4) xa--;
				if (y < (int) vec.getY() << 4) ya++;
				if (y > (int) vec.getY() << 4) ya--;
			}
		}
		if (xa != 0 || ya != 0) {
			move (xa, ya);
			walking = true;
		} else {
			walking = false;
		}
	}

	public void update() {
		time++;
		move();
		if (walking) animSprite.update();
		else animSprite.setFrame(0);
		if (ya < 0) {
			animSprite = up;
			dir = Direction.UP;
		} else if (ya > 0) {
			animSprite = down;
			dir = Direction.DOWN;
		}
		if (xa < 0) {
			animSprite = left;
			dir = Direction.LEFT;
		} else if (xa > 0) {
			animSprite = right;
			dir = Direction.RIGHT;
		}
	}

	public void render(Screen screen) {
		sprite = animSprite.getSprite();
		screen.renderMob((int) (x - 16), (int) (y - 16), this);
	}
}
