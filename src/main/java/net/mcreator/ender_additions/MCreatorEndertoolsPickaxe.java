package net.mcreator.ender_additions;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@Elementsender_additions.ModElement.Tag
public class MCreatorEndertoolsPickaxe extends Elementsender_additions.ModElement {
	@ObjectHolder("ender_additions:endertoolspickaxe")
	public static final Item block = null;

	public MCreatorEndertoolsPickaxe(Elementsender_additions instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 3072;
			}

			public float getEfficiency() {
				return 18f;
			}

			public float getAttackDamage() {
				return 10f;
			}

			public int getHarvestLevel() {
				return 12;
			}

			public int getEnchantability() {
				return 84;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MCreatorEndercrystalitem.block, (int) (1)));
			}
		}, 1, -3F, new Item.Properties().group(MCreatorEnderadditions.tab)) {
		}.setRegistryName("endertoolspickaxe"));
	}
}
