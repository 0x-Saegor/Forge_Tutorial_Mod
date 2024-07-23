package net.arthur.tutorialmod.event;

import net.arthur.tutorialmod.TutorialMod;
import net.arthur.tutorialmod.entity.ModEntitites;
import net.arthur.tutorialmod.entity.custom.RhinoEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntitites.RHINO.get(), RhinoEntity.createAttributes().build());
    }
}
