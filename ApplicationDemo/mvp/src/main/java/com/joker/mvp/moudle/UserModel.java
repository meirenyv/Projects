package com.joker.mvp.moudle;

import com.joker.mvp.bean.User;

/**
 * UserModel
 *
 * @author joker
 * @date 2018/3/30
 */
public class UserModel implements IUserMoudel {
    String mName;
    String mPwd;

    @Override
    public void setUserName(String name) {
        mName = name;
    }

    @Override
    public void setUserPwd(String pwd) {
        mPwd = pwd;
    }

    @Override
    public User load() {
        return new User(mName, mPwd);
    }
}
