package com.extreemecoder.tanks.net.player;

import com.extreemecoder.tanks.entity.mob.Mob;
import com.extreemecoder.tanks.graphics.Screen;

public class NetPlayer extends Mob {
	
	public NetPlayer() {
		x = 32 * 16;
		y = 32 * 16;
	}

	public void update() {
		
	}

	public void render(Screen screen) {
		screen.fillRect(x, y, 32, 32, 0x2030cc, true);
	}
	
}
