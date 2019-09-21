package com.lol.vmod.init;


import java.util.ArrayList;
import com.lol.vmod.client.Modeled;
import com.lol.vmod.items.tools.NewArrow;
import com.lol.vmod.items.tools.NewBow;
import com.lol.vmod.items.tools.ToolCrossbow;
import com.lol.vmod.items.tools.ToolCrossbow2;



public class ModItems 
{
	  public static ArrayList<Modeled> MODELED = new ArrayList<>();
	//items


	
	//Tools
	public static final ToolCrossbow CROSSBOW = new ToolCrossbow("crossbow", null );
	public static final ToolCrossbow2 CROSSBOW2 = new ToolCrossbow2("crossbow2", null );
	public static final NewArrow NEWARROW = new NewArrow("newarrow", null );
	public static final NewBow NEWBOW = new NewBow("newbow", null );

}

	
	