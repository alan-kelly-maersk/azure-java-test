// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package rediscache.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The SKU family to use. Valid values: (C, P). (C = Basic/Standard, P = Premium).
 */
public final class SkuFamily extends ExpandableStringEnum<SkuFamily> {
    /**
     * Static value C for SkuFamily.
     */
    public static final SkuFamily C = fromString("C");

    /**
     * Static value P for SkuFamily.
     */
    public static final SkuFamily P = fromString("P");

    /**
     * Creates a new instance of SkuFamily value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SkuFamily() {
    }

    /**
     * Creates or finds a SkuFamily from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SkuFamily.
     */
    public static SkuFamily fromString(String name) {
        return fromString(name, SkuFamily.class);
    }

    /**
     * Gets known SkuFamily values.
     * 
     * @return known SkuFamily values.
     */
    public static Collection<SkuFamily> values() {
        return values(SkuFamily.class);
    }
}
