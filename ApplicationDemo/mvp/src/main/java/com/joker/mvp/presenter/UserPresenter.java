package com.joker.mvp.presenter;

import com.joker.mvp.bean.User;
import com.joker.mvp.moudle.IUserMoudel;
import com.joker.mvp.moudle.UserModel;
import com.joker.mvp.view.IUserView;

/**
 * UserPresenter
 *
 * @author joker
 * @date 2018/3/30
 */
public class UserPresenter {
    private IUserMoudel iUserMoudel;
    private IUserView IUserView;

    public UserPresenter(com.joker.mvp.view.IUserView IUserView) {
        this.IUserView = IUserView;
        iUserMoudel=new UserModel();
    }
    public  void  saveUser(String name,String pwd){
        iUserMoudel.setUserName(name);
        iUserMoudel.setUserPwd(pwd);
    }
    public  void  loadUuser(){
        User user=iUserMoudel.load();
        IUserView.setUserName(user.getName());
        IUserView.setUserPwd(user.getPwd());
    }
}
