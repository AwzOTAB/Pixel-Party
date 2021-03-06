package com.saspxprogclub.pixelparty.Minions;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Vector2;
import com.saspxprogclub.pixelparty.Minion;
import static com.saspxprogclub.pixelparty.PixelPartyGame.field;

/***
 * Created by Brandon on 2/28/17.
 */

public class Wizard extends Minion {

    private static int width = (int)(field.height/30f); //inverse
    private static int height = (int)(field.height/30f); //inverse
    private static int vely = (int)(field.height/20f); //inverse
    private static int range = (int)(field.height/20f); //inverse ryan did dis
    private static int cost = 2;
    private static int damage = 250;
    private static float attackSpeed = 5f;
    private static int health = 600;
    private final static String name = Minion.WIZARD;

    /**
     * constructor
     * @param pos   position of the minion
     * @param color color of health bar
     * @param owned boolean if user owns it, or its from bluetooth transmission
     * @param level level of minion, determines damage reduction (armor)
     */
    public Wizard(Vector2 pos, Color color, boolean owned, int level) {
        super(width, height, vely, range, cost, damage, attackSpeed, health, name, pos, color, owned, level);
    }
    public void mUpdate(float dt) {
    }
    public void mCollide(){

    }

}
