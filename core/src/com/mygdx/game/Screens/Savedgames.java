package com.mygdx.game.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.mygdx.game.MyGdxGame;


import java.awt.*;

public class Savedgames extends ScreenAdapter {
    Button b1;
    Skin skin;
    Texture t;
    Stage stage;
    Sprite sprite;
    MyGdxGame run;
    TextButton New;
    TextButton Res;
    TextButton Exit;
    TextButton Game1;
    TextButton Game2;
    TextButton Game3;
    Skin sk;
    Label l1;
    Skin s;
//    Label newlabel;

    public Savedgames(MyGdxGame game){

        stage = new Stage(new ScreenViewport());
        Gdx.input.setInputProcessor(stage);
        skin=new Skin(Gdx.files.internal(MyGdxGame.skin));
        this.run=game;
        skin = new Skin(Gdx.files.internal(MyGdxGame.skin));
        sk = new Skin(Gdx.files.internal(MyGdxGame.skinfinal));
        s = new Skin(Gdx.files.internal(MyGdxGame.skinn));
        l1 = new Label("Saved Games", sk, "big");
        l1.setPosition(450,570);
        l1.setSize(200,80);
        stage.addActor(l1);
        New = new TextButton("", skin);
        New.setSize(250, 200);
        New.setPosition(70, 240);
        New.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                run.setScreen(new TankSelection1(run));
            }
        });
        stage.addActor(New);
//
        Res = new TextButton("", skin);
        Res.setSize(250, 200);
        Res.setPosition(530, 240);
        Res.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
//                run.setScreen(new HomeScreen(run));
            }
        });
        stage.addActor(Res);
//
        Exit = new TextButton("", skin);
        Exit.setSize(250, 200);
        Exit.setPosition(980, 240);
        Exit.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                Gdx.app.exit();
            }
        });

        stage.addActor(Exit);

        Game1 = new TextButton("Game1", s);
        Game1.setSize(200, 100);
        Game1.setPosition(90, 130);
        Game1.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                run.setScreen(new TankSelection1(run));
            }
        });
        stage.addActor(Game1);
//
        Game2 = new TextButton("Game2", s);
        Game2.setSize(200, 100);
        Game2.setPosition(550, 130);
        Game2.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
//                run.setScreen(new HomeScreen(run));
            }
        });
        stage.addActor(Game2);
//
        Game3 = new TextButton("Game3", s);
        Game3.setSize(200, 100);
        Game3.setPosition(1000, 130);
        Game3.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
//                Gdx.app.exit();
            }
        });

        stage.addActor(Game3);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(161/225f, 52/225f, 235/225f, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        run.batch.begin();
        stage.act();
        stage.draw();
        run.batch.end();
    }
}
