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
import Game.Player;
import Game.Scenario;
import Resources.Adapter;
import Resources.Enums.PlayerMovementDirection;
import Resources.Exceptions.DuplicateLevelsId;
import Resources.Exceptions.FileHandlingException;
import Resources.Exceptions.KeyNotFoundException;
import Resources.Exceptions.ObjectException;
import java.util.Timer;

public class PP_MA02_8130144_8130368 {

    /**
     * @param args the command line arguments
     * @throws Resources.Exceptions.DuplicateLevelsId Excecao
     * @throws Resources.Exceptions.ObjectException Excecao
     * @throws Resources.Exceptions.FileHandlingException Excecao
     * @throws Resources.Exceptions.KeyNotFoundException Excecao
     */
    public static void main(String[] args) throws DuplicateLevelsId, ObjectException, KeyNotFoundException, FileHandlingException {

        int d = 1000;
        int intervaloTempo = 1000;
        Timer timer = new Timer();

       // Store s = new Store();
        //int pX, pY;

        Scenario scenario = new Scenario(1, "Random Scenario");

        CollisionArea ca = new CollisionArea(100, 100, 800, 800, 200, 100.0f, 10.00f); //Player
        CollisionArea ca2 = new CollisionArea(140, 20, 100, 100, 1, 1.0f, 1.0f); //House
        CollisionArea ca3 = new CollisionArea(605, 506, 80, 100, 1, 1.0f, 1.0f); //Tree
        CollisionArea ca5 = new CollisionArea(112, 506, 80, 80, 1, 1.0f, 1.0f); //House 2
        CollisionArea ca6 = new CollisionArea(650, 10, 110, 110, 1, 1.0f, 1.0f); //Girl
        CollisionArea ca7 = new CollisionArea(350, 300, 110, 110, 1, 1.0f, 1.0f); //Girl
        CollisionArea ca8 = new CollisionArea(630, 270, 150, 150, 1, 1.0f, 1.0f); //Death
        CollisionArea ca9 = new CollisionArea(20, 220, 150, 150, 1, 1.0f, 1.0f); //Death

        Animation a = new Animation(100, 1000, 1000, "Moodle2017PP\\assets\\PlayerAnimation\\up\\");
        Animation a2 = new Animation(100, 1000, 1000, "Moodle2017PP\\assets\\PlayerAnimation\\down\\");
        Animation a3 = new Animation(100, 1000, 1000, "Moodle2017PP\\assets\\PlayerAnimation\\right\\");
        Animation a4 = new Animation(100, 1000, 1000, "Moodle2017PP\\assets\\PlayerAnimation\\left\\");
        Animation a5 = new Animation(100, 1000, 1000, "Moodle2017PP\\assets\\PlayerAnimation\\idle\\");
        Animation a6 = new Animation(0, 200, 200, "Moodle2017PP\\assets\\House\\"); //House
        Animation a8 = new Animation(0, 110, 110, "Moodle2017PP\\assets\\Girl\\"); //Girl
        Animation a7 = new Animation(0, 150, 100, "Moodle2017PP\\assets\\Tree\\");//Tree  
        Animation a9 = new Animation(0, 200, 200, "Moodle2017PP\\assets\\House\\"); //House 2
        Animation a10 = new Animation(0, 110, 110, "Moodle2017PP\\assets\\Bird\\"); //Bird
        Animation a11 = new Animation(0, 110, 110, "Moodle2017PP\\assets\\Death\\"); //Bird
        Animation a12 = new Animation(0, 110, 110, "Moodle2017PP\\assets\\Igreja\\"); //Igreja

        Player p = new Player(true, "Player 1", 10, 10, 100, 100, false, false, ca);

        GameObject[] o = {
            new GameObject("House", 140, 20, 100, 100, true, false, ca2, a6),
            new GameObject("Tree", 450, 506, 80, 100, true, false, ca3, a7),
            new GameObject("House 2", 112, 506, 80, 80, true, false, ca5, a9),
            new GameObject("Girl", 650, 50, 110, 110, true, false, ca6, a8),
            new GameObject("Bird", 350, 170, 110, 110, true, false, ca7, a10),
            new GameObject("Death", 630, 270, 150, 150, true, false, ca8, a11),
            new GameObject("Igreja", 20, 220, 150, 150, false, false, ca9, a12)};

        p.addAnimation(PlayerMovementDirection.UP, a);

        p.addAnimation(PlayerMovementDirection.DOWN, a2);

        p.addAnimation(PlayerMovementDirection.RIGHT, a3);

        p.addAnimation(PlayerMovementDirection.LEFT, a4);

        p.addAnimation(PlayerMovementDirection.IDLE, a5);

        p.save(p);

        for (GameObject gameObject : o) {
            scenario.addGameObject(gameObject);
        }

        scenario.save(scenario);

        Level[] glc = {
            new Level(p, 1, scenario, false)};

        GameContainer container = GameContainer.getInstance();

        container.inicializar(
                "PP_MA_02_8130144_8130368", false);

        for (Level glc1 : glc) {
            container.addNewLevel(glc1);
        }

        container.save(container);
//        ListManagement list = new ListManagement();
//        list = (ListManagement) scenario.colisionMapping();
//        CollisionArea cc = new CollisionArea();
//        cc = (CollisionArea) list.getObject(6);
//        pX = cc.getX();
//        pY = cc.getY();
//        ca.setX(pX);
//        ca.setY(pY);

        Adapter.StartGame(container);

    }
}
