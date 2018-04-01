package com.joker.mvp.moudle;

import com.joker.mvp.bean.User;

/**
 * IUserMoudel
 *
 * @author joker
 * @date 2018/3/30
 *
 */
public interface IUserMoudel  {
    void  setUserName(String name);
    void  setUserPwd(String pwd);
    User load();//读取user信息,返回一个User
}
