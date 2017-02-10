package com.gp.rxjavaretrofitdemo.subscribers;

/**
 * Created by ping6 on 2017/2/10.
 */

public interface SubscriberOnNextListener<T> {
    void onNext(T t);
}
