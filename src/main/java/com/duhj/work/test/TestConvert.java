package com.duhj.work.test;

import org.springframework.cglib.beans.BeanCopier;
import org.springframework.util.ObjectUtils;

/**
 * 属性拷贝
 * @author duhj
 * @date 2019/8/14 10:30
 */
public class TestConvert {

    private static BeanCopier beanCopier = BeanCopier.create(BaseDo.class,
            BaseVo.class, false);

    public static BaseVo doToVo(BaseDo baseDo) {
        if (ObjectUtils.isEmpty(baseDo)) {
            return null;
        }
        BaseVo baseVo = new BaseVo();
        beanCopier.copy(baseDo, baseVo, (val, aClass, o1) -> val);
        baseVo.setType(baseDo.getType().getCode());
        System.out.println(baseVo.toString());
        return baseVo;
    }

    public static void main(String[] args) {
        BaseDo baseDo = new BaseDo();
        baseDo.setId("1");
        baseDo.setName("do");
        baseDo.setType(BaseDo.TestEnum.per);
        doToVo(baseDo);
    }


}
