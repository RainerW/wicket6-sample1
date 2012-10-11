package de.bitnoise.example.wicket.pages;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.bootstrap.Bootstrap;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebPage;

import de.bitnoise.example.wicket.component.MenuItem;
import de.bitnoise.example.wicket.component.WebMenu;

abstract public class BauBauPage extends WebPage {
	@Override
	public void renderHead(IHeaderResponse response) 
	{
		super.renderHead(response);
		
		Bootstrap.renderHead(response);
	}
	
	@Override
	protected void onInitialize() {
		super.onInitialize();
		
		List<MenuItem> primaryMenu = buildMenu();
		addPrimaryMenu(primaryMenu);
	}

	protected void addPrimaryMenu(List<MenuItem> primaryMenu) {
		add(new WebMenu("primary-menu", "Navigation", primaryMenu));
	}
	
	
	protected List<MenuItem> buildMenu() {
		ArrayList<MenuItem> root = new ArrayList<MenuItem>();
		
		root.add(new MenuItem("New VM", HomePage.class));
		root.add(new MenuItem("Templates", Templates.class));
		return root;
	}

}
