package com.lilithsthrone.game.character.body.types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.lilithsthrone.game.character.GameCharacter;
import com.lilithsthrone.game.character.body.Body;
import com.lilithsthrone.game.character.body.valueEnums.OrificeModifier;
import com.lilithsthrone.game.character.race.Race;
import com.lilithsthrone.game.dialogue.utils.UtilText;
import com.lilithsthrone.game.sex.OrificeType;
import com.lilithsthrone.game.sex.Sex;
import com.lilithsthrone.main.Main;
import com.lilithsthrone.utils.Util;

/**
 * @since 0.1.0
 * @version 0.2.1
 * @author Innoxia
 */
public enum VaginaType implements BodyPartTypeInterface {

	NONE(null, FluidType.GIRL_CUM_HUMAN, null),

	HUMAN(BodyCoveringType.VAGINA, FluidType.GIRL_CUM_HUMAN, Race.HUMAN),

	ANGEL(BodyCoveringType.VAGINA, FluidType.GIRL_CUM_ANGEL, Race.ANGEL, OrificeModifier.MUSCLE_CONTROL),

	DEMON_COMMON(BodyCoveringType.VAGINA, FluidType.GIRL_CUM_DEMON, Race.DEMON, OrificeModifier.MUSCLE_CONTROL, OrificeModifier.TENTACLED),

	IMP(BodyCoveringType.VAGINA, FluidType.GIRL_CUM_IMP, Race.IMP, OrificeModifier.MUSCLE_CONTROL, OrificeModifier.TENTACLED),

	DOG_MORPH(BodyCoveringType.VAGINA, FluidType.GIRL_CUM_DOG_MORPH, Race.DOG_MORPH),

	WOLF_MORPH(BodyCoveringType.VAGINA, FluidType.GIRL_CUM_WOLF_MORPH, Race.WOLF_MORPH),

	SQUIRREL_MORPH(BodyCoveringType.VAGINA, FluidType.GIRL_CUM_SQUIRREL_MORPH, Race.SQUIRREL_MORPH),
	
	ALLIGATOR_MORPH(BodyCoveringType.VAGINA, FluidType.GIRL_CUM_ALLIGATOR_MORPH, Race.ALLIGATOR_MORPH),
	
	CAT_MORPH(BodyCoveringType.VAGINA, FluidType.GIRL_CUM_CAT_MORPH, Race.CAT_MORPH),

	COW_MORPH(BodyCoveringType.VAGINA, FluidType.GIRL_CUM_COW_MORPH, Race.COW_MORPH),

	HORSE_MORPH(BodyCoveringType.VAGINA, FluidType.GIRL_CUM_HORSE_MORPH, Race.HORSE_MORPH, OrificeModifier.PUFFY),

	REINDEER_MORPH(BodyCoveringType.VAGINA, FluidType.GIRL_CUM_REINDEER_MORPH, Race.REINDEER_MORPH, OrificeModifier.PUFFY),

	HARPY(BodyCoveringType.VAGINA, FluidType.GIRL_CUM_HARPY, Race.HARPY);

	private BodyCoveringType skinType;
	private FluidType fluidType;
	private Race race;
	private List<OrificeModifier> defaultRacialOrificeModifiers;

	private VaginaType(BodyCoveringType skinType, FluidType fluidType, Race race, OrificeModifier... defaultRacialOrificeModifiers) {
		this.skinType = skinType;
		this.fluidType = fluidType;
		this.race = race;
		
		this.defaultRacialOrificeModifiers = new ArrayList<>();
		Collections.addAll(this.defaultRacialOrificeModifiers, defaultRacialOrificeModifiers);
	}

	@Override
	public String getDeterminer(GameCharacter gc) {
		return "";
	}
	
	@Override
	public boolean isDefaultPlural() {
		return false;
	}
	
	@Override
	public String getNameSingular(GameCharacter gc) {
		if(gc.isVaginaVirgin()) {
			switch(this){
				case HORSE_MORPH:
					return UtilText.returnStringAtRandom("cherry", "cunt", "kitty", "pussy", "sex", "slit", "twat", "horse-pussy");
				case NONE:
					return "";
				default:
					return UtilText.returnStringAtRandom("cherry", "cunt", "kitty", "pussy", "sex", "slit", "twat");
			}
			
		} else {
			switch(this){
				case HORSE_MORPH:
					return UtilText.returnStringAtRandom("cunt", "kitty", "pussy", "sex", "slit", "twat", "horse-pussy");
				case NONE:
					return "";
				default:
					return UtilText.returnStringAtRandom("cunt", "kitty", "pussy", "sex", "slit", "twat");
			}
		}
	}
	
	@Override
	public String getNamePlural(GameCharacter gc) {
		if(gc.isVaginaVirgin()) {
			switch(this){
				case HORSE_MORPH:
					return UtilText.returnStringAtRandom("cherries", "cunts", "kitties", "pussies", "sex", "slits", "twats", "horse-pussies");
				case NONE:
					return "";
				default:
					return UtilText.returnStringAtRandom("cherries", "cunts", "kitties", "pussies", "sex", "slits", "twats");
			}
			
		} else {
			switch(this){
				case HORSE_MORPH:
					return UtilText.returnStringAtRandom("cunts", "kitties", "pussies", "sex", "slits", "twats", "horse-pussies");
				case NONE:
					return "";
				default:
					return UtilText.returnStringAtRandom("cunts", "kitties", "pussies", "sex", "slits", "twats");
			}
		}
	}

	@Override
	public String getDescriptor(GameCharacter gc) {
		// Randomly give a type-specific, wetness, or capacity descriptor:
		switch(Util.random.nextInt(3)){
			case 0:
				switch(this){
					case ANGEL:
						return UtilText.returnStringAtRandom("perfect");
					case DEMON_COMMON:
						return UtilText.returnStringAtRandom("irresistible", "demonic");
					case IMP:
						return UtilText.returnStringAtRandom("irresistible", "impish");
					case DOG_MORPH:
						return UtilText.returnStringAtRandom("hot", "animalistic", "dog-like", "canine");
					case WOLF_MORPH:
						return UtilText.returnStringAtRandom("hot", "animalistic", "wolf-like", "lupine");
					case CAT_MORPH:
						return UtilText.returnStringAtRandom("hot", "animalistic", "cat-like", "feline");
					case COW_MORPH:
						return UtilText.returnStringAtRandom("hot", "animalistic", "cow-like", "bovine");
					case ALLIGATOR_MORPH:
						return UtilText.returnStringAtRandom("hot", "alligator-like", "reptilian");
					case HORSE_MORPH:
						return UtilText.returnStringAtRandom("hot", "animalistic", "equine");
					case REINDEER_MORPH:
						return UtilText.returnStringAtRandom("hot", "animalistic", "reindeer-like", "rangiferine");
					case HUMAN:
						return UtilText.returnStringAtRandom("hot");
					case NONE:
						return UtilText.returnStringAtRandom("");
					case HARPY:
						return UtilText.returnStringAtRandom("hot", "bird-like", "avian");
					case SQUIRREL_MORPH:
						return UtilText.returnStringAtRandom("hot", "squirrel-like", "rodent");
				}
				return "";
			case 1:
				if(Main.game.isInSex()) {
					if(!Sex.getWetOrificeTypes(gc).get(OrificeType.VAGINA).isEmpty()) {
						return "wet";
					} else {
						return gc.getVaginaWetness().getDescriptor();
					}
				} else {
					return gc.getVaginaWetness().getDescriptor();
				}
			default:
				return gc.getVaginaCapacity().getDescriptor();
		}
		
	}

	public String getTransformName() {
		switch(this){
			case ANGEL:
				return "angelic";
			case HARPY:
				return "avian";
			case COW_MORPH:
				return "bovine";
			case DOG_MORPH:
				return "canine";
			case DEMON_COMMON:
				return "demonic";
			case IMP:
				return "impish";
			case HORSE_MORPH:
				return "equine";
			case REINDEER_MORPH:
				return "rangiferine";
			case CAT_MORPH:
				return "feline";
			case HUMAN:
				return "human";
			case NONE:
				return "none";
			case SQUIRREL_MORPH:
				return "squirrel";
			case ALLIGATOR_MORPH:
				return "alligator";
			case WOLF_MORPH:
				return "lupine";
		}
		return "";
	}
	
	@Override
	public BodyCoveringType getBodyCoveringType(Body body) {
		return skinType;
	}
	
	@Override
	public Race getRace() {
		return race;
	}

	public FluidType getFluidType() {
		return fluidType;
	}

	public List<OrificeModifier> getDefaultRacialOrificeModifiers() {
		return defaultRacialOrificeModifiers;
	}
	
}
