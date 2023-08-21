package cn.feiyingmoke.designpattern.factory;

/**
 * Author: feiyingmoke.cn
 * Copyright © 2023 feiyingmoke.cn. All rights reserved.
 */
public class ComputerFactory {

    // 使用 getComputer 方法获取电脑类型的对象
    public Computer getComputer(String type){
        if(type == null){
            return null;
        }
        if("HUAWEI".equalsIgnoreCase(type)){
            return new Huawei();
        } else if("APPLE".equalsIgnoreCase(type)){
            return new Apple();
        } else if("XIAOMI".equalsIgnoreCase(type)){
            return new Xiaomi();
        }
        return null;
    }

}
