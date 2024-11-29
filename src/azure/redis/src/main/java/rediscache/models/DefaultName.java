// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package rediscache.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for DefaultName.
 */
public final class DefaultName extends ExpandableStringEnum<DefaultName> {
    /**
     * Static value default for DefaultName.
     */
    public static final DefaultName DEFAULT = fromString("default");

    /**
     * Creates a new instance of DefaultName value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DefaultName() {
    }

    /**
     * Creates or finds a DefaultName from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DefaultName.
     */
    public static DefaultName fromString(String name) {
        return fromString(name, DefaultName.class);
    }

    /**
     * Gets known DefaultName values.
     * 
     * @return known DefaultName values.
     */
    public static Collection<DefaultName> values() {
        return values(DefaultName.class);
    }
}
