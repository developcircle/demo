package com.duhj.work.controller;

import com.duhj.work.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author duhj
 * @date 2019/8/14 17:19
 */
@RestController
public class TestController {

    @Autowired
    private AsyncService asyncService;

    /**
     * 异步
     * @return
     */
    @GetMapping("async")
    public Object async() {
        long start = System.currentTimeMillis();

        asyncService.asyncThread();

        return System.currentTimeMillis() - start;

    }

    /**
     * 同步
     * @return
     */
    @GetMapping("sync")
    public Object sync() {
        long start = System.currentTimeMillis();
        asyncService.syncThread();
        return System.currentTimeMillis() - start;

    }




}
