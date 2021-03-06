package oldgamerdad.modordie.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import oldgamerdad.modordie.ModOrDie;
import oldgamerdad.modordie.init.ModBlocks;
import oldgamerdad.modordie.init.ModItems;
import oldgamerdad.modordie.util.IHasModel;

public class BlockBase extends Block implements IHasModel {

   public BlockBase(String name, Material material) {

       super(material);
       setUnlocalizedName(name);
       setRegistryName(name);
       setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

       ModBlocks.BLOCKS.add(this);
       ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

   }

    @Override
    public void registerModels() {

        ModOrDie.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");

    }
}
