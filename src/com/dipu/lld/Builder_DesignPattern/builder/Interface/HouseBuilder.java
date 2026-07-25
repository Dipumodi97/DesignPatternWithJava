package com.dipu.lld.Builder_DesignPattern.builder.Interface;

import com.dipu.lld.Builder_DesignPattern.product.appliedClass.House;

public interface HouseBuilder {

    public void buildBasement();
    public void buildStructure();
    public void buildRoofing();
    public void buildInterior();
    public House createHouse();
}
