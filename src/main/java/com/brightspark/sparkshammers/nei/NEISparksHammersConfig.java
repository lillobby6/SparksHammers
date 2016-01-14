package com.brightspark.sparkshammers.nei;

import codechicken.nei.api.API;
import codechicken.nei.api.IConfigureNEI;
import com.brightspark.sparkshammers.reference.Reference;

public class NEISparksHammersConfig implements IConfigureNEI
{
    @Override
    public void loadConfig()
    {
        //Register handlers and hide any unwanted items in NEI here

        //API.hideItem();

        API.registerRecipeHandler(new NEIHammerCraftRecipeHandler());
        API.registerUsageHandler(new NEIHammerCraftRecipeHandler());
    }

    @Override
    public String getName()
    {
        return Reference.MOD_NAME;
    }

    @Override
    public String getVersion()
    {
        return Reference.VERSION;
    }
}
