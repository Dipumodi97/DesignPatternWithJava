package com.dipu.lld.Builder_DesignPattern.builder.classImpl;

import com.dipu.lld.Builder_DesignPattern.builder.Interface.HouseBuilder;
import com.dipu.lld.Builder_DesignPattern.product.ClassImpl.IceBasement;
import com.dipu.lld.Builder_DesignPattern.product.ClassImpl.IceCurvingInterior;
import com.dipu.lld.Builder_DesignPattern.product.ClassImpl.IceRoofing;
import com.dipu.lld.Builder_DesignPattern.product.ClassImpl.IceStructure;
import com.dipu.lld.Builder_DesignPattern.product.appliedClass.House;

public class IglooHouseBuilder implements HouseBuilder {
    private House house;

    public IglooHouseBuilder() {
        System.out.println("IglooHouseBuilder.IglooHouseBuilder():: 0-Param Constructor");
        house = new House();
    }

    @Override
    public void buildBasement() {
        System.out.println("IglooHouseBuilder.buildBasement()");
        house.setBasement(new IceBasement());
    }

    @Override
    public void buildStructure() {
        System.out.println("IglooHouseBuilder.buildStructure()");
        house.setStructure(new IceStructure());
    }

    @Override
    public void buildRoofing() {
        System.out.println("IglooHouseBuilder.buildRoofing()");
        house.setRoofing(new IceRoofing());
    }

    @Override
    public void buildInterior() {
        System.out.println("IglooHouseBuilder.buildInterior()");
        house.setInterior(new IceCurvingInterior());
    }

    @Override
    public House createHouse() {
        return house;
    }
}
