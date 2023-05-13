package com.starship.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.GDX;
import com.badlogic.gdx.Input;

public class StarShip extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img, tShip;
	private Sprite ship;

	private double posX, posY;
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("bg.png");
		tShip = new Texture("spaceship.png");
		ship = new Sprite(tShip);
	}

	@Override
	public void render () {

		this.movShip();

		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.draw(ship, getPosX(), getPosY());
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}

	private void movShip(){

		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
			setPosX(getPosX() + 5);
		}

	}

	public double getPosY() {
		return posY;
	}

	public void setPosY(double posY) {
		this.posY = posY;
	}

	public double getPosX() {
		return posX;
	}

	public void setPosX(double posX) {
		this.posX = posX;
	}

}
