package de.bitnoise.example.wicket.component;

import java.util.List;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.markup.repeater.RepeatingView;

public class WebMenu extends Panel {

	public WebMenu(String id,String name, List<MenuItem> items) {
		super(id);
		add(new Label("name",name));
		
		RepeatingView view = new RepeatingView("menu-items");
		for(MenuItem item : items) {
			view.add(new WebMenuItem(view.newChildId(), item));
		}
		
       add(view);

	}

}
