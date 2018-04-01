package com.joker.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import com.joker.mvp.bean.HotData;
import com.joker.mvp.presenter.FirstActivityPresenter;
import com.joker.mvp.view.IFirstActivityView;

public class NetWorkDataMVPActivity extends AppCompatActivity  implements IFirstActivityView{
    ListView listView;
   FirstActivityPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_net_work_data_mvp);
        listView = (ListView) findViewById(R.id.listview);
        presenter=new FirstActivityPresenter(this);
        presenter.getListData();
    }

    @Override
    public void setData(HotData hotData) {
        listView.setAdapter(new MyAdapter(hotData.getData(),this));
    }

    @Override
    public void setFailMessage(String error) {
        Log.e("======","=FirstActivity请求失败的原因是====="+error);

    }
}
