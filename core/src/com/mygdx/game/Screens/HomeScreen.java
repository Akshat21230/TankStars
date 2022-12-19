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

public class HomeScreen extends ScreenAdapter {
    MyGdxGame  run;
//    Sprite sp;
    Texture tx;
    TextButton New;
    TextButton Res;
    TextButton Exit;
    Skin skin;
    Stage stage;
    Sprite sprite1;
    Sprite sprite;
    Texture background;

    TextButton back;

    public HomeScreen(final MyGdxGame game){
        stage = new Stage(new ScreenViewport());
        Gdx.input.setInputProcessor(stage);
        skin=new Skin(Gdx.files.internal(MyGdxGame.skin));

        this.run=game;

        tx=new Texture("logo1-removebg-preview.png");
        sprite1=new Sprite(tx,0,0,404,316);
        sprite1.setSize(404,316);
        sprite1.setPosition(450,400);

        background=new Texture("Bg3.png");
        sprite=new Sprite(background,0,0,1200,675);
        sprite.setSize(1300,700);
        sprite.setPosition(0,0);



        New = new TextButton("NewGame", skin);
        New.setSize(250, 100);
        New.setPosition(70, 240);
        New.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                run.setScreen(new TankSelection1(run));
            }
        });
        stage.addActor(New);
//
        Res = new TextButton("ResumeGame", skin);
        Res.setSize(250, 100);
        Res.setPosition(530, 240);
        Res.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                run.setScreen(new Savedgames(run));
            }
        });
        stage.addActor(Res);
//
        Exit = new TextButton("Exit", skin);
        Exit.setSize(250, 100);
        Exit.setPosition(980, 240);
        Exit.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                Gdx.app.exit();
            }
        });

        stage.addActor(Exit);

        back = new TextButton("Back", skin);
        back.setSize(100, 70);
        back.setPosition(20, 600);
        back.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                run.setScreen(new FirstScreen(run));
            }
        });
        stage.addActor(back);



    }
    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.25f, 0, 0, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        run.batch.begin();
        sprite.draw(run.batch);
        sprite1.draw(run.batch);
        stage.act();
        stage.draw();
//        sp.draw(run.batch);

        run.batch.end();
    }

    @Override
    public void show() {
        super.show();
    }

}
