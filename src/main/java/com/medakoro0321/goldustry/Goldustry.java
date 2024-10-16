package com.medakoro0321.goldustry;

import com.medakoro0321.goldustry.item.GoldustryItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// この値は、META-INF/mods.tomlファイルのエントリと一致する必要があります。
@Mod(Goldustry.MODID)
public class Goldustry {
    // すべての人が参照できるように、共通の場所にMOD IDを定義する。
    public static final String MODID = "goldustry";

    // slf4j ロガーを直接参照する<<????
    private static final Logger LOGGER = LogUtils.getLogger();


    //Javaファイル名にする(public <Java File Name>())
    public Goldustry() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();


        //アイテム追加レジストリ
        GoldustryItems.register(modEventBus);
        //クリエタブ追加レジストリ
        GoldustryTabs.register(modEventBus);

        // modloading用のcommonSetupメソッドを登録する。
        modEventBus.addListener(this::commonSetup);


        // 興味のあるサーバーやその他のゲームイベントに登録する。
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

}
