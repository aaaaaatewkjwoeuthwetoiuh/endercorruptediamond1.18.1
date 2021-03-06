package com.hazard.ecd;

import com.hazard.ecd.init.BlockInit;
import com.hazard.ecd.init.ItemInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("ecd")
public class EnderCorruptediamonds {
	
	   public static final String MOD_ID= "ecd";
	   
	   public static final CreativeModeTab ECD_TAB = new CreativeModeTab(MOD_ID) {		
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.ender_corrupted_diamond.get());
		}
	};
	
	   public EnderCorruptediamonds() {
		   IEventBus bus =  FMLJavaModLoadingContext.get().getModEventBus();
		   
		   ItemInit.ITEMS.register(bus);
		   BlockInit.BLOCKS.register(bus);
		   
		   MinecraftForge.EVENT_BUS.register(this);
	}

}
