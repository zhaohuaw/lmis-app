/*
 * OpenERP, Open Source Management Solution
 * Copyright (C) 2012-today OpenERP SA (<http://www.openerp.com>)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 * 
 */
package com.lmis.support;

import java.util.HashMap;

import org.json.JSONArray;

import com.lmis.orm.LmisDatabase;

/**
 * The Interface SyncHelper.
 */
public interface SyncHelper {

    /**
     * Sync with server.
     *
     * @param db   the db
     * @param args the args
     * @return the hash map
     */
    public HashMap<String, Object> syncWithServer(LmisDatabase db, JSONArray args);
}
