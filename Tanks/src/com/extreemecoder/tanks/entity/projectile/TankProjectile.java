package com.extreemecoder.tanks.entity.projectile;

import com.extreemecoder.tanks.entity.spawner.ParticleSpawner;
import com.extreemecoder.tanks.graphics.Screen;
import com.extreemecoder.tanks.graphics.Sprite;

public class TankProjectile extends Projectile {
	
	public static final int FIRE_RATE = 20; // Higher is slower

	public TankProjectile(double x, double y, double dir) {
		super(x, y, dir);
		range = 200;
		speed = 2;
		damage = 20;
		sprite = Sprite.tankBullet_black; // Sprite.rotate(Sprite.projectile_arrow, angle)
		nx = speed * Math.cos(angle);
		ny = speed * Math.sin(angle);
	}

	public void update() {
		if (level.tileCollision((int) (x + nx), (int) (y + ny), 6, 5, 5)) {
			level.add(new ParticleSpawner((int) x, (int) y, 44, 50, level));
			remove();
		}
		move();
	}
	
	protected void move() {
		x += nx;
		y += ny;
		if (distance() > range) remove();
	}
	
	private double distance() {
		double dist = 0;
		dist = Math.sqrt(Math.abs((xOrigin - x) * (xOrigin - x) + (yOrigin - y) * (yOrigin - y)));
		return dist;
	}
	
	public void render(Screen screen) {
		screen.renderProjectile((int) x - 12, (int) y - 2, this);
	}

}
