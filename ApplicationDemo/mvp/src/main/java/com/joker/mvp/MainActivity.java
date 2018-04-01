package com.joker.mvp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * mvp:使用本地数据和网络数据分别说明MVP模式
 * <p>
 * 1.本地数据
 * Moudel IUserMoudle UserMoudel:设置数据（例如：保存用户密码），读取数据（例如读取一个用户）
 * View: IUserView:一般是Activity实现；接口中声明设置数据和取数据的方法（例如：Set或者Get方法）
 * Presenter:UserPresenter:协助UserMoudle和IUserView，使用UserMoudle保存，利用UserMoudel取出数据给IUserView
 * <p>
 * 2.网络数据
 * Model:IFirstActivityModel FirstActivityModel:使用retrofit加载网络数据(获取数据)
 * View: IFirstActivityView:一般是Activity实现:处理得到的结果交给IFirstActivityView
 * Presenter:FirstActivityPresenter:协调FirstActivityModel和IFirstActivityView,使用FirstActivityModel得到数据,交给接口暂存
 * 利用暂存接口将数据给IFirstActivityView进行处理展示
 * <p>
 * 优点：
 * 1.降低耦合度
 * 2.模块职责划分明显
 * 3.利于测试驱动开发
 * 4.代码复用
 * 5.隐藏数据
 * 6.代码灵活性
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void  localDataByMVP(View view){
        startActivity(new Intent(MainActivity.this,LocalDataMVPActivity.class));
    }
    public void networkDataByMVP(View view){
        startActivity(new Intent(MainActivity.this,NetWorkDataMVPActivity.class));
    }
}
