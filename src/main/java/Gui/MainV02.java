/*
 * Copyright (C) 2016 bartkneepkens
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Gui;

import Constants.PlayStates;
import Gui.Observers.ControlsObserver;
import Gui.Observers.MediaObserver;
import Gui.Observers.ObservablePropertyNames;
import Gui.Observers.PlayersObserver;
import Gui.Observers.QueueObserver;
import ViewModel.MainViewModel;
import Gui.Observers.VolumeObserver;
import PlayerCommands.Player;
import SystemCommands.Song;
import java.awt.event.ItemEvent;

/**
 *
 * @author bartkneepkens
 */
public class MainV02 extends javax.swing.JFrame {

    private MainViewModel viewModel;

    /**
     * Creates new form MainV02
     */
    public MainV02() {
        initComponents();
        this.viewModel = new MainViewModel();
        this.configureObservers();
        this.viewModel.postInit();
    }

    private void configureObservers() {
        VolumeObserver volumeObserver = new VolumeObserver(this.volumeSlider, this.volumeLabel);
        ControlsObserver controlsObserver = new ControlsObserver(this.playPauseStopButton,
                this.songProgressBar, this.timePassedLabel, this.songDurationLabel);
        PlayersObserver playersObserver = new PlayersObserver(this.playersComboBox);
        MediaObserver mediaObserver = new MediaObserver(this.mediaImageView, this.songNameLabel, this.artistNameLabel, this.albumNameLabel);
        QueueObserver queueObserver = new QueueObserver(this.queueList);

        this.viewModel.addObserverForProperty(ObservablePropertyNames.VOLUME, volumeObserver);

        this.viewModel.addObserverForProperty(ObservablePropertyNames.PLAYSTATE, controlsObserver);
        this.viewModel.addObserverForProperty(ObservablePropertyNames.SONGPROGRESS, controlsObserver);
        this.viewModel.addObserverForProperty(ObservablePropertyNames.NOWPLAYING, controlsObserver);

        this.viewModel.addObserverForProperty(ObservablePropertyNames.PLAYERS, playersObserver);
        this.viewModel.addObserverForProperty(ObservablePropertyNames.NOWPLAYING, mediaObserver);

        this.viewModel.addObserverForProperty(ObservablePropertyNames.QUEUE, queueObserver);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        mediaProviderList = new javax.swing.JList<>();
        mediaBackButton = new javax.swing.JButton();
        searchPanel = new javax.swing.JPanel();
        searchButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        mediaBrowserList = new javax.swing.JList<>();
        searchMediaTextField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        mediaImageView = new javax.swing.JLabel();
        songPanel = new javax.swing.JPanel();
        songNameLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        artistNameLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        albumNameLabel = new javax.swing.JLabel();
        controlsPanel = new javax.swing.JPanel();
        previousMediaButton = new javax.swing.JButton();
        timePassedLabel = new javax.swing.JLabel();
        nextMediaButton = new javax.swing.JButton();
        songProgressBar = new javax.swing.JProgressBar();
        playPauseStopButton = new javax.swing.JButton();
        songDurationLabel = new javax.swing.JLabel();
        volumePanel = new javax.swing.JPanel();
        volumeSlider = new javax.swing.JSlider();
        jButton2 = new javax.swing.JButton();
        volumeLabel = new javax.swing.JLabel();
        playersComboBox = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        queueList = new javax.swing.JList<>();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Players"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OpenHEOSController");
        setName(""); // NOI18N
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Media Browser", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Hiragino Kaku Gothic Std", 0, 16))); // NOI18N

        mediaProviderList.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        mediaProviderList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Spotify", "Soundcloud", "Radio" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(mediaProviderList);

        mediaBackButton.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        mediaBackButton.setText("Back");

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/magnifying-glass-2x.png"))); // NOI18N
        searchButton.setBorderPainted(false);
        searchButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pressed/magnifying-glass-2x.png"))); // NOI18N

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addComponent(searchButton)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchButton)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        mediaBrowserList.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        mediaBrowserList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(mediaBrowserList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mediaBackButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(searchMediaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchMediaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mediaBackButton)))
                    .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2)))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Now Playing", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Hiragino Kaku Gothic Std", 0, 16))); // NOI18N

        mediaImageView.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mediaImageView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media-pause-6x.png"))); // NOI18N
        mediaImageView.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        songNameLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        songNameLabel.setText("Pyxis");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        jLabel4.setForeground(javax.swing.UIManager.getDefaults().getColor("Label.disabledShadow"));
        jLabel4.setText("Song");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        jLabel1.setForeground(javax.swing.UIManager.getDefaults().getColor("Label.disabledShadow"));
        jLabel1.setText("Artist");

        artistNameLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        artistNameLabel.setText("HOME");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        jLabel6.setForeground(javax.swing.UIManager.getDefaults().getColor("Label.disabledShadow"));
        jLabel6.setText("Album");

        albumNameLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        albumNameLabel.setText("Before The Night");

        javax.swing.GroupLayout songPanelLayout = new javax.swing.GroupLayout(songPanel);
        songPanel.setLayout(songPanelLayout);
        songPanelLayout.setHorizontalGroup(
            songPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(songPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(songPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(songNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(artistNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(albumNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addGroup(songPanelLayout.createSequentialGroup()
                        .addGroup(songPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        songPanelLayout.setVerticalGroup(
            songPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(songPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(songNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(artistNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(albumNameLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mediaImageView, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(songPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mediaImageView, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(songPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(292, 292, 292))
        );

        previousMediaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media-step-backward-4x.png"))); // NOI18N
        previousMediaButton.setBorderPainted(false);
        previousMediaButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pressed/media-step-backward-4x.png"))); // NOI18N

        timePassedLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        timePassedLabel.setText("0:00");

        nextMediaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media-step-forward-4x.png"))); // NOI18N
        nextMediaButton.setBorderPainted(false);
        nextMediaButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pressed/media-step-forward-4x.png"))); // NOI18N

        playPauseStopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media-play-6x.png"))); // NOI18N
        playPauseStopButton.setBorderPainted(false);
        playPauseStopButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pressed/media-play-6x.png"))); // NOI18N
        playPauseStopButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playPauseStopButtonMouseClicked(evt);
            }
        });

        songDurationLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        songDurationLabel.setText("4:20");

        javax.swing.GroupLayout controlsPanelLayout = new javax.swing.GroupLayout(controlsPanel);
        controlsPanel.setLayout(controlsPanelLayout);
        controlsPanelLayout.setHorizontalGroup(
            controlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(timePassedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(songProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(songDurationLabel)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(previousMediaButton)
                .addGap(32, 32, 32)
                .addComponent(playPauseStopButton)
                .addGap(29, 29, 29)
                .addComponent(nextMediaButton)
                .addGap(135, 135, 135))
        );
        controlsPanelLayout.setVerticalGroup(
            controlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playPauseStopButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextMediaButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(previousMediaButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(songProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timePassedLabel)
                    .addComponent(songDurationLabel))
                .addContainerGap())
        );

        volumeSlider.setMinorTickSpacing(20);
        volumeSlider.setPaintTicks(true);
        volumeSlider.setValue(0);
        volumeSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                volumeSliderMouseReleased(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volume-high-3x.png"))); // NOI18N
        jButton2.setBorderPainted(false);

        volumeLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        volumeLabel.setText("100");

        playersComboBox.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        playersComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kitchen", "Living Room" }));
        playersComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                playersComboBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout volumePanelLayout = new javax.swing.GroupLayout(volumePanel);
        volumePanel.setLayout(volumePanelLayout);
        volumePanelLayout.setHorizontalGroup(
            volumePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, volumePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(volumePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(playersComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(volumePanelLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(volumeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(volumeSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        volumePanelLayout.setVerticalGroup(
            volumePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(volumePanelLayout.createSequentialGroup()
                .addGroup(volumePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(volumePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(volumePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(volumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(volumePanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(volumeLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playersComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Queue", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Hiragino Kaku Gothic Std", 0, 16))); // NOI18N

        queueList.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        queueList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(queueList);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(volumePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(controlsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(volumePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(controlsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playPauseStopButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playPauseStopButtonMouseClicked

//        this.viewModel.setVolume(88);
//        this.viewModel.setPlayState(PlayStates.PAUSE);
//        this.viewModel.setSongProgress(88);
////        this.viewModel.setSongDuration(188);
//        this.viewModel.setPlayers(new Player[]{new Player("Keuken"), new Player("Kantoor")});
//
//        this.viewModel.setNowPlaying(new Song("Antidoteyy", "Travis Scott", "Rodeo (Deluxe)", "", "https://sslg.ulximg.com/image/355x355/cover/1408548992_f86acabb734b084285b46eb19b571c40.jpg/e359eac435751015388f20f9c9e9d36a/1408548992_travi_scott_days_before_rodeo_front_large_98.jpg", 188));
//
//        this.viewModel.setQueue(new Song[]{new Song("Mama (Just killed a man)")});
    }//GEN-LAST:event_playPauseStopButtonMouseClicked

    private void playersComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_playersComboBoxItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED) {
            int index = this.playersComboBox.getSelectedIndex();
            this.viewModel.changePlayer(index);
        }
    }//GEN-LAST:event_playersComboBoxItemStateChanged

    private void volumeSliderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volumeSliderMouseReleased
        this.viewModel.volumeUpdated(this.volumeSlider.getValue());
    }//GEN-LAST:event_volumeSliderMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel albumNameLabel;
    private javax.swing.JLabel artistNameLabel;
    private javax.swing.JPanel controlsPanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton mediaBackButton;
    private javax.swing.JList<String> mediaBrowserList;
    private javax.swing.JLabel mediaImageView;
    private javax.swing.JList<String> mediaProviderList;
    private javax.swing.JButton nextMediaButton;
    private javax.swing.JButton playPauseStopButton;
    private javax.swing.JComboBox<String> playersComboBox;
    private javax.swing.JButton previousMediaButton;
    private javax.swing.JList<String> queueList;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchMediaTextField;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JLabel songDurationLabel;
    private javax.swing.JLabel songNameLabel;
    private javax.swing.JPanel songPanel;
    private javax.swing.JProgressBar songProgressBar;
    private javax.swing.JLabel timePassedLabel;
    private javax.swing.JLabel volumeLabel;
    private javax.swing.JPanel volumePanel;
    private javax.swing.JSlider volumeSlider;
    // End of variables declaration//GEN-END:variables
}
