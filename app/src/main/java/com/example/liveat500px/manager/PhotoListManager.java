package com.example.liveat500px.manager;

import android.content.Context;

import com.example.liveat500px.dao.PhotoItemCollectionDao;
import com.inthecheesefactory.thecheeselibrary.manager.Contextor;

public class PhotoListManager {

    private Context mContext;
    private PhotoItemCollectionDao dao;

    public PhotoListManager() {
        //Load data from Persistent Storage
        mContext = Contextor.getInstance().getContext();
    }

    public PhotoItemCollectionDao getDao() {

        return dao;
    }

    public void setDao(PhotoItemCollectionDao dao) {
        this.dao = dao;
    }

    public int getMaximumId() {
        if (dao == null)
            return 0;
        if (dao.getData() == null)
            return 0;
        if (dao.getData().size() == 0)
            return 0;
        int maxId = dao.getData().get(0).getId();
        for (int i = 1; i < dao.getData().size(); i++)
            maxId = Math.max(maxId, dao.getData().get(i).getId());
        return maxId;
    }

    public int getCount() {
        if (dao == null)
            return 0;
        if (dao.getData() == null)
            return 0;
        return dao.getData().size();
    }
}
