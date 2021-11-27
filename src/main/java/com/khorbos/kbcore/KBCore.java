package com.khorbos.kbcore;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(KBCore.ID)
public class KBCore
{
    public static final String ID = "kbcore";
    public static final String NAME = "KBCore";
    private static final Logger LOGGER = LogManager.getLogger();

    public KBCore() {}

    private void setup(final FMLCommonSetupEvent event) {}

    private void doClientStuff(final FMLClientSetupEvent event) {}
}
