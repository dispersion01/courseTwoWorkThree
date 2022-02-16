package ru.spypro.homework;

import java.util.Objects;

public class Vehicles {
    private String modelName;
    private int wheelsCount;

    public Vehicles(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicles vehicles = (Vehicles) o;
        return wheelsCount == vehicles.wheelsCount && Objects.equals(modelName, vehicles.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "Модель '" + modelName + '\'' +
                ", Количество колес" + wheelsCount +
                '}';
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
