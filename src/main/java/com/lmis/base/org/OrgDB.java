package com.lmis.base.org;

import android.content.Context;

import com.lmis.orm.LmisColumn;
import com.lmis.orm.LmisDataRow;
import com.lmis.orm.LmisDatabase;
import com.lmis.orm.LmisFields;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chengdh on 14-5-24.
 * 组织机构数据表
 */
public class OrgDB extends LmisDatabase {

    public OrgDB(Context context) {
        super(context);
    }

    @Override
    public String getModelName() {
        return "org";
    }

    @Override
    public List<LmisColumn> getModelColumns() {
        List<LmisColumn> cols = new ArrayList<LmisColumn>();

        cols.add(new LmisColumn("name", "Name", LmisFields.varchar(128)));
        cols.add(new LmisColumn("simp_name", "Simple Name", LmisFields.varchar(128)));
        cols.add(new LmisColumn("parent_id", "Parent Org", LmisFields.integer()));
        cols.add(new LmisColumn("phone", "Phone", LmisFields.varchar(20)));
        cols.add(new LmisColumn("manager", "Manager", LmisFields.varchar(40)));
        cols.add(new LmisColumn("location", "Location", LmisFields.varchar(60)));
        cols.add(new LmisColumn("code", "Code", LmisFields.varchar(20)));
        cols.add(new LmisColumn("is_summary", "Is Summary", LmisFields.varchar(20)));
        cols.add(new LmisColumn("is_yard", "Is Yard", LmisFields.varchar(20)));
        return cols;
    }

    /**
     * 获取给定机构的子机构.
     *
     * @param parentID the parent iD
     * @return the list
     */
    public List<LmisDataRow> getChildrenOrgs(int parentID){
        String where = "parent_id = ?";
        String[] wherArgs = {parentID+""};
        return this.select(where,wherArgs);
    }
}
