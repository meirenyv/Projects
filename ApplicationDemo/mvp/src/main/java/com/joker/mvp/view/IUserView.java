package com.joker.mvp.view;

/**
 * IUserView
 *
 * @author joker
 * @date 2018/3/30
 */
public interface IUserView {
    String getUserName();
    String getUserPwd();
    void setUserName(String name);
    void  setUserPwd(String pwd);
}
