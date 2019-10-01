package com.songoda.epicfarming.farming;

import com.songoda.epicfarming.EpicFarming;

import java.util.ArrayList;
import java.util.List;

public class Level {

    private int level, costExperiance, costEconomy, radius, pages;

    private double speedMultiplier;

    private boolean autoHarvest, autoReplant, autoBreeding;

    private List<String> description = new ArrayList<>();

    Level(int level, int costExperiance, int costEconomy, double speedMultiplier, int radius, boolean autoHarvest, boolean autoReplant, boolean autoBreeding, int pages) {
        this.level = level;
        this.costExperiance = costExperiance;
        this.costEconomy = costEconomy;
        this.speedMultiplier = speedMultiplier;
        this.radius = radius;
        this.autoHarvest = autoHarvest;
        this.autoReplant = autoReplant;
        this.autoBreeding = autoBreeding;
        this.pages = pages;

        EpicFarming instance = EpicFarming.getInstance();

        description.add(instance.getLocale().getMessage("interface.button.radius")
                .processPlaceholder("radius", radius).getMessage());

        description.add(instance.getLocale().getMessage("interface.button.speed")
                .processPlaceholder("speed", speedMultiplier).getMessage());

        if (autoHarvest)
            description.add(instance.getLocale().getMessage("interface.button.autoharvest")
                    .processPlaceholder("status", autoHarvest).getMessage());

        if (autoReplant)
            description.add(instance.getLocale().getMessage("interface.button.autoreplant")
                    .processPlaceholder("status", autoReplant).getMessage());

        if (autoBreeding)
            description.add(instance.getLocale().getMessage("interface.button.autobreeding")
                    .processPlaceholder("status", autoBreeding).getMessage());

        if (pages > 1)
            description.add(instance.getLocale().getMessage("interface.button.pages")
                    .processPlaceholder("amount", pages).getMessage());

    }

    public List<String> getDescription() {
        return new ArrayList<>(description);
    }

    public int getLevel() {
        return level;
    }

    public int getRadius() {
        return radius;
    }

    public boolean isAutoHarvest() {
        return autoHarvest;
    }

    public boolean isAutoReplant() {
        return autoReplant;
    }

    public boolean isAutoBreeding() {
        return autoBreeding;
    }

    public int getPages() {
        return pages;
    }

    public double getSpeedMultiplier() {
        return speedMultiplier;
    }

    public int getCostExperiance() {
        return costExperiance;
    }

    public int getCostEconomy() {
        return costEconomy;
    }
}