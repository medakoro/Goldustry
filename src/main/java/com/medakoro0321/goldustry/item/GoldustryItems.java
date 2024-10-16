package com.medakoro0321.goldustry.item;

import com.medakoro0321.goldustry.Goldustry;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GoldustryItems {
    //レジストリ作成
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Goldustry.MODID);

    //レジストリにアイテムを追加
    public static final RegistryObject<Item> GOLDUSTRY_TEST = ITEMS.register("goldustry_test", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        //レジストリをイベントバスに登録
        ITEMS.register(eventBus);
    }
}
