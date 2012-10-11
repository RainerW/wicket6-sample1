package de.bitnoise.example.wicket.component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.Page;

public class MenuItem implements Serializable{

	String textId;
	Class<? extends Page> pageRef;
	List<MenuItem> children;

	public MenuItem(String text, Class<? extends Page> target) {
		pageRef = target;
		textId = text;
	}

	public String getTextId() {
		return textId;
	}

	public Class<? extends Page> getPageRef() {
		return pageRef;
	}

	public List<MenuItem> getChildren() {
		if (children == null) {
			return new ArrayList<MenuItem>();
		}
		return children;
	}
}
