package com.kpgn.colormatch.constant;

public abstract class ApplicationConstant {

    public static final String APP_ID = "com.kpgn.colormatch";

    public static final long GAME_PLAY_TIME = 45 * 1000;
    public static final int COUNT_DOWN_TIMER = 2;
    public static final long MILLI_SECOND = 1000;
    public static final long FADE_OUT_DURATION = 500;

    public static final String COLOR_BLACK = "black";
    public static final String COLOR_YELLOW = "yellow";
    public static final String COLOR_RED = "red";
    public static final String COLOR_BLUE = "blue";
    public static final String COLOR_GREEN = "green";

    public static final String[] COLOR_TEXT = {
            COLOR_BLACK,
            COLOR_YELLOW,
            COLOR_RED,
            COLOR_BLUE,
            COLOR_GREEN
    };

    public static final int BONUS_SPLIT = 5;

    public static final String SP_HIGH_SCORE = APP_ID + ".score";
    public static final String SP_MAXIMUM_CARDS = APP_ID + ".cards";
    public static final String EXTRA_GAME_SCORE = "GAME_SCORE";
}