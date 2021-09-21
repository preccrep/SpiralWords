package com.preccrep.spiralwords.api;

public interface PreccrepCallback {
    void onSuccess(String res);

    void onFailure(Exception e);
}
