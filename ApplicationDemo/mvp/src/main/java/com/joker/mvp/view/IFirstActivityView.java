package com.joker.mvp.view;

import com.joker.mvp.bean.HotData;

/**
 * IFirstActivityView
 *
 * @author joker
 * @date 2018/3/30
 */
public interface IFirstActivityView {
    void  setData(HotData hotData);
    void setFailMessage(String error);
}
