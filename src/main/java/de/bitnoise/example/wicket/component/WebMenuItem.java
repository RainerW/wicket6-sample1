package de.bitnoise.example.wicket.component;

import org.apache.wicket.Page;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxFallbackLink;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.Model;

public class WebMenuItem extends Panel {

	public WebMenuItem(String id, MenuItem item) {
		super(id,Model.of(item));
	}

	@Override
	protected void onInitialize() {
		super.onInitialize();
		
		final MenuItem item = (MenuItem) getDefaultModelObject();
		
		AjaxFallbackLink<String> link = new AjaxFallbackLink<String>("link") {
			@Override
			public void onClick(AjaxRequestTarget target) {
				setResponsePage(item.getPageRef());
			}
		};

		Label text = new Label("text", item.getTextId());
		add(link);
		link.add(text);

	}

}
