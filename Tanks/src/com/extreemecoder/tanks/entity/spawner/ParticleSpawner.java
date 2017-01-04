package com.extreemecoder.tanks.entity.spawner;

import com.extreemecoder.tanks.entity.particle.Particle;
import com.extreemecoder.tanks.level.Level;

public class ParticleSpawner extends Spawner {
	
	@SuppressWarnings("unused")
	private int life;

	public ParticleSpawner(int x, int y, int life, int amount, Level level) {
		super(x, y, Type.PARTICLE, amount, level);
		this.life = life;
		for (int i = 0; i < amount; i++) {
			level.add(new Particle(x, y, life));
		}
	}

}
