/* == This file is part of Tomahawk Player - <http://tomahawk-player.org> ===
 *
 *   Copyright 2013, Enno Gottschalk <mrmaffen@googlemail.com>
 *
 *   Tomahawk is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   Tomahawk is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with Tomahawk. If not, see <http://www.gnu.org/licenses/>.
 */
package org.tomahawk.libtomahawk.hatchet;

import com.google.common.collect.Multimap;

import org.tomahawk.libtomahawk.collection.Collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InfoRequestData {

    public static final int INFOREQUESTDATA_TYPE_TRACKS = 400;

    public static final int INFOREQUESTDATA_TYPE_ARTISTS = 600;

    public static final int INFOREQUESTDATA_TYPE_ARTISTS_TOPHITS = 601;

    public static final int INFOREQUESTDATA_TYPE_ARTISTS_ALBUMS = 602;

    public static final int INFOREQUESTDATA_TYPE_ALBUMS = 700;

    public static final int INFOREQUESTDATA_TYPE_USERS = 800;

    public static final int INFOREQUESTDATA_TYPE_USERS_PLAYLISTS = 801;

    public static final int INFOREQUESTDATA_TYPE_USERS_PLAYLISTS_ALL = 802;

    public static final int INFOREQUESTDATA_TYPE_PLAYLISTS_ENTRIES = 1000;

    private String mRequestId;

    private int mType;

    private Object mInfoResult;

    private Map<String, Map> mInfoResultMap;

    private Multimap<String, String> mParams;

    public InfoRequestData(String requestId, int type, Multimap<String, String> params) {
        mRequestId = requestId;
        mType = type;
        mParams = params;
    }

    public String getRequestId() {
        return mRequestId;
    }

    public int getType() {
        return mType;
    }

    public Object getInfoResult() {
        return mInfoResult;
    }

    public void setInfoResult(Object infoResult) {
        mInfoResult = infoResult;
    }

    public Map<String, Map> getInfoResultMap() {
        return mInfoResultMap;
    }

    public void setInfoResultMap(Map<String, Map> infoResultMap) {
        mInfoResultMap = infoResultMap;
    }

    public Multimap<String, String> getParams() {
        return mParams;
    }
}
