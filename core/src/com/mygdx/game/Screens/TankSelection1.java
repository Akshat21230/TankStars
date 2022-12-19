package com.mygdx.game.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.mygdx.game.MyGdxGame;

public class TankSelection1 extends ScreenAdapter {
    MyGdxGame run;
    Skin skin;
    Texture tex1;
    Texture tex2;
    Texture tex3;
    Label l;
    Skin sk;
    Stage s;
    Sprite s1;
    Sprite s2;
    Sprite s3;
    TextButton back;
    TextButton New;
    TextButton Res;
    TextButton Exit;
    public static int tank1 = 0;

    public TankSelection1(MyGdxGame game){
        s=new Stage(new ScreenViewport());
        Gdx.input.setInputProcessor(s);

        this.run=game;
        skin = new Skin(Gdx.files.internal(MyGdxGame.skin));
        sk=new Skin(Gdx.files.internal(MyGdxGame.skinfinal));
        l=new Label("Tank Selection for Player - 1",sk,"big");
        l.setPosition(350,570);
        l.setSize(200,80);
        s.addActor(l);
        tex1=new Texture("Tank1-removebg-preview.png");
        s1=new Sprite(tex1,0,0,350,198);
        s1.setSize(300,180);
        s1.setPosition(20,275);
        tex2=new Texture("Tank5-removebg-preview.png");
        s2=new Sprite(tex2,0,0,350,193);
        s2.setSize(300,180);
        s2.setPosition(500,275);
        tex3=new Texture("Tank6-removebg-preview.png");
        s3=new Sprite(tex3,0,0,350,193);
        s3.setSize(300,180);
        s3.setPosition(1000,250);
        back = new TextButton("Back", skin);
        back.setSize(100, 70);
        back.setPosition(20, 600);
        back.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                run.setScreen(new HomeScreen(run));
            }
        });
        s.addActor(back);
        New = new TextButton("T-54", skin);
        New.setSize(250, 100);
        New.setPosition(20, 150);
        New.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                tank1 = 1;
                run.setScreen(new TankSelection2(run));
            }
        });
        s.addActor(New);
//
        Res = new TextButton("Centurion", skin);
        Res.setSize(250, 100);
        Res.setPosition(500, 150);
        Res.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                tank1 = 2;
                run.setScreen(new TankSelection2(run));
            }
        });
        s.addActor(Res);
//
        Exit = new TextButton("M3-Stuart", skin);
        Exit.setSize(250, 100);
        Exit.setPosition(1000, 150);
        Exit.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                tank1 = 3;
                run.setScreen(new TankSelection2(run));
            }
        });

        s.addActor(Exit);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(161/225f, 52/225f, 235/225f, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        run.batch.begin();
        s1.draw(run.batch);
        s2.draw(run.batch);
        s3.draw(run.batch);
        s.act();
        s.draw();
        run.batch.end();
    }

    @Override
    public void show() {
        super.show();
    }
}
