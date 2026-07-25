package com.dipu.lld.Builder_DesignPattern.builder.classImpl;

import com.dipu.lld.Builder_DesignPattern.builder.Interface.HouseBuilder;
import com.dipu.lld.Builder_DesignPattern.product.ClassImpl.WoodenBasement;
import com.dipu.lld.Builder_DesignPattern.product.ClassImpl.WoodenInterior;
import com.dipu.lld.Builder_DesignPattern.product.ClassImpl.WoodenRoofing;
import com.dipu.lld.Builder_DesignPattern.product.ClassImpl.WoodenStructure;
import com.dipu.lld.Builder_DesignPattern.product.appliedClass.House;

public class WoodenHouseBuilder implements HouseBuilder {

    private House house;

    public WoodenHouseBuilder() {
        System.out.println("WoodenHouseBuilder.WoodenHouseBuilder()");
        house = new  House();
    }

    @Override
    public void buildBasement() {
        System.out.println("WoodenHouseBuilder.buildBasement()");
        house.setBasement(new WoodenBasement());
    }

    @Override
    public void buildStructure() {
        System.out.println("WoodenHouseBuilder.buildStructure()");
        house.setStructure(new WoodenStructure());
    }

    @Override
    public void buildRoofing() {
        System.out.println("WoodenHouseBuilder.buildRoofing()");
        house.setRoofing(new WoodenRoofing());
    }

    @Override
    public void buildInterior() {
        System.out.println("WoodenHouseBuilder.buildInterior()");
        house.setInterior(new WoodenInterior());
    }

    @Override
    public House createHouse() {
        System.out.println("WoodenHouseBuilder.createHouse()");
        return house;
    }
}
