package com.yaya.rxjava;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainRxJava {

    public static void main(String[] args) {
        Observer<String> observer = new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("onSubscribe");
            }

            @Override
            public void onNext(String s) {
                System.out.println("onNext:" + s + ", Thread:" + Thread.currentThread().getName());
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("onError:" + e.toString());
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        };

        Observable<String> observable = Observable.create(e -> {
            System.out.println("hello, " + Thread.currentThread().getName());
            e.onNext("hello");
            System.out.println("hello, " + Thread.currentThread().getName());
            e.onNext("world");
            e.onComplete();
        });

        observable/*.subscribeOn(Schedulers.newThread())*/
                .observeOn(Schedulers.newThread())
                .subscribe(observer);
    }
}