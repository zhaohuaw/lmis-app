package com.lmis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import us.monoid.json.JSONArray;
import us.monoid.json.JSONObject;

public class LmisArguments {

    public LmisArguments() {
        mArguments = new ArrayList();
    }

    public void add(Object object) {
        mArguments.add(object);
    }

    public void addNull() {
        mArguments.add(null);
    }

    public void add(List objects) {
        JSONArray ids = new JSONArray();
        try {
            ids = new JSONArray(objects.toString());
        } catch (Exception exception) {
        }
        mArguments.add(ids);
    }

    public List getObjects() {
        return mArguments;
    }

    public JSONArray getArray() {
        JSONArray arguments = new JSONArray();
        for (Iterator iterator = mArguments.iterator(); iterator.hasNext(); ) {
            Object obj = iterator.next();
            if (obj instanceof JSONObject)
                arguments.put(obj);
            else
                arguments.put(obj);
        }

        return arguments;
    }

    public JSONArray get() {
        JSONArray arguments = new JSONArray();
        for (Iterator iterator = mArguments.iterator(); iterator.hasNext(); ) {
            Object obj = iterator.next();
            JSONArray data = new JSONArray();
            data.put(obj);
            if (obj instanceof JSONObject)
                arguments.put(obj);
            else
                arguments.put(data);
        }

        return arguments;
    }

    List mArguments;
}

