package net.blacklab.lib.minecraft.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemUtil {
	
	public static Item getItemByStringId(String id){
		return Item.REGISTRY.getObject(new ResourceLocation(id));
	}

	public static boolean isHelm(ItemStack stack){
		if(!stack.isEmpty()){
			if(stack.getItem() instanceof ItemArmor){
				if(((ItemArmor)stack.getItem()).armorType == EntityEquipmentSlot.HEAD){
					return true;
				}
			}
		}
		return false;
	}

}
