package com.yaya.rxjava;

import io.reactivex.*;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class JavaRx {

    private final Observable<String> observable;

    public JavaRx() {

        observable = Observable.create(e -> {
            System.out.println("hello, " + Thread.currentThread().getName());
            e.onNext("hello");
            System.out.println("hello, " + Thread.currentThread().getName());
            e.onNext("world");
            e.onComplete();
        });
    }

    public void observerTest() {
        Observer<String> observer = new Observer<String>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                System.out.println("onSubscribe");
            }

            @Override
            public void onNext(@NonNull String s) {
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
        observable.observeOn(Schedulers.newThread())
                .subscribe(observer);
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public void composeTest() {
        observable.compose(new ObservableTransformer<String, Integer>() {
            @NonNull
            @Override
            public ObservableSource<Integer> apply(@NonNull Observable<String> upstream) {
                return upstream.map(s -> 1);
            }
        }).subscribe(integer -> System.out.println("Integer: " + integer));
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public void mapTest() {
        observable.map(new Function<String, Integer>() {
            @Override
            public Integer apply(@NonNull String s) throws Exception {
                return 2;
            }
        }).subscribe(integer -> System.out.println("Integer: " + integer));
    }


    @SuppressWarnings("ResultOfMethodCallIgnored")
    public void flatMapTest() {
        observable.flatMap(new Function<String, ObservableSource<Integer>>() {
            @Override
            public ObservableSource<Integer> apply(@NonNull String s) throws Exception {
                return Observable.create(new ObservableOnSubscribe<Integer>() {
                    @Override
                    public void subscribe(@NonNull ObservableEmitter<Integer> e) throws Exception {
                        e.onNext(3);
                        e.onNext(4);
                    }
                });
            }
        }).subscribe(integer -> System.out.println("Integer: " + integer));
    }
}