package com.dipu.lld.Builder_DesignPattern.factory;

import com.dipu.lld.Builder_DesignPattern.builder.Interface.HouseBuilder;
import com.dipu.lld.Builder_DesignPattern.builder.classImpl.ConcreteHouseBuilder;
import com.dipu.lld.Builder_DesignPattern.builder.classImpl.IglooHouseBuilder;
import com.dipu.lld.Builder_DesignPattern.builder.classImpl.WoodenHouseBuilder;
import com.dipu.lld.Builder_DesignPattern.director.CivilEngineer;
import com.dipu.lld.Builder_DesignPattern.product.appliedClass.House;

public class HouseFactory {

    // Factory Pattern
    public static House getInstance(String type){
        House house = null;
        HouseBuilder houseBuilder = null;

        if(type.equalsIgnoreCase("concrete"))
            houseBuilder = new ConcreteHouseBuilder();
        else if (type.equalsIgnoreCase("wooden"))
            houseBuilder = new WoodenHouseBuilder();
        else if(type.equalsIgnoreCase("igloo"))
            houseBuilder = new IglooHouseBuilder();
        else
            throw new IllegalArgumentException("Invalid House Type ");

        // Create Director Object
        CivilEngineer civilEngineer = new CivilEngineer(houseBuilder);
        // construct the house / product
        civilEngineer.constructHouse();
        // get House(Product)
        house = civilEngineer.getHouse();

        return house;
    }
}
