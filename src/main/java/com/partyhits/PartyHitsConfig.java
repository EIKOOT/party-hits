package com.partyhits;

import com.partyhits.util.FontTypes;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

import java.awt.*;

@ConfigGroup("partyhits")
public interface PartyHitsConfig extends Config
{
	@ConfigSection(
			name = "General",
			position = 0,
			description = "General Settings",
			closedByDefault = false
	)
	String generalSettings = "generalSettings";

	@ConfigSection(
			name = "Font",
			position = 1,
			description = "Font Options",
			closedByDefault = true
	)
	String fontSettings = "fontSettings";

	@ConfigSection(
			name = "Maiden HP Font",
			position = 2,
			description = "Maiden HP Font Settings",
			closedByDefault = true
	)
	String maidenFontSettings = "maidenFontSettings";

	@ConfigItem(
			position = 0,
			keyName = "Duration",
			name = "Hitsplat duration",
			description = "How long should the hitsplat stay for (in frames).",
			section = generalSettings
	)
	default int duration()
	{
		return 150;
	}
	@ConfigItem(
			position = 1,
			keyName = "Maiden only",
			name = "Maiden only",
			description = "Only show in the maiden room.",
			section = generalSettings
	)
	default boolean maidenOnly()
	{
		return false;
	}
	@ConfigItem(
			position = 2,
			keyName = "Show self",
			name = "Show self",
			description = "Show your own hits.",
			section = generalSettings
	)
	default boolean ownHits()
	{
		return false;
	}
	@ConfigItem(
			position = 3,
			keyName = "Show party hits",
			name = "Show party hits",
			description = "Show the hits of your party members.",
			section = generalSettings
	)
	default boolean partyHits()
	{
		return true;
	}
	@ConfigItem(
			position = 4,
			keyName = "Maiden live HP",
			name = "Maiden Live HP",
			description = "Shows maidens current hp.",
			section = generalSettings
	)
	default boolean maidenHP()
	{
		return false;
	}
	@ConfigItem(
			position = 5,
			keyName = "Height Offset",
			name = "Height Offset",
			description = "Make the hitsplat higher above the player.",
			section = fontSettings
	)
	default int offset()
	{
		return 5;
	}
	@ConfigItem(
			position = 6,
			keyName = "Horizontal Offset",
			name = "Horizontal Offset",
			description = "Adjust the horizontal offset of the text.",
			section = fontSettings
	)
	default int horOffset()
	{
		return 4;
	}
	@ConfigItem(
			position = 7,
			keyName = "Font",
			name = "Font",
			description = "Change the font of the text.",
			section = fontSettings
	)
	default FontTypes font()
	{
		return FontTypes.ARIAL;
	}
	@ConfigItem(
			position = 8,
			keyName = "Font Size",
			name = "Font Size",
			description = "Change the size of the text.",
			section = fontSettings
	)
	default int size()
	{
		return 15;
	}
	@ConfigItem(
			position = 9,
			keyName = "Text Color",
			name = "Text Color",
			description = "Change the color of the text.",
			section = fontSettings
	)
	default Color color()
	{
		return Color.WHITE;
	}
	@ConfigItem(
			position = 10,
			keyName = "Maiden Height Offset",
			name = "Maiden Height Offset",
			description = "Make the Maiden HP higher.",
			section = maidenFontSettings
	)
	default int maidenOffset()
	{
		return 10;
	}
	@ConfigItem(
			position = 11,
			keyName = "Maiden Horizontal Offset",
			name = "Maiden Horizontal Offset",
			description = "Adjust the horizontal offset of the text on maiden.",
			section = maidenFontSettings
	)
	default int maidenHorOffset()
	{
		return 15;
	}
	@ConfigItem(
			position = 12,
			keyName = "Maiden Font",
			name = "Maiden Font",
			description = "Change the font of the HP on maiden.",
			section = maidenFontSettings
	)
	default FontTypes maidenFont()
	{
		return FontTypes.ARIAL;
	}
	@ConfigItem(
			position = 13,
			keyName = "Maiden Font Size",
			name = "Maiden Font Size",
			description = "Change the size of the HP on maiden.",
			section = maidenFontSettings
	)
	default int maidenSize()
	{
		return 15;
	}
	@ConfigItem(
			position = 14,
			keyName = "Maiden Text Color",
			name = "Maiden Text Color",
			description = "Change the color of the text on maiden.",
			section = maidenFontSettings
	)
	default Color maidenColor()
	{
		return Color.GREEN;
	}
	@ConfigItem(
			position = 15,
			keyName = "Threshold colors",
			name = "Threshold colors",
			description = "Change the color based on maidens HP",
			section = maidenFontSettings
	)
	default boolean threshColor()
	{
		return false;
	}
	@ConfigItem(
			position = 16,
			keyName = "70% Color",
			name = "70% Color",
			description = "What color should maiden have under 70%",
			section = maidenFontSettings
	)
	default Color maidenSeventy()
	{
		return Color.WHITE;
	}
	@ConfigItem(
			position = 17,
			keyName = "50% Color",
			name = "50% Color",
			description = "What color should maiden have under 50%",
			section = maidenFontSettings
	)
	default Color maidenFifty()
	{
		return Color.BLUE;
	}
	@ConfigItem(
			position = 18,
			keyName = "30% Color",
			name = "30% Color",
			description = "What color should maiden have under 30%",
			section = maidenFontSettings
	)
	default Color maidenThirty()
	{
		return Color.RED;
	}

}
