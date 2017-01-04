package com.extreemecoder.tanks.graphics.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.extreemecoder.tanks.util.Vector2i;

public class UILabel extends UIComponent {

	public String text;
	private Font font;
	public boolean dropShadow = false;
	public int dropShadoOffset = 2;

	public UILabel(Vector2i position, String text) {
		super(position);
		font = new Font("Helvetica", Font.PLAIN, 32);
		this.text = text;
		color = new Color(0xcacaca);
	}

	public UILabel setFont(Font font) {
		this.font = font;
		return this;
	}

	public void render(Graphics g) {
		if (dropShadow) {
			g.setFont(font);
			g.setColor(Color.BLACK);
			g.drawString(text, position.x + offset.x + dropShadoOffset, position.y + offset.y + dropShadoOffset);
		}
		
		g.setColor(color);
		g.setFont(font);
		g.drawString(text, position.x + offset.x, position.y + offset.y);
	}

}
