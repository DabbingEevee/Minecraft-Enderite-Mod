package net.enderitemc.enderitemod.misc;

import net.minecraft.world.item.Item;
import net.minecraft.tags.Tag;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;

public class EnderiteTag {
        public static final TagKey<Item> ENDERITE_ITEM = ItemTags
        		.create(new ResourceLocation("enderitemod", "enderite_items"));

        public static final TagKey<Item> CRAFTABLE_SHULKER_BOXES = ItemTags
        		.create(new ResourceLocation("enderitemod", "enderite_items"));

        public static final TagKey<Item> ENDERITE_ELYTRAS = ItemTags
        		.create(new ResourceLocation("enderitemod", "enderite_items"));
}