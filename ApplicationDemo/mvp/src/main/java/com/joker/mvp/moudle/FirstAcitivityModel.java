package com.joker.mvp.moudle;

import com.joker.mvp.callback.OnGetDataListener;
import com.joker.mvp.http.HttpUtils;

/**
 * FirstAcitivityModel
 *
 * @author joker
 * @date 2018/3/30
 */
public class FirstAcitivityModel implements  IFristActivityModel {
   OnGetDataListener  mOnGetDataListener;

    public FirstAcitivityModel(OnGetDataListener onGetDataListener) {
        mOnGetDataListener = onGetDataListener;
    }

    @Override
    public void loadData() {
        HttpUtils httpUtils=HttpUtils.getHttpUtils();
        httpUtils.getListData("http://interfaces.ziroom.com/");
        httpUtils.setOnGetDataListener(mOnGetDataListener);
    }
}
