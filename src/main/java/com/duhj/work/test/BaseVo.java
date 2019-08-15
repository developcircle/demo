package com.duhj.work.test;

import lombok.Data;

import java.io.Serializable;

/**
 * @author duhj
 * @date 2019/8/14 10:44
 */
@Data
public class BaseVo  implements Serializable {

    private static final long serialVersionUID = -9146727048746078978L;
    private String id;

    private String name;

    private String type;
}
