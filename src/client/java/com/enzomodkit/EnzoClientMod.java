package com.enzomodkit;

import net.fabricmc.api.ClientModInitializer;

public class EnzoClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("Hi, I am Enzo Mod! I am loaded.");
    }
}
