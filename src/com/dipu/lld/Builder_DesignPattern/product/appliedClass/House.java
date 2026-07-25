package com.dipu.lld.Builder_DesignPattern.product.appliedClass;

import com.dipu.lld.Builder_DesignPattern.product.ClassImpl.ConcreteBasement;
import com.dipu.lld.Builder_DesignPattern.product.InterfaceCreation.Basement;
import com.dipu.lld.Builder_DesignPattern.product.InterfaceCreation.Interior;
import com.dipu.lld.Builder_DesignPattern.product.InterfaceCreation.Roofing;
import com.dipu.lld.Builder_DesignPattern.product.InterfaceCreation.Structure;

public class House {

    private Basement  basement;
    private Interior interior;
    private Roofing roofing;
    private Structure structure;

    public Basement getBasement(ConcreteBasement concreteBasement) {
        return basement;
    }

    public void setBasement(Basement basement) {
        this.basement = basement;
    }

    public Roofing getRoofing() {
        return roofing;
    }

    public void setRoofing(Roofing roofing) {
        this.roofing = roofing;
    }

    public Interior getInterior() {
        return interior;
    }

    public void setInterior(Interior interior) {
        this.interior = interior;
    }

    public Structure getStructure() {
        return structure;
    }

    public void setStructure(Structure structure) {
        this.structure = structure;
    }

    @Override
    public String toString() {
        return "House{" +
                "basement=" + basement +
                ", interior=" + interior +
                ", roofing=" + roofing +
                ", structure=" + structure +
                '}';
    }
}
