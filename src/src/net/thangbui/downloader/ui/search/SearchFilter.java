/*
 * Copyright (c) 2013, Bui Nguyen Thang, thang.buinguyen@gmail.com, thangbui.net. All rights reserved.
 * Licensed under the GNU General Public License version 2.0 (GPLv2)
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * https://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html
 */

package net.thangbui.downloader.ui.search;

import net.thangbui.downloader.domain.Item;
import net.thangbui.downloader.ui.MainUI;
import net.thangbui.downloader.utils.SwingUtils;

import javax.swing.*;
import java.awt.font.TextAttribute;

/**
 * @author Nguyen Thang
 */
class SearchFilter extends javax.swing.JPanel {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JToggleButton jToggleButton18;
    public        javax.swing.JToggleButton jToggleButtonALL;
    public        javax.swing.JToggleButton jToggleButtonBook;
    public        javax.swing.JToggleButton jToggleButtonGame;
    public        javax.swing.JToggleButton jToggleButtonMovies;
    public        javax.swing.JToggleButton jToggleButtonMusic;
    public        javax.swing.JToggleButton jToggleButtonOther;
    public        javax.swing.JToggleButton jToggleButtonSoftware;
    public        javax.swing.JToggleButton jToggleButtonTV;
    // End of variables declaration//GEN-END:variables
    private final JToggleButton[]           buttons;

    /**
     * Creates new form SearchFilterPanel
     */
    public SearchFilter() {
        initComponents();
        buttons = new JToggleButton[]{jToggleButtonALL, jToggleButtonMovies, jToggleButton18, jToggleButtonGame,
                jToggleButtonMusic, jToggleButtonOther, jToggleButtonSoftware, jToggleButtonTV, jToggleButtonBook};
        jToggleButtonALL.setSelected(true);

        for (JToggleButton jToggleButton : buttons) {
            SwingUtils.setFontAttribute(jToggleButton, TextAttribute.SIZE, 10);
            SwingUtils.setFontAttribute(jToggleButton, TextAttribute.WEIGHT, TextAttribute.WEIGHT_BOLD);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButtonALL = new javax.swing.JToggleButton();
        jToggleButtonTV = new javax.swing.JToggleButton();
        jToggleButtonMusic = new javax.swing.JToggleButton();
        jToggleButtonGame = new javax.swing.JToggleButton();
        jToggleButtonSoftware = new javax.swing.JToggleButton();
        jToggleButtonOther = new javax.swing.JToggleButton();
        jToggleButton18 = new javax.swing.JToggleButton();
        jToggleButtonMovies = new javax.swing.JToggleButton();
        jToggleButtonBook = new javax.swing.JToggleButton();

        jToggleButtonALL.setText("All");
        jToggleButtonALL.setBorderPainted(false);
        jToggleButtonALL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonALLActionPerformed(evt);
            }
        });

        jToggleButtonTV.setText("TV Shows");
        jToggleButtonTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonTVActionPerformed(evt);
            }
        });

        jToggleButtonMusic.setText("Music");
        jToggleButtonMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonMusicActionPerformed(evt);
            }
        });

        jToggleButtonGame.setText("Games");
        jToggleButtonGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonGameActionPerformed(evt);
            }
        });

        jToggleButtonSoftware.setText("Software");
        jToggleButtonSoftware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonSoftwareActionPerformed(evt);
            }
        });

        jToggleButtonOther.setText("Other");
        jToggleButtonOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonOtherActionPerformed(evt);
            }
        });

        jToggleButton18.setText("18+");
        jToggleButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton18ActionPerformed(evt);
            }
        });

        jToggleButtonMovies.setText("Movies");
        jToggleButtonMovies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonMoviesActionPerformed(evt);
            }
        });

        jToggleButtonBook.setText("Book");
        jToggleButtonBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jToggleButtonALL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButtonMovies, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButtonBook, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButtonTV, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButtonMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButtonGame, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButtonSoftware, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButtonOther, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton18)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jToggleButtonALL)
                                        .addComponent(jToggleButtonTV)
                                        .addComponent(jToggleButtonMusic)
                                        .addComponent(jToggleButtonGame)
                                        .addComponent(jToggleButtonSoftware)
                                        .addComponent(jToggleButtonOther)
                                        .addComponent(jToggleButton18)
                                        .addComponent(jToggleButtonMovies)
                                        .addComponent(jToggleButtonBook))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonALLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonALLActionPerformed
        deselectAll();
        ((JToggleButton) evt.getSource()).setSelected(true);
        MainUI.getInstance().searchResultPanel.filterCategory(-1);
    }//GEN-LAST:event_jToggleButtonALLActionPerformed

    private void jToggleButtonMoviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonMoviesActionPerformed
        deselectAll();
        ((JToggleButton) evt.getSource()).setSelected(true);
        MainUI.getInstance().searchResultPanel.filterCategory(Item.CATEGORY_MOVIES);
    }//GEN-LAST:event_jToggleButtonMoviesActionPerformed

    private void jToggleButtonTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonTVActionPerformed
        deselectAll();
        ((JToggleButton) evt.getSource()).setSelected(true);
        MainUI.getInstance().searchResultPanel.filterCategory(Item.CATEGORY_TV);
    }//GEN-LAST:event_jToggleButtonTVActionPerformed

    private void jToggleButtonMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonMusicActionPerformed
        deselectAll();
        ((JToggleButton) evt.getSource()).setSelected(true);
        MainUI.getInstance().searchResultPanel.filterCategory(Item.CATEGORY_MUSIC);
    }//GEN-LAST:event_jToggleButtonMusicActionPerformed

    private void jToggleButtonGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonGameActionPerformed
        deselectAll();
        ((JToggleButton) evt.getSource()).setSelected(true);
        MainUI.getInstance().searchResultPanel.filterCategory(Item.CATEGORY_GAMES);
    }//GEN-LAST:event_jToggleButtonGameActionPerformed

    private void jToggleButtonSoftwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonSoftwareActionPerformed
        deselectAll();
        ((JToggleButton) evt.getSource()).setSelected(true);
        MainUI.getInstance().searchResultPanel.filterCategory(Item.CATEGORY_APPS);
    }//GEN-LAST:event_jToggleButtonSoftwareActionPerformed

    private void jToggleButtonOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonOtherActionPerformed
        deselectAll();
        ((JToggleButton) evt.getSource()).setSelected(true);
        MainUI.getInstance().searchResultPanel.filterCategory(Item.CATEGORY_OTHER);

    }//GEN-LAST:event_jToggleButtonOtherActionPerformed

    private void jToggleButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton18ActionPerformed
        deselectAll();
        ((JToggleButton) evt.getSource()).setSelected(true);
        MainUI.getInstance().searchResultPanel.filterCategory(Item.CATEGORY_XXX);
    }//GEN-LAST:event_jToggleButton18ActionPerformed

    private void jToggleButtonBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonBookActionPerformed
        deselectAll();
        ((JToggleButton) evt.getSource()).setSelected(true);
        MainUI.getInstance().searchResultPanel.filterCategory(Item.CATEGORY_BOOK);
    }//GEN-LAST:event_jToggleButtonBookActionPerformed

    private void deselectAll() {
        for (JToggleButton jToggleButton : buttons) {
            jToggleButton.setSelected(false);
        }
    }
}
