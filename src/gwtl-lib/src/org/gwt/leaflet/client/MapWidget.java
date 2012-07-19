/********************************************************************
 * 
 * MapWidget.java is part of gwt-leaflet. 
 * 
 * Copyright (c) 2012, DISCO Foundation. All rights reserved.
 * 
 * gwt-leaflet is free software: you can redistribute it and/or modify 
 * it under the terms of the GNU General Public License as published 
 * by the Free Software Foundation, either version 3 of the License, 
 * or (at your option) any later version.
 * 
 * gwt-leaflet is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 * 
 * See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License 
 * along with gwt-leaflet. If not, see http://www.gnu.org/licenses.
 * 
 *********************************************************************/
package org.gwt.leaflet.client;

import org.gwt.leaflet.api.Map;
import org.gwt.leaflet.api.MapException;
import org.gwt.leaflet.api.MapFactory;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

/**
 * @author kennethg
 *
 */
public class MapWidget extends Composite {
	
	private final String name;
	
	private Map map;
	
	/**
	 * Default constructor
	 * 
	 * @wbp.parser.constructor
	 */
	public MapWidget() {
		this("map");
	}
	
	public MapWidget(String name) {
		
		this.name = name;
		
		// Show it in a 'div' element
		initWidget(new HTMLPanel("<div id=\""+name+"\" style=\"width:100%; height: 100%\">MapWidget: " + name + "</div>"));
		
	}
	
//	public Map getMap() {
//		return map;
//	}
//	
//	public void setMap(Map map) {
//		if(!name.equals(map.getName()))
//			throw new MapException("Map name mismatch. " +
//					"Expected " + name + ", found " + map.getName());
//		this.map = map;
//	}
	
	

}
