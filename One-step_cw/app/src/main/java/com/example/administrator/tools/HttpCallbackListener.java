package com.example.administrator.tools;

public interface HttpCallbackListener {

    void onFinish(String response);
    void onError(Exception e);
}