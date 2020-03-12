package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame implements ApplicationListener {
	SpriteBatch batch;
	Sprite img;
	@Override
	public void create() {
		batch = new SpriteBatch();
		img = new Sprite(new Texture(Gdx.files.internal("badlogic.jpg")));
		
	}
	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void render() {
		//Limpa a tela
		Gdx.gl.glClearColor(1, 0, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		//Lidar com as entradas de teclado
		if(Gdx.input.isKeyPressed(Keys.W)) {
			//anda para cima
			img.setY(img.getY() + 10);
		}
		if(Gdx.input.isKeyPressed(Keys.S)) {
			//anda para baixo
			img.setY(img.getY() - 10);
		}
		if(Gdx.input.isKeyPressed(Keys.A)) {
			//anda para esquerda
			img.setX(img.getX() - 10);
		}
		if(Gdx.input.isKeyPressed(Keys.D)) {
			//anda para direita
			img.setX(img.getX() + 10);
		}
		
		//desenha na tela
		batch.begin();
		batch.draw(img, img.getX(), img.getY());
		batch.end();
		
	}
	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void dispose() {
		img.getTexture().dispose();
		batch.dispose();
	}
}	
	
