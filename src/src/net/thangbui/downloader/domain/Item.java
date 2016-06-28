/*
 * Copyright (c) 2013, Bui Nguyen Thang, thang.buinguyen@gmail.com, thangbui.net. All rights reserved.
 * Licensed under the GNU General Public License version 2.0 (GPLv2)
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * https://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html
 */

package net.thangbui.downloader.domain;

import org.apache.log4j.Logger;

import javax.swing.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Item implements Serializable {

    public static final int    CATEGORY_ALL               = 1;
    public static final int    CATEGORY_MOVIES            = 2;
    public static final int    CATEGORY_TV                = 3;
    public static final int    CATEGORY_MUSIC             = 4;
    public static final int    CATEGORY_BOOK              = 5;
    public static final int    CATEGORY_GAMES             = 6;
    public static final int    CATEGORY_APPS              = 7;
    public static final int    CATEGORY_OTHER             = 8;
    public static final int    CATEGORY_XXX               = 9;
    public static final String CATEGORY_MOVIES_NAME       = "movies";
    public static final String CATEGORY_TV_NAME           = "tv";
    public static final String CATEGORY_MUSIC_NAME        = "music";
    public static final String CATEGORY_BOOK_NAME         = "books";
    public static final String CATEGORY_GAMES_NAME        = "games";
    public static final String CATEGORY_APPS_NAME         = "apps";
    public static final String CATEGORY_XXX_NAME          = "xxx";
    public static final String CATEGORY_APPLICATIONS_NAME = "applications";
    public static final String CATEGORY_ANIME_NAME        = "anime";
    public static final String CATEGORY_OTHER_NAME        = "other";
    public static final Map    CATEGORY_MAP               = new HashMap() {
        {
            put(CATEGORY_MOVIES_NAME, CATEGORY_MOVIES);
            put(CATEGORY_ANIME_NAME, CATEGORY_MOVIES);
            put(CATEGORY_TV_NAME, CATEGORY_TV);
            put(CATEGORY_MUSIC_NAME, CATEGORY_MUSIC);
            put(CATEGORY_BOOK_NAME, CATEGORY_BOOK);
            put(CATEGORY_GAMES_NAME, CATEGORY_GAMES);
            put(CATEGORY_APPS_NAME, CATEGORY_APPS);
            put(CATEGORY_XXX_NAME, CATEGORY_XXX);
            put(CATEGORY_APPLICATIONS_NAME, CATEGORY_APPS);
            put(CATEGORY_OTHER_NAME, CATEGORY_OTHER);
        }
    };
    private static      Logger LOG                        = Logger.getLogger(Item.class);
    public String title;
    public String title_clean;
    public String size;
    public String description;
    public int    category;
    public String URL;
    public String torrent_URL;
    public String size_clean;
    public float  size_kb;

    public static void setLableIcon(Integer category, JLabel label) {
        if (category == Item.CATEGORY_BOOK) {
            label.setIcon(new javax.swing.ImageIcon(Item.class.getResource("/images/books.png")));
        } else if (category == Item.CATEGORY_MOVIES) {
            label.setIcon(new javax.swing.ImageIcon(Item.class.getResource("/images/movies.png")));
        } else if (category == Item.CATEGORY_TV) {
            label.setIcon(new javax.swing.ImageIcon(Item.class.getResource("/images/tv.png")));
        } else if (category == Item.CATEGORY_MUSIC) {
            label.setIcon(new javax.swing.ImageIcon(Item.class.getResource("/images/music.png")));
        } else if (category == Item.CATEGORY_GAMES) {
            label.setIcon(new javax.swing.ImageIcon(Item.class.getResource("/images/games.png")));
        } else if (category == Item.CATEGORY_APPS) {
            label.setIcon(new javax.swing.ImageIcon(Item.class.getResource("/images/apps.png")));
        } else if (category == Item.CATEGORY_OTHER) {
            label.setIcon(new javax.swing.ImageIcon(Item.class.getResource("/images/other.png")));
        } else if (category == Item.CATEGORY_XXX) {
            label.setIcon(new javax.swing.ImageIcon(Item.class.getResource("/images/xxx.png")));
        }
    }

    public void setCategoryFromCategoryName(String html) {
        try {
            category = (Integer) CATEGORY_MAP.get(html.toLowerCase());
        } catch (Exception e) {
            e.printStackTrace();
            LOG.error("Can map category for key  " + html + " " + e.getMessage(), e);

        }
    }

    @Override
    public String toString() {
        return "Item{" + "title=" + title + ", size=" + size + ", description="
                + description + ", category=" + category + ", URL=" + URL + '}';
    }
}
