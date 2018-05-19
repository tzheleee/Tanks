package com.tzheleee.game;

import com.tzheleee.game.level.Level;
import com.tzheleee.graphics.TextureAtlas;

public class EnemyGreenTank extends Enemy {
    private static final int	NORTH_X	= 0;
    private static final int	NORTH_Y	= 11;
    private static final float	SPEED	= 1.5f;
    private static final int	LIVES	= 2;

    public EnemyGreenTank(float x, float y, float scale, TextureAtlas atlas, Level lvl) {
        super(x, y, scale, SPEED, atlas, lvl, NORTH_X, NORTH_Y, LIVES);

    }
}