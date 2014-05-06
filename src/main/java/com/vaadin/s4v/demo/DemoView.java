/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.vaadin.s4v.demo;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

/**
 * @author Serkan ÖZAL
 * 
 * Contact Informations:
 * 		GitHub   : https://github.com/serkan-ozal
 * 		LinkedIn : www.linkedin.com/in/serkanozal
 */
@SuppressWarnings("serial")
public class DemoView extends VerticalLayout {

	@Autowired
	private SpringBean springBean;
	
	public DemoView() {
		Label lbl = new Label("<center>" + springBean.getMessage() + "</center>", ContentMode.HTML);
		
		addComponent(lbl);
		setComponentAlignment(lbl, Alignment.MIDDLE_CENTER);
		
		setSizeFull();
	}
	
}
