package com.starship.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class StarShip extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img, tShip;
	private Sprite ship;

	private long posX, posY;
	
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

		ship.setPosition(getPosX(), getPosY());
		ship.draw(batch);

		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}

	private void movShip(){

		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
			setPosX(getPosX() + 15);
		}
		if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
			setPosX(getPosX() - 15);
		}
		if(Gdx.input.isKeyPressed(Input.Keys.UP)){
			setPosY(getPosY() + 15);
		}
		if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){
			setPosY(getPosY() - 15);
		}

	}

	public long getPosY() {
		return posY;
	}

	public void setPosY(long posY) {
		this.posY = posY;
	}

	public long getPosX() {
		return posX;
	}

	public void setPosX(long posX) {
		this.posX = posX;
	}

}
