package com.tooloverhaul;

import com.tooloverhaul.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TOGlobal.MOD_ID, name = TOGlobal.MOD_NAME, version = TOGlobal.VERSION)
public class Main {

    @Mod.Instance(TOGlobal.MOD_ID)
    public static Main instance;
    @SidedProxy(clientSide = TOGlobal.TO_CLIENT_PROXY, serverSide = TOGlobal.TO_COMMON_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preEvent){
        this.proxy.preInit(preEvent);

    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        this.proxy.init(event);
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent postEvent){
        this.proxy.postInit(postEvent);
    }


}
