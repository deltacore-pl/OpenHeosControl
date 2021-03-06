/*
 * Copyright (C) 2016 bart-kneepkens
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
package PlayerCommands;

/**
 * Commands that can be sent to a HEOS player.
 * @author bart-kneepkens
 */
public class PlayerCommands {
    public static final String GET_PLAY_STATE(String pid){
        return "heos://player/get_play_state?pid=" + pid;
    }
    
    public static final String SET_PLAY_STATE(String pid, String state){
        return "heos://player/set_play_state?pid=" + pid + "&state=" + state;
    }
    
    public static final String GET_VOLUME(String pid){
        return "heos://player/get_volume?pid=" + pid;
    }
    
    public static final String SET_VOLUME(String pid, int level){
        return "heos://player/set_volume?pid=" + pid + "&level=" + String.valueOf(level);
    }
    
    public static final String VOLUME_UP(String pid, int step){
        return "heos://player/volume_up?pid=" + pid + "&step=" + String.valueOf(step);
    }
    
    public static final String VOLUME_DOWN(String pid, int step){
        return "heos://player/volume_down?pid=" + pid + "&step=" + String.valueOf(step);
    }
    
    public static final String GET_NOW_PLAYING_MEDIA(String pid){
        return "heos://player/get_now_playing_media?pid=" + pid;
    }
}
