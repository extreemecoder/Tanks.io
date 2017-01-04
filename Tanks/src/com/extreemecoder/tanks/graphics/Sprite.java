package com.extreemecoder.tanks.graphics;

public class Sprite {
	
	public final int SIZE;
	private int x, y;
	private int width, height;
	public int[] pixels;
	protected SpriteSheet sheet;
	
	// Particle Sprites
	public static Sprite particle_normal = new Sprite(3, 0xAAAAAA);
	public static Sprite square = new Sprite(2, 0xFF0000);
	
	
	// Level Sprites:
	// Void Sprite
	public static Sprite voidSprite = new Sprite(16, 0x1B87E0);
	
	// Spawn level
	public static Sprite spawn_grass = new Sprite(32, 0, 0, SpriteSheet.lvlSpawn);
	public static Sprite spawn_bush = new Sprite(32, 0, 0, SpriteSheet.lvlSpawn);
	public static Sprite spawn_water = new Sprite(32, 0, 0, SpriteSheet.lvlSpawn);
	public static Sprite spawn_wall1 = new Sprite(32, 0, 0, SpriteSheet.lvlSpawn);
	public static Sprite spawn_woodFloor = new Sprite(32, 0, 0, SpriteSheet.lvlSpawn);
	public static Sprite spawn_tank = new Sprite(32, 0, 0, SpriteSheet.lvlSpawn);
	public static Sprite spawn_wall2 = new Sprite(32, 0, 0, SpriteSheet.lvlSpawn);
	public static Sprite spawn_sign = new Sprite(32, 0, 0, SpriteSheet.lvlSpawn);
	public static Sprite spawn_frame = new Sprite(32, 0, 0, SpriteSheet.lvlSpawn);
	
	
	// Miscellaneous Sprites:
	// Tank Colors
	public static Sprite tank_lGreen = new Sprite(16, 0, 0, SpriteSheet.tankCol);
	public static Sprite tank_maroon = new Sprite(16, 1, 0, SpriteSheet.tankCol);
	public static Sprite tank_dGreen = new Sprite(16, 2, 0, SpriteSheet.tankCol);
	public static Sprite tank_blue = new Sprite(16, 0, 1, SpriteSheet.tankCol);
	public static Sprite tank_yellow = new Sprite(16, 1, 1, SpriteSheet.tankCol);
	public static Sprite tank_pink = new Sprite(16, 2, 1, SpriteSheet.tankCol);
	public static Sprite tank_red = new Sprite(16, 0, 2, SpriteSheet.tankCol);
	public static Sprite tank_purple = new Sprite(16, 1, 2, SpriteSheet.tankCol);
	public static Sprite tank_cyan = new Sprite(16, 2, 2, SpriteSheet.tankCol);
	
	
	// Main Character Sprites
	public static Sprite player_up = new Sprite(32, 0, 0, SpriteSheet.player_up);
	public static Sprite player_down = new Sprite(32, 0, 0, SpriteSheet.player_down);
	public static Sprite player_left = new Sprite(32, 0, 0, SpriteSheet.player_left);
	public static Sprite player_right = new Sprite(32, 0, 0, SpriteSheet.player_right);
	
	public static Sprite player_up1 = new Sprite(32, 0, 1, SpriteSheet.player_up);
	public static Sprite player_up2 = new Sprite(32, 0, 2, SpriteSheet.player_up);
	
	public static Sprite player_down1 = new Sprite(32, 0, 1, SpriteSheet.player_down);
	public static Sprite player_down2 = new Sprite(32, 0, 2, SpriteSheet.player_down);
	
	public static Sprite player_left1 = new Sprite(32, 0, 1, SpriteSheet.player_left);
	public static Sprite player_left2 = new Sprite(32, 0, 2, SpriteSheet.player_left);
	
	public static Sprite player_right1 = new Sprite(32, 0, 1, SpriteSheet.player_right);
	public static Sprite player_right2 = new Sprite(32, 0, 2, SpriteSheet.player_right);
	
	
	// Enemy Character Sprites
	public static Sprite chaserEnemy_up = new Sprite(32, 0, 0, SpriteSheet.chaserEnemy_up);
	public static Sprite chaserEnemy_down = new Sprite(32, 0, 0, SpriteSheet.chaserEnemy_up);
	public static Sprite chaserEnemy_left = new Sprite(32, 0, 0, SpriteSheet.chaserEnemy_up);
	public static Sprite chaserEnemy_right = new Sprite(32, 0, 0, SpriteSheet.chaserEnemy_up);
	
	public static Sprite chaserEnemy_up1 = new Sprite(32, 0, 1, SpriteSheet.chaserEnemy_up);
	public static Sprite chaserEnemy_up2 = new Sprite(32, 0, 2, SpriteSheet.chaserEnemy_up);
	
	public static Sprite chaserEnemy_down1 = new Sprite(32, 0, 1, SpriteSheet.chaserEnemy_up);
	public static Sprite chaserEnemy_down2 = new Sprite(32, 0, 2, SpriteSheet.chaserEnemy_up);
	
	public static Sprite chaserEnemy_left1 = new Sprite(32, 0, 1, SpriteSheet.chaserEnemy_up);
	public static Sprite chaserEnemy_left2 = new Sprite(32, 0, 2, SpriteSheet.chaserEnemy_up);
	
	public static Sprite chaserEnemy_right1 = new Sprite(32, 0, 1, SpriteSheet.chaserEnemy_up);
	public static Sprite chaserEnemy_right2 = new Sprite(32, 0, 2, SpriteSheet.chaserEnemy_up);
	
	
	// Projectiles:
	// Tank
	public static Sprite tankBullet_red = new Sprite(16, 0, 0, SpriteSheet.tankBullet);
	public static Sprite tankBullet_orange = new Sprite(16, 1, 0, SpriteSheet.tankBullet);
	public static Sprite tankBullet_green = new Sprite(16, 2, 0, SpriteSheet.tankBullet);
	public static Sprite tankBullet_black = new Sprite(16, 0, 1, SpriteSheet.tankBullet);
	public static Sprite tankBullet_blue = new Sprite(16, 1, 1, SpriteSheet.tankBullet);
	public static Sprite tankBullet_maroon = new Sprite(16, 2, 1, SpriteSheet.tankBullet);
	public static Sprite tankBullet_pink = new Sprite(16, 0, 2, SpriteSheet.tankBullet);
	public static Sprite tankBullet_yellow = new Sprite(16, 1, 2, SpriteSheet.tankBullet);
	public static Sprite tankBullet_pruple = new Sprite(16, 2, 2, SpriteSheet.tankBullet);
	
	protected Sprite(SpriteSheet sheet, int width, int height) {
		SIZE = (width == height) ? width : -1;
		this.width = width;
		this.height = height;
		this.sheet = sheet;
	}
	
	public Sprite(int size, int x, int y, SpriteSheet sheet) {
		SIZE = size;
		this.width = size;
		this.height = size;
		pixels = new int[SIZE * SIZE];
		this.x = x * size;
		this.y = y * size;
		this.sheet = sheet;
		load();
	}
	
	public Sprite(int width, int height, int colour) {
		SIZE = -1;
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
		setColour(colour);
	}
	
	public Sprite(int size, int colour) {
		SIZE = size;
		this.width = size;
		this.height = size;
		pixels = new int[SIZE * SIZE];
		setColour(colour);
	}
	
	public Sprite(int[] pixels, int width, int height) {
		SIZE = (width == height) ? width : -1;
		this.width = width;
		this.height = height;
		this.pixels = new int[pixels.length];
		for (int i = 0; i < pixels.length; i++) {
			this.pixels[i] = pixels[i];
		}
	}
	
	public static Sprite rotate(Sprite sprite, double angle) {
		return new Sprite(rotate(sprite.pixels, sprite.width, sprite.height, angle), sprite.width, sprite.height);
	}
	
	private static int[] rotate(int[] pixels, int width, int height, double angle) {
		int[] result = new int[width * height];
		
		double nx_x = rot_x(-angle, 1.0, 0.0);
		double nx_y = rot_y(-angle, 1.0, 0.0);
		double ny_x = rot_x(-angle, 0.0, 1.0);
		double ny_y = rot_y(-angle, 0.0, 1.0);
		
		double x0 = rot_x(-angle, -width / 2.0, -height / 2.0) + width / 2.0;
		double y0 = rot_y(-angle, -width / 2.0, -height / 2.0) + height / 2.0;
		
		for (int y = 0; y < height; y++) {
			double x1 = x0;
			double y1 = y0;
			for (int x = 0; y < width; x++) {
				int xx = (int) x1;
				int yy = (int) y1;
				int col = 0;
				if (xx < 0 || xx >= width || yy < 0 || yy >= height) col = 0xffff00ff;
				else col = pixels[xx + yy * width];
				result[x + y * width] = col;
				x1 += nx_x;
				y1 += nx_y;
			}
			x0 += ny_x;
			y0 += ny_y;
		}
		
		return result;
	}
	
	private static double rot_x(double angle, double x, double y) {
		double cos = Math.cos(angle - Math.PI / 2);
		double sin = Math.sin(angle - Math.PI / 2);
		return x * cos + y * -sin;
	}
	
	private static double rot_y(double angle, double x, double y) {
		double cos = Math.cos(angle);
		double sin = Math.sin(angle);
		return x * sin + y * cos;
	}
	
	public static Sprite[] split(SpriteSheet sheet) {
		int amount = (sheet.getWidth() * sheet.getHeight()) / (sheet.SPRITE_WIDTH * sheet.SPRITE_HEIGHT);
		Sprite[] sprites = new Sprite[amount];
		int current = 0;
		int[] pixels = new int[sheet.SPRITE_WIDTH * sheet.SPRITE_HEIGHT];
		for (int yp = 0; yp < sheet.getHeight() / sheet.getHeight(); yp++) {
			for (int xp = 0; xp < sheet.getWidth() / sheet.getWidth(); xp++) {
				
				for (int y = 0; y < sheet.SPRITE_HEIGHT; y++) {
					for (int x = 0; x < sheet.SPRITE_WIDTH; x++) {
						int xo = x + xp * sheet.SPRITE_WIDTH;
						int yo = y + yp * sheet.SPRITE_HEIGHT;
						pixels[x + y * sheet.SPRITE_WIDTH] = sheet.getPixels()[xo + yo * sheet.getWidth()];
					}
				}
				
				sprites[current++] = new Sprite(pixels, sheet.SPRITE_WIDTH, sheet.SPRITE_HEIGHT);
			}
		}
		
		
		return sprites;
	}
	
	private void setColour(int colour) {
		for (int i = 0; i < width * height; i++) {
			pixels[i] = colour;
		}
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	private void load() {
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				pixels[x + y * width] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.SPRITE_WIDTH];
			}
		}
	}

}
