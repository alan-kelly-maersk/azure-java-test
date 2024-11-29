// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package rediscache.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Whether or not public endpoint access is allowed for this cache. Value is optional but if passed in, must be
 * 'Enabled' or 'Disabled'. If 'Disabled', private endpoints are the exclusive access method. Default value is
 * 'Enabled'.
 */
public final class PublicNetworkAccess extends ExpandableStringEnum<PublicNetworkAccess> {
    /**
     * Static value Enabled for PublicNetworkAccess.
     */
    public static final PublicNetworkAccess ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for PublicNetworkAccess.
     */
    public static final PublicNetworkAccess DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of PublicNetworkAccess value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PublicNetworkAccess() {
    }

    /**
     * Creates or finds a PublicNetworkAccess from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PublicNetworkAccess.
     */
    public static PublicNetworkAccess fromString(String name) {
        return fromString(name, PublicNetworkAccess.class);
    }

    /**
     * Gets known PublicNetworkAccess values.
     * 
     * @return known PublicNetworkAccess values.
     */
    public static Collection<PublicNetworkAccess> values() {
        return values(PublicNetworkAccess.class);
    }
}