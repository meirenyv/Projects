package com.joker.mvp.presenter;

import com.joker.mvp.bean.HotData;
import com.joker.mvp.callback.OnGetDataListener;
import com.joker.mvp.moudle.FirstAcitivityModel;
import com.joker.mvp.moudle.IFristActivityModel;
import com.joker.mvp.view.IFirstActivityView;

/**
 * FirstActivityPresenter
 *
 * @author joker
 * @date 2018/3/30
 */
public class FirstActivityPresenter implements OnGetDataListener, BasePresenter {
   IFirstActivityView iFirstActivityView;
   IFristActivityModel iFristActivityModel;

    public FirstActivityPresenter(IFirstActivityView iFirstActivityView) {
        this.iFirstActivityView = iFirstActivityView;
        iFristActivityModel=new FirstAcitivityModel(this);
    }
    public  void  getListData(){
        iFristActivityModel.loadData();
    }

    @Override
    public void onSuccessGetDataListener(HotData hotData) {
        if (iFirstActivityView != null)
            iFirstActivityView.setData(hotData);
    }

    @Override
    public void onFailGetDataListener(String errMessage) {
        if (iFirstActivityView != null)
        iFirstActivityView.setFailMessage(errMessage);

    }


    @Override
    public void onDestroy() {
        iFirstActivityView=null;
    }
}
