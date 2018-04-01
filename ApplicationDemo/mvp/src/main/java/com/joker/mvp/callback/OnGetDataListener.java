package com.joker.mvp.callback;

import com.joker.mvp.bean.HotData;

/**
 * OnGetDataListener
 *
 * @author joker
 * @date 2018/3/30
 */
public interface OnGetDataListener {
    void onSuccessGetDataListener(HotData hotData);
    void  onFailGetDataListener(String errMessage);
}

