package com.extreemecoder.tanks.entity.mob;

import java.util.List;

import com.extreemecoder.tanks.entity.Entity;
import com.extreemecoder.tanks.graphics.AnimatedSprite;
import com.extreemecoder.tanks.graphics.Screen;
import com.extreemecoder.tanks.graphics.Sprite;
import com.extreemecoder.tanks.graphics.SpriteSheet;
import com.extreemecoder.tanks.util.Vector2i;

public class Shooter extends Mob {
	
	private AnimatedSprite down = new AnimatedSprite(SpriteSheet.chaserEnemy_down, 32, 32, 3);
	private AnimatedSprite up = new AnimatedSprite(SpriteSheet.chaserEnemy_up, 32, 32, 3);
	private AnimatedSprite left = new AnimatedSprite(SpriteSheet.chaserEnemy_left, 32, 32, 3);
	private AnimatedSprite right = new AnimatedSprite(SpriteSheet.chaserEnemy_right, 32, 32, 3);
	
	private AnimatedSprite animSprite = down;
	private int time = 0;
	private int xa = 0, ya = 0;
	
	private Entity rand = null;
	
	public Shooter(int x, int y) {
		this.x = x << 4;
		this.y = y << 4;
		sprite = Sprite.chaserEnemy_up;
	}

	public void update() {
		time++;
		if (time % (random.nextInt(50) + 30) == 0) {
			xa = random.nextInt(3) - 1;
			ya = random.nextInt(3) - 1;
			if (random.nextInt(3) == 0) {
				xa = 0;
				ya = 0;
			}
		}
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
		if (xa != 0 || ya != 0) {
			//move (xa, ya);
			walking = true;
		} else {
			walking = false;
		}
		shootRandom();
		
	}
	
	private void shootRandom() {
		List<Entity> entities = level.getEntities(this, 500);
		entities.add(level.getClientPlayer());
		if(time % (30 + random.nextInt(91)) == 0) {
			int index = random.nextInt(entities.size());
			rand = entities.get(index);
		}
		
		if (rand != null) {
			double dx = rand.getX() - x;
			double dy = rand.getY() - y;
			double dir = Math.atan2(dy, dx);
			shoot(x, y, dir);
		}
	}
	
	@SuppressWarnings("unused")
	private void shootClosest() {
		List<Entity> entities = level.getEntities(this, 500);
		entities.add(level.getClientPlayer());
		
		double min = 0;
		Entity closest = null;
		for (int i = 0; i < entities.size(); i++) {
			Entity e = entities.get(i);
			double distance = Vector2i.getDistance(new Vector2i((int) x, (int) y), new Vector2i((int) e.getX(), (int) e.getY()));
			if (i == 0 || distance < min) {
				min = distance;
				closest = e;
			}
		}
		if (closest != null) {
			double dx = closest.getX() - x;
			double dy = closest.getY() - y;
			double dir = Math.atan2(dy, dx);
			shoot(x, y, dir);
		}
	}

	public void render(Screen screen) {
		sprite = animSprite.getSprite();
		screen.renderMob((int) x - 16, (int) y - 16, this);
	}

}
