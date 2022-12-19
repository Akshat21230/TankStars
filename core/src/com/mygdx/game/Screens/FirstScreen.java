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
import com.mygdx.game.MyGdxGame;

import java.awt.*;

public class FirstScreen extends ScreenAdapter {
    MyGdxGame run;
    Sprite sp;
    Texture tx;
    TextButton button;
    Skin skin;
    Stage stage;
    Sprite sprite1;

    public FirstScreen(final MyGdxGame game) {

        stage = new Stage(new ScreenViewport());
        Gdx.input.setInputProcessor(stage);
        this.run=game;
        sprite1=new Sprite(new Texture("1.png"),0,0,1200,630);
        sprite1.setSize(0,0);
        sprite1.setPosition(1300,700);

        sp = new Sprite(new Texture("1.png"),0,0,1200,630);
        sp.setPosition(0,0);
        sp.setSize(1300,700);



        skin=new Skin(Gdx.files.internal(MyGdxGame.skin));

        button = new TextButton("Start", skin);
        button.setSize(250, 100);
        button.setPosition(520, 10);
        button.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                run.setScreen(new HomeScreen(run));
            }
        });
        stage.addActor(button);
    }


    //private
    //change gamescreen
    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.25f, 0, 0, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        run.batch.begin();


        sp.draw(run.batch);
        sprite1.draw(run.batch);
        stage.act();
        stage.draw();

        run.batch.end();
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
    }



    @Override
    public void hide() {
        super.hide();
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void resume() {
        super.resume();
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
