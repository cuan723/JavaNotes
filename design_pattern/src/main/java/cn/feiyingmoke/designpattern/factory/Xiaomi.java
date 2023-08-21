package cn.feiyingmoke.designpattern.factory;

/**
 * Author: feiyingmoke.cn
 * Copyright © 2023 feiyingmoke.cn. All rights reserved.
 */
public class Xiaomi implements Computer{
    @Override
    public void buy() {
        System.out.println("买小米电脑");
    }
}
