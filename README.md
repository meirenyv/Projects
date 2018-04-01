
mvp:使用本地数据和网络数据分别说明MVP模式
 * <p>
 1.本地数据
 * Moudel IUserMoudle UserMoudel:设置数据（例如：保存用户密码），读取数据（例如读取一个用户）
 * View: IUserView:一般是Activity实现；接口中声明设置数据和取数据的方法（例如：Set或者Get方法）
 * Presenter:UserPresenter:协助UserMoudle和IUserView，使用UserMoudle保存，利用UserMoudel取出数据给IUserView
 * <p>
 2.网络数据
 * Model:IFirstActivityModel FirstActivityModel:使用retrofit加载网络数据(获取数据)
 * View: IFirstActivityView:一般是Activity实现:处理得到的结果交给IFirstActivityView
 * Presenter:FirstActivityPresenter:协调FirstActivityModel和IFirstActivityView,使用FirstActivityModel得到数据,交给接口暂存
 * 利用暂存接口将数据给IFirstActivityView进行处理展示
 * <p>
   
  优点：
 * 1.降低耦合度
 * 2.模块职责划分明显
 * 3.利于测试驱动开发
 * 4.代码复用
 * 5.隐藏数据
 * 6.代码灵活性
   
  解决的mvp的生命周期的方案:
  Presenter控制逻辑,也就是控制网络操作,绑定数据,一系列逻辑都在这.那么,当activity关闭以后,Presenter怎么处理网络请求,异步操作呢?
  如果acitivity已经关闭了,而网络操作又没走完.就会内存泄漏.会不会空指针不好说.
  在P层也就是FirstActivityPresenter做View的判空处理
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
    然后在销毁页面时 也就是onDestroy（）将view置为null
       @Override
    public void onDestroy() {
        iFirstActivityView=null;
    }

