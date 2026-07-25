package com.dipu.lld.Builder_DesignPattern.director;

import com.dipu.lld.Builder_DesignPattern.builder.Interface.HouseBuilder;
import com.dipu.lld.Builder_DesignPattern.product.appliedClass.House;

public class CivilEngineer {

    private HouseBuilder houseBuilder;

    public CivilEngineer(HouseBuilder houseBuilder) {
        System.out.println("CivilEngineer :: 1-param constructor");
        this.houseBuilder = houseBuilder;
    }
    // method containing logic of house construction
    public void constructHouse() {
        System.out.println("CivilEngineer.constructHouse()");
        houseBuilder.buildBasement();
        houseBuilder.buildInterior();
        houseBuilder.buildRoofing();
        houseBuilder.buildStructure();
    }

    // method giving product
    public House getHouse(){
        System.out.println("CivilEngineer.getHouse()");
        return houseBuilder.createHouse();
    }
}
