/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_ma02_8130144_8130368;

import Game.Animation;
import Game.CollisionArea;
import Game.GameContainer;
import Game.GameObject;
import Game.Level;
import Game.Management.MapManagement;
import Game.Player;
import Game.Scenario;
import Game.Store;
import Resources.Adapter;
import Resources.Enums.PlayerMovementDirection;
import Resources.Exceptions.DuplicateLevelsId;
import Resources.Exceptions.FileHandlingException;
import Resources.Exceptions.KeyNotFoundException;
import Resources.Exceptions.ObjectException;

public class PP_MA02_8130144_8130368 {

    /**
     * @param args the command line arguments
     * @throws Resources.Exceptions.DuplicateLevelsId
     * @throws Resources.Exceptions.ObjectException
     * @throws Resources.Exceptions.FileHandlingException
     * @throws Resources.Exceptions.KeyNotFoundException
     */
    public static void main(String[] args) throws DuplicateLevelsId, ObjectException, FileHandlingException, KeyNotFoundException {
        Store s = new Store("fic.txt");

        CollisionArea cR = new CollisionArea(100, 100, 200, 300, 200, 100, 100);
        CollisionArea cR_2 = new CollisionArea(500, 500, 700, 800, 600, 500, 500);
        Player p = new Player(true, "EU", 100, 200, 300, 300, false, false, cR);
        Scenario scenario = new Scenario(1, "Scenario1", 900, 900, "C:\\Users\\anaal\\Desktop\\PP_MA02_8130144_8130368\\imagesBack\\background.png");

        Animation animation = new Animation(1000, 200, 300, "C:\\Users\\anaal\\Desktop\\PP_MA02_8130144_8130368\\imagesBack\\House\\house1.png");
        Animation animation_2 = new Animation(1000, 100, 100, "C:\\Users\\anaal\\Desktop\\PP_MA02_8130144_8130368\\images\\up\\Walk (1).png");
        Animation animation_3 = new Animation(1000, 100, 100, "C:\\Users\\anaal\\Desktop\\PP_MA02_8130144_8130368\\images\\down\\Walk (1).png");
        Animation animation_4 = new Animation(1000, 100, 100, "C:\\Users\\anaal\\Desktop\\PP_MA02_8130144_8130368\\images\\right\\Walk (1).png");
        Animation animation_5 = new Animation(1000, 100, 100, "C:\\Users\\anaal\\Desktop\\PP_MA02_8130144_8130368\\images\\left\\Walk (1).png");
        Animation animation_6 = new Animation(1000, 100, 100, "C:\\Users\\anaal\\Desktop\\PP_MA02_8130144_8130368\\images\\idle\\/Walk (1).png");

        //animation.loadImagesFromFolder();
        MapManagement map2 = new MapManagement();

        //    s.saveToFile(p, "fic.txt");
        p.addAnimation(PlayerMovementDirection.UP, animation_2);
        p.addAnimation(PlayerMovementDirection.DOWN, animation_3);
        p.addAnimation(PlayerMovementDirection.RIGHT, animation_4);
        p.addAnimation(PlayerMovementDirection.LEFT, animation_5);
        p.addAnimation(PlayerMovementDirection.IDLE, animation_6);

        // p.playerDescription();
        GameObject[] o = {new GameObject("House", 100, 100, 200, 200, false, true, cR_2, animation)};
        // s.saveToFile(o, "fic.txt");

        //o.GameObjectDescription();
        // s.saveToFile(scenario, "fic.txt");
        scenario.addGameObject(o[0]);
        //scenario.scenarioDescription();

        Level[] glc = {
            new Level(p, 1, scenario, true),};

        GameContainer container = new GameContainer("Game 1", true);
        container.addNewLevel(glc[0]); //A funcionar...
        // s.saveToFile(container, "fic.txt");
       // container.gameContainerDescription();

        Adapter.StartGame(container);
        //Adapter.StartGame((GameContainerContract) s.loadFromFile("fic.txt")); 
        //GameObject oo = s.loadFromFile("fic.txt");
        // oo.GameObjectDescription();

    }

}
