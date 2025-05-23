
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.foxyas.changedaddon.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.foxyas.changedaddon.client.model.Modelsyringe_model;
import net.foxyas.changedaddon.client.model.Modeljack_model;
import net.foxyas.changedaddon.client.model.Modelempty_model;
import net.foxyas.changedaddon.client.model.Modelcustom_model;
import net.foxyas.changedaddon.client.model.ModelSyringe_projectile;
import net.foxyas.changedaddon.client.model.ModelProtoTypeMob;
import net.foxyas.changedaddon.client.model.ModelNewHyperFlower;
import net.foxyas.changedaddon.client.model.ModelLuminarCrystalSpearModel;
import net.foxyas.changedaddon.client.model.ModelHyper_Flower;
import net.foxyas.changedaddon.client.model.ModelHazmat_Suit;
import net.foxyas.changedaddon.client.model.ModelHazardArmorCustomArms;
import net.foxyas.changedaddon.client.model.ModelFoxyas_form;
import net.foxyas.changedaddon.client.model.ModelFoxyasModel;
import net.foxyas.changedaddon.client.model.ModelDudes_e_custom;
import net.foxyas.changedaddon.client.model.ModelDudes_e_Model;
import net.foxyas.changedaddon.client.model.ModelAccessories;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ChangedAddonModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelAccessories.LAYER_LOCATION, ModelAccessories::createBodyLayer);
		event.registerLayerDefinition(ModelHazmat_Suit.LAYER_LOCATION, ModelHazmat_Suit::createBodyLayer);
		event.registerLayerDefinition(ModelDudes_e_custom.LAYER_LOCATION, ModelDudes_e_custom::createBodyLayer);
		event.registerLayerDefinition(Modeljack_model.LAYER_LOCATION, Modeljack_model::createBodyLayer);
		event.registerLayerDefinition(Modelempty_model.LAYER_LOCATION, Modelempty_model::createBodyLayer);
		event.registerLayerDefinition(ModelHazardArmorCustomArms.LAYER_LOCATION, ModelHazardArmorCustomArms::createBodyLayer);
		event.registerLayerDefinition(ModelProtoTypeMob.LAYER_LOCATION, ModelProtoTypeMob::createBodyLayer);
		event.registerLayerDefinition(ModelNewHyperFlower.LAYER_LOCATION, ModelNewHyperFlower::createBodyLayer);
		event.registerLayerDefinition(ModelFoxyas_form.LAYER_LOCATION, ModelFoxyas_form::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(Modelsyringe_model.LAYER_LOCATION, Modelsyringe_model::createBodyLayer);
		event.registerLayerDefinition(ModelLuminarCrystalSpearModel.LAYER_LOCATION, ModelLuminarCrystalSpearModel::createBodyLayer);
		event.registerLayerDefinition(ModelDudes_e_Model.LAYER_LOCATION, ModelDudes_e_Model::createBodyLayer);
		event.registerLayerDefinition(ModelFoxyasModel.LAYER_LOCATION, ModelFoxyasModel::createBodyLayer);
		event.registerLayerDefinition(ModelHyper_Flower.LAYER_LOCATION, ModelHyper_Flower::createBodyLayer);
		event.registerLayerDefinition(ModelSyringe_projectile.LAYER_LOCATION, ModelSyringe_projectile::createBodyLayer);
	}
}
