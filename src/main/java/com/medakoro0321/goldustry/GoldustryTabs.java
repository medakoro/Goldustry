package com.medakoro0321.goldustry;

import com.medakoro0321.goldustry.item.GoldustryItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class GoldustryTabs {
    //レジストリ作成
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Goldustry.MODID);

    //レジストリにタブを追加
    public static final RegistryObject<CreativeModeTab> GOLDUSTRY_TAB = TABS.register("goldustry_tabs", () -> CreativeModeTab.builder()
            //タブ設定
            //タイトル(言語設定jsonファイルから取得)
            .title(Component.translatable("creativetabs.goldustry_tab"))
            //アイコン設定(GOLDUSTRY_TESTがアイコン)
            .icon(GoldustryItems.GOLDUSTRY_TEST.get()::getDefaultInstance)
            //アイテムを追加
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(GoldustryItems.GOLDUSTRY_TEST.get());
            })
            .build());

    //レジストリをイベントバスに登録
    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }



}
