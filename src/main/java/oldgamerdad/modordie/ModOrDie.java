package oldgamerdad.modordie;

import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import oldgamerdad.modordie.proxy.CommonProxy;
import oldgamerdad.modordie.util.Reference;
import oldgamerdad.modordie.proxy.ClientProxy;

import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, useMetadata = true)
public class ModOrDie {

    @Mod.Instance
    public static ModOrDie instance;

    public static Logger logger;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event) {

        logger = event.getModLog();
        proxy.preInit(event);

    }

    @Mod.EventHandler
    public static void Init(FMLInitializationEvent event) {

        proxy.init(event);

    }

    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent event) {

        proxy.postInit(event);

    }

}
