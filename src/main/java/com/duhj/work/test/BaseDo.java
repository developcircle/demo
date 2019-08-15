package com.duhj.work.test;

import lombok.Data;

import java.io.Serializable;

/**
 * @author duhj
 * @date 2019/8/14 10:32
 */
@Data
public class BaseDo implements Serializable {

    private static final long serialVersionUID = -7989213662799603158L;
    private String id;

    private String name;

    private TestEnum type;






    enum TestEnum{
          per("403","permission limit "), not("404","not found");

        TestEnum( String code,String desc) {
            this.desc = desc;
            this.code = code;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        private String desc;

        private String code;

       public  TestEnum getValue(String  code){

           for(TestEnum testEnum1: TestEnum.values()){
               if(testEnum1.getCode().equals(code)){
                   return testEnum1;
               }

           }
           throw new IllegalArgumentException("illegal TestEnum code : " + code);

       }

    }
}
