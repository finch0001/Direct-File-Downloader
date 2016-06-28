/*
 * Created on 02-Jan-2005
 * Created by Paul Gardner
 * Copyright (C) 2004, 2005, 2006 Aelitis, All Rights Reserved.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 * 
 * AELITIS, SAS au capital de 46,603.30 euros
 * 8 Allee Lenotre, La Grille Royale, 78600 Le Mesnil le Roi, France.
 *
 */

package org.gudy.azureus2.plugins.utils.xml.rss;

import org.gudy.azureus2.plugins.utils.xml.simpleparser.SimpleXMLParserDocumentNode;

import java.net.URL;
import java.util.Date;

/**
 * @author parg
 *
 */

public interface 
RSSItem 
{
		// all attributes of an item are optional, however one of title or description must be present
	
		/**
		 * Get the item's title, null if not defined
		 */
	
	public String
	getTitle();
	
	public String
	getDescription();
	
	public URL
	getLink();
	
	public Date
	getPublicationDate();
	
	public String
	getUID();
	
		/**
		 * Gets the items underlying XML node for extraction of extensions 
		 * @return
		 */
	
	public SimpleXMLParserDocumentNode
	getNode();
}
