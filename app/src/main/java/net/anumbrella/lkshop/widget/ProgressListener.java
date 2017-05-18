package net.anumbrella.lkshop.widget;


public interface ProgressListener {

    void onProgress(long progress, long total, boolean done);
}