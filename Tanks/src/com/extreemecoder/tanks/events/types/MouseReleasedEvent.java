package com.extreemecoder.tanks.events.types;

import com.extreemecoder.tanks.events.Event;

public class MouseReleasedEvent extends MouseButtonEvent {

	public MouseReleasedEvent(int button, int x, int y) {
		super(button, x, y, Event.Type.MOUSE_RELEASED);
	}
	
}
