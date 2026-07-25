package com.dipu.lld.Builder_DesignPattern.test;

import com.dipu.lld.Builder_DesignPattern.builder.Interface.HouseBuilder;
import com.dipu.lld.Builder_DesignPattern.factory.HouseFactory;
import com.dipu.lld.Builder_DesignPattern.product.appliedClass.House;

public class BuilderDPTest {
    public static void main(String[] args) {
        // get Product/House using the Factory
        House house = HouseFactory.getInstance("igloo");
        System.out.println(house);
    }
}
