package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.Screens.FirstScreen;

public class MyGdxGame extends Game {
	public SpriteBatch batch;
	Texture img;

//	Skin skin;
	public static final String skin = new String("freezing/skin/freezing-ui.json");

	public static final String skinn=new String("glassy/glassy-ui.json");

	public static final String skinfinal=new String("skin/glassy-ui.json");

	ShapeRenderer s;
	@Override
	public void create () {
		batch = new SpriteBatch();
		s = new ShapeRenderer();
		setScreen(new FirstScreen(this));
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		s.dispose();
	}


}
