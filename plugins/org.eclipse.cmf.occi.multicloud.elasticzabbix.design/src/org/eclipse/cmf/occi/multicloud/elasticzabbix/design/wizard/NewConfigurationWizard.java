/*******************************************************************************
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *******************************************************************************/

package org.eclipse.cmf.occi.multicloud.elasticzabbix.design.wizard;

import org.eclipse.cmf.occi.core.design.utils.NewDiagramWizard;

/**
 * This is a simple wizard for creating a new elasticzabbix model file.
 */

public class NewConfigurationWizard extends NewDiagramWizard
{
	public NewConfigurationWizard()
	{
		super("http://occiware.org/occi/multicloud/elasticzabbix#", "viewpoint:/org.eclipse.cmf.occi.multicloud.elasticzabbix.design/ElasticzabbixConfiguration", "elasticzabbix", "ElasticzabbixConfiguration Diagram");
	}
}
