package net.arthur.tutorialmod.item.custom;

import net.arthur.tutorialmod.util.ModTags;
import net.minecraft.advancements.critereon.LightningStrikeTrigger;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LightningRodBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3d;

import java.util.List;

public class LightningStaff extends Item {
    public LightningStaff(Properties pProperties){
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(!pContext.getLevel().isClientSide()){
            BlockPos positionClicked = pContext.getClickedPos();

            LightningBolt bolt = (LightningBolt) EntityType.LIGHTNING_BOLT.create(pContext.getLevel());
            bolt.moveTo(Vec3.atBottomCenterOf(positionClicked.above()));
            pContext.getLevel().addFreshEntity(bolt);


        }
        return InteractionResult.SUCCESS;
    }
}
