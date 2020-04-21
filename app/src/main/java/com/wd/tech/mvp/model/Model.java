package com.wd.tech.mvp.model;



import com.wd.tech.mvp.util.NetUtil;
import com.wd.tech.mvp.contract.Contract;

import java.util.Map;


public class Model implements Contract.IModel {


    @Override
    public void getInfo(String url, Class cls, Contract.ModelCallBack callBack) {
        NetUtil.getInstance().getInfo(url, cls, new NetUtil.NetCallBack() {
            @Override
            public void onSuccess(Object o) {
                callBack.onSuccess(o);
            }

            @Override
            public void onError(String error) {
                callBack.onError(error);
            }
        });
    }

    @Override
    public void getInfoHava(String url, Class cls, Map<String, Object> map, Contract.ModelCallBack callBack) {
        NetUtil.getInstance().getInfoHava(url, cls, map, new NetUtil.NetCallBack() {
            @Override
            public void onSuccess(Object o) {
                callBack.onSuccess(o);
            }

            @Override
            public void onError(String error) {
                callBack.onError(error);
            }
        });
    }

    @Override
    public void postInfoHava(String url, Class cls, Map<String, Object> map, Contract.ModelCallBack callBack) {
        NetUtil.getInstance().postInfoHava(url, cls, map, new NetUtil.NetCallBack() {
            @Override
            public void onSuccess(Object o) {
                callBack.onSuccess(o);
            }

            @Override
            public void onError(String error) {
                callBack.onError(error);
            }
        });
    }

    @Override
    public void putInfoHava(String url, Class cls, Map<String, Object> map, Contract.ModelCallBack callBack) {
        NetUtil.getInstance().putInfoHava(url, cls, map, new NetUtil.NetCallBack() {
            @Override
            public void onSuccess(Object o) {
                callBack.onSuccess(o);
            }

            @Override
            public void onError(String error) {
                callBack.onError(error);
            }
        });
    }

    @Override
    public void deleteInfoHava(String url, Class cls, Map<String, Object> map, Contract.ModelCallBack callBack) {
        NetUtil.getInstance().deleteInfoHava(url, cls, map, new NetUtil.NetCallBack() {
            @Override
            public void onSuccess(Object o) {
                callBack.onSuccess(o);
            }

            @Override
            public void onError(String error) {
                callBack.onError(error);
            }
        });
    }
}
