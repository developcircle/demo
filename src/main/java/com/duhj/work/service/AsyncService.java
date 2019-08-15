package com.duhj.work.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author duhj
 * @date 2019/8/14 17:27
 */
@Service
public class AsyncService {
    @Async
    public void asyncThread() {
        try {
            Thread.sleep(50 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void syncThread() {
        try {
            Thread.sleep(50 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



}
