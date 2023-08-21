package cn.feiyingmoke.designpattern.factory;


/**
 * Author: feiyingmoke.cn
 * Copyright © 2023 feiyingmoke.cn. All rights reserved.
 */
public class FactoryDemo {


    public static void main(String[] args) {

        // 创建computer工厂
        ComputerFactory computerFactory = new ComputerFactory();
        // 获取 huawei的对象，调用buy方法
        Computer huawei = computerFactory.getComputer("HUAWEI");
        huawei.buy();
        // 获取 apple的对象，调用buy方法
        Computer apple = computerFactory.getComputer("APPLE");
        apple.buy();
        // 获取 xiaomi的对象，调用buy方法
        Computer xiaomi = computerFactory.getComputer("XIAOMI");
        xiaomi.buy();

    }

}
