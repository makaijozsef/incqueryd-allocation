/*******************************************************************************
 * Copyright (c) 2010-2015, Andras Szabolcs Nagy and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *   Andras Szabolcs Nagy - initial API and implementation
 *******************************************************************************/
package org.eclipse.viatra.dse.statecoding;

/**
 * Interface for creating {@link IObjectsProvider} instances.
 * 
 * @author Andras Szabolcs Nagy
 */
public interface IObjectsProviderFactory {

    /**
     * Creates an {@link IObjectsProvider} implementation.
     * 
     * @return The newly created {@link IObjectsProvider}.
     */
    IObjectsProvider createObjectsProvider();

}
