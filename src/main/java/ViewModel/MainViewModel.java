/*
 * Copyright (C) 2017 bartkneepkens
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
package ViewModel;

import Gui.Observers.ObservablePropertyNames;
import PlayerCommands.Player;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author bartkneepkens
 */
public class MainViewModel {
    public PropertyChangeSupport changes = new PropertyChangeSupport(this);
    private int volume;
    
    private String state;
    private int songProgress;
    private int songDuration;
    
    private String mediaImageUrl;
    
    private Player[] players;
    
    public MainViewModel() {
        
    }
    
    
    // MAKE these setters private.
    // Public for now, for testing purposes.
    public void setVolume(int volume) {
        int oldVolume = this.volume;
        this.volume = volume;
        changes.firePropertyChange(ObservablePropertyNames.VOLUME, oldVolume, volume);
    }
    
    public void setPlayState(String state) {
        String oldState = this.state;
        this.state = state;
        changes.firePropertyChange(ObservablePropertyNames.PLAYSTATE, oldState, state);
    }
    
    public void setSongProgress(int progress) {
        int oldProgress = this.songProgress;
        this.songProgress = progress;
        changes.firePropertyChange(ObservablePropertyNames.SONGPROGRESS, oldProgress, progress);
    }
    
    public void setSongDuration(int duration) {
        int oldDuration = this.songDuration;
        this.songDuration = duration;
        changes.firePropertyChange(ObservablePropertyNames.SONGDURATION, oldDuration, duration);
    }
    
    public void setMediaImage(String url) {
        // Load image somehow
        // Should I load the image from URL in the observer itself or here?
        // Image Object in ViewModel because View should be dumb.
        // But... the VM should also be UI independent.
        
        String oldURl = this.mediaImageUrl;
        this.mediaImageUrl = url;
        changes.firePropertyChange(ObservablePropertyNames.SONGIMAGE, oldURl, url);
    }
    
    public void setPlayers(Player[] players) {
        Player[] oldPlayers = this.players;
        this.players = players;
        changes.firePropertyChange(ObservablePropertyNames.PLAYERS, oldPlayers, players);
    }

}