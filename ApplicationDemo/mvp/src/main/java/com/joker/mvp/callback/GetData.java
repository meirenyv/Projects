package com.joker.mvp.callback;

import com.joker.mvp.bean.HotData;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * GetData
 *
 * @author joker
 * @date 2018/3/30
 */
public interface GetData {
    @GET("/index.php?_p=api&_a=carousel")
    Call<HotData>getHotListData();
}
